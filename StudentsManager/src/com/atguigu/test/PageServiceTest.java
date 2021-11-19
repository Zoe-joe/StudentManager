package com.atguigu.test;


import com.atguigu.service.PageScoreService;
import com.atguigu.service.impl.PageScoreServiceImpl;
import org.junit.Test;

public class PageServiceTest {
    @Test
    public void page(){
        PageScoreService pageScoreService =new PageScoreServiceImpl();
        System.out.println(pageScoreService.page(2));
    }
    @Test
    public void pagetest(){
        PageScoreService pageScoreService =new PageScoreServiceImpl();
        System.out.println(pageScoreService.queryScore("2018440001","高数一"));
    }
}
