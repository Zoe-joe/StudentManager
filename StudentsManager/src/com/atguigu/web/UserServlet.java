package com.atguigu.web;

import com.atguigu.pojo.User;
import com.atguigu.service.impl.UserServiceImpl;
import com.atguigu.service.UserService;
import com.atguigu.utils.WebUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.lang.reflect.Method;

public class UserServlet extends HttpServlet {
    private UserService userService = new UserServiceImpl();

    protected void login(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        User user = WebUtils.copyParamBean(req.getParameterMap(), new User());

        if (userService.login(user) == null) {
            req.setAttribute("msg", "用户名或密码错误");
            req.setAttribute("username", user.getUsername());
            req.getRequestDispatcher("pages/user/login.jsp").forward(req, resp);
        } else {
            HttpSession session = req.getSession();
            switch (user.getRole()) {
                case "student":
                    session.setAttribute("student", user.getUsername());
                    session.setAttribute("action", "queryStudent");
                    session.setAttribute("type", "student");
                    resp.sendRedirect("s_infoServlet");
                    break;
                case "teacher":
                    session.setAttribute("teacher", user.getUsername());
                    session.setAttribute("action", "load");
                    session.setAttribute("type", "teacher");
                    resp.sendRedirect("teacherServlet");
                    break;
                case "root":
                    session.setAttribute("root", user.getUsername());
                    session.setAttribute("action", "load");
                    session.setAttribute("type", "root");
                    resp.sendRedirect("rootServlet");
                    break;
            }

        }
    }

    protected void regist(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        User user = WebUtils.copyParamBean(req.getParameterMap(), new User());

        if ("abcde".equals(req.getParameter("code"))) {
            if (userService.existsUsername(user.getUsername(), user.getRole())) {

                req.setAttribute("msg", "你输入的用户名已存在");
                req.setAttribute("username", user.getUsername());
                req.setAttribute("email", user.getEmail());

                System.out.println("你输入的用户名[" + user.getUsername() + "]已存在！");
                req.getRequestDispatcher("pages/user/regist.jsp").forward(req, resp);
            } else {
                if (user.getPassword().equals(req.getParameter("repwd"))) {
                    userService.registUser(user);
                    req.getRequestDispatcher("pages/user/login.jsp").forward(req, resp);
                } else {
                    req.setAttribute("msg", "你输入的密码不一致");
                    req.setAttribute("username", user.getUsername());
                    req.setAttribute("email", user.getEmail());
                    req.getRequestDispatcher("pages/user/regist.jsp").forward(req, resp);
                }
            }
        } else {

            req.setAttribute("msg", "你输入的验证码错误");
            req.setAttribute("username", user.getUsername());
            req.setAttribute("email", user.getEmail());

            System.out.println("你输入的验证码[" + req.getParameter("code") + "]有误");
            req.getRequestDispatcher("pages/user/regist.jsp").forward(req, resp);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        Method Method = null;
        try {
            Method = this.getClass().getDeclaredMethod(action, HttpServletRequest.class, HttpServletResponse.class);
            System.out.println(Method);
            Method.invoke(this, req, resp);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}