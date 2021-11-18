package com.atguigu.web;

import com.atguigu.pojo.Root;
import com.atguigu.service.RootService;
import com.atguigu.service.impl.RootServiceImpl;
import com.atguigu.utils.WebUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.lang.reflect.Method;

public class RootServlet extends HttpServlet {
    private RootService rootService=new RootServiceImpl();
    protected void load(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        Root root =rootService.loadRoot((String)session.getAttribute("root"));
        if(root==null){
            System.out.println("我在这里");
            req.setAttribute("msg", "请联系老师添加个人信息");
            req.getRequestDispatcher("pages/user/login.jsp").forward(req, resp);
        }else{
            req.setAttribute("root",root);
            req.getRequestDispatcher("pages/user/root.jsp").forward(req,resp);
        }
    }
    protected void update(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Root root = WebUtils.copyParamBean(req.getParameterMap(),new Root());
        rootService.updateRoot(root);
        load(req,resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        String action =(String)session.getAttribute("action");
        Method Method = null;
        try {
            Method = this.getClass().getDeclaredMethod(action,HttpServletRequest.class,HttpServletResponse.class);
            System.out.println(Method);
            Method.invoke(this,req,resp);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html; charset=UTF-8");
        String action = req.getParameter("action");
        Method Method = null;
        try {
            Method = this.getClass().getDeclaredMethod(action,HttpServletRequest.class,HttpServletResponse.class);
            System.out.println(Method);
            Method.invoke(this,req,resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
