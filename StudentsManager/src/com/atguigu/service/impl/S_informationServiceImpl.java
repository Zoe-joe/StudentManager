package com.atguigu.service.impl;

import com.atguigu.dao.S_informationDao;
import com.atguigu.dao.impl.S_informationDaoImpl;
import com.atguigu.pojo.S_information;
import com.atguigu.service.S_InformationService;

public class S_informationServiceImpl implements S_InformationService {
    private S_informationDao s_informationDao =new S_informationDaoImpl();
    @Override
    public void updateStudent(S_information s_information) {
        s_informationDao.saveStudent(s_information);
    }

    @Override
    public S_information loadStudent(String username) {
        return s_informationDao.queryInformationByUsername(username);
    }
}
