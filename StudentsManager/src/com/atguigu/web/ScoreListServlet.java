package com.atguigu.web;


import com.atguigu.pojo.ScoreList;
import com.atguigu.service.ScoreListService;
import com.atguigu.service.impl.ScoreListServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.List;

public class ScoreListServlet extends HttpServlet {
    protected void queryScoreList(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ScoreListService scoreListService=new ScoreListServiceImpl();
        HttpSession session = req.getSession();
        List<ScoreList> scorelist =scoreListService.queryScore((String) session.getAttribute("student"));
        if (scorelist==null){
            System.out.println("我在这里");
            req.setAttribute("msg", "请联系老师添加个人信息");
            req.getRequestDispatcher("pages/user/login.jsp").forward(req, resp);
        }else {
            req.setAttribute("scorelist",scorelist);
            req.getRequestDispatcher("pages/manager/scoreList.jsp").forward(req,resp);
        }

    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
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
