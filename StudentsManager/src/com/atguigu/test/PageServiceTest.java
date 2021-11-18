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
}
