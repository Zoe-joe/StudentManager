package com.atguigu.web;

import com.atguigu.pojo.S_information;
import com.atguigu.service.S_InformationService;
import com.atguigu.service.impl.S_informationServiceImpl;
import com.atguigu.utils.WebUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.lang.reflect.Method;

public class S_infoServlet extends HttpServlet {
    private S_InformationService s_infoservice=new S_informationServiceImpl();

    protected void queryStudent(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        resp.setContentType("text/html; charset=UTF-8");
        HttpSession session = req.getSession();
        S_information s_information = s_infoservice.loadStudent((String)session.getAttribute("student"));
        if(s_information ==null){
            System.out.println("我在这里");
            req.setAttribute("msg", "请联系老师添加个人信息");
            req.getRequestDispatcher("pages/user/login.jsp").forward(req, resp);
        }else{
            req.setAttribute("s_information",s_information);
            req.getRequestDispatcher("pages/user/student.jsp").forward(req,resp);
        }

    }
    protected void updateStudent(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            S_information s_information = WebUtils.copyParamBean(req.getParameterMap(),new S_information());
            s_infoservice.updateStudent(s_information);
            queryStudent(req,resp);
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
}
