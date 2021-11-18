package com.atguigu.service.impl;

import com.atguigu.dao.RootDao;
import com.atguigu.dao.impl.RootDaoImpl;
import com.atguigu.pojo.Root;
import com.atguigu.service.RootService;

public class RootServiceImpl implements RootService {
    private RootDao rootDao=new RootDaoImpl();
    @Override
    public void updateRoot(Root root) {
        rootDao.saveRoot(root);
    }

    @Override
    public Root loadRoot(String rootID) {
        return rootDao.queryTeacherByRootID(rootID);
    }
}
