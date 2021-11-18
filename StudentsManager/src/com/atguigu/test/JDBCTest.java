package com.atguigu.test;

import com.atguigu.dao.impl.S_informationDaoImpl;
import com.atguigu.dao.impl.UserDaoImpl;
import com.atguigu.pojo.S_information;
import com.atguigu.pojo.User;
import com.atguigu.service.ScoreListService;
import com.atguigu.service.impl.ScoreListServiceImpl;
import org.junit.Test;

public class JDBCTest {
    @Test
    public void UserDaoImplTest() {
        UserDaoImpl userDao = new UserDaoImpl();
        User user = userDao.queryUserByUsernameAndRole("admin", "student");
        System.out.println(user);
    }
    @Test
    public void  S_informationDaoImplTest(){
        S_informationDaoImpl s_informationDao = new S_informationDaoImpl();
        System.out.println(s_informationDao.saveStudent(new S_information( null,"2018440010","小圣","男","物联网","大一","18688886666","2018440010@qq.com","china","static/img/default.png")));
    }
    @Test
    public void queryInformation(){
        S_informationDaoImpl s_informationDao = new S_informationDaoImpl();
        System.out.println(s_informationDao.queryInformationByUsername("2018440001"));
    }
    @Test
    public void  ScoreListTest(){
        ScoreListService scoreListService=new ScoreListServiceImpl();
        System.out.println(scoreListService.queryScore("2018440001"));
    }

}
