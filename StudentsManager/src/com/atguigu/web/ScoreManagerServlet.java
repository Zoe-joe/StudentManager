package com.atguigu.web;

import com.atguigu.pojo.Page;
import com.atguigu.pojo.ScoreList;
import com.atguigu.service.PageScoreService;
import com.atguigu.service.impl.PageScoreServiceImpl;
import com.atguigu.utils.WebUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.Method;

public class ScoreManagerServlet extends HttpServlet {
    private PageScoreService pageScoreService=new PageScoreServiceImpl();

    protected void load(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int pageNo = WebUtils.parseInt(req.getParameter("pageNo"), 1);
        Page<ScoreList> page = pageScoreService.page(pageNo);
        req.setAttribute("page",page);
        req.getRequestDispatcher("pages/manager/scoreManager.jsp").forward(req,resp);
    }
    protected void update(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ScoreList scoreList = WebUtils.copyParamBean(req.getParameterMap(), new ScoreList());
        pageScoreService.update(scoreList);
        load(req,resp);
    }
    protected void delete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = WebUtils.parseInt(req.getParameter("id"), 0);
        pageScoreService.deleteScore(id);
        resp.sendRedirect(req.getContextPath() + "scoreManagerServlet?action=load");
    }
    protected void add(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ScoreList scoreList = WebUtils.copyParamBean(req.getParameterMap(), new ScoreList());
        pageScoreService.addScore(scoreList);
        load(req,resp);
    }
    protected void queryScore(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ScoreList scoreList = pageScoreService.queryScore(req.getParameter("studentID"), req.getParameter("subject"));
        req.setAttribute("scoreList",scoreList);
        req.getRequestDispatcher("pages/manager/score_edit.jsp").forward(req,resp);
    }

//    protected void queryScores(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        pageScoreService.queryScores(req.getParameter("studentID"));
//    }
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

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
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
