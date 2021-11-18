package com.atguigu.web;

import com.atguigu.pojo.Teacher;
import com.atguigu.service.TeacherService;
import com.atguigu.service.impl.TeacherServiceImpl;
import com.atguigu.utils.WebUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.lang.reflect.Method;

public class TeacherServlet extends HttpServlet {
    private TeacherService teacherService=new TeacherServiceImpl();

    protected void load(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        Teacher teacher =teacherService.loadTeacher((String)session.getAttribute("teacher"));
        if(teacher==null){
            System.out.println("我在这里");
            req.setAttribute("msg", "请联系老师添加个人信息");
            req.getRequestDispatcher("pages/user/login.jsp").forward(req, resp);
        }else{
            req.setAttribute("teacher",teacher);
            req.getRequestDispatcher("pages/user/teacher.jsp").forward(req,resp);
        }
    }

    protected void update(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Teacher teacher = WebUtils.copyParamBean(req.getParameterMap(),new Teacher());
        teacherService.updateTeacher(teacher);
        load(req,resp);
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
