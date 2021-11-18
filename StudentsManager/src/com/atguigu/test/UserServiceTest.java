package com.atguigu.test;

import com.atguigu.pojo.Root;
import com.atguigu.pojo.Teacher;
import com.atguigu.pojo.User;
import com.atguigu.service.RootService;
import com.atguigu.service.TeacherService;
import com.atguigu.service.impl.RootServiceImpl;
import com.atguigu.service.impl.TeacherServiceImpl;
import com.atguigu.service.impl.UserServiceImpl;
import org.junit.Test;

public class UserServiceTest {
    @Test
    public void loginTest() {
        UserServiceImpl userService = new UserServiceImpl();
        User login = userService.login(new User(null, "admin", "123456", null, "student"));
        System.out.println(login);
    }
    @Test
    public void registTest() {
        UserServiceImpl userService = new UserServiceImpl();
        userService.registUser(new User(null, "admin", "123456", null, "student"));
    }
    @Test
    public void TeacherTest(){
        TeacherService teacherService =new TeacherServiceImpl();
//        System.out.println(teacherService.loadTeacher("2100440001"));
        teacherService.updateTeacher(new Teacher(null,"2100440001","李老师","男","物联网","1801","13688880001","2100440001@qq.com","China","static/img/default4.gif","c语言编程"));
    }
    @Test
    public void RootTest(){
        RootService rootService =new RootServiceImpl();
//        System.out.println(rootService.loadRoot("admin"));
        rootService.updateRoot(new Root(null,"admin","管理员1","13600001112","admin@qq.com","static/img/default7.gif"));
    }
}
