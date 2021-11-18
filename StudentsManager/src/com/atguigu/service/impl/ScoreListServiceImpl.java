package com.atguigu.service.impl;


import com.atguigu.dao.ScoreListDao;
import com.atguigu.dao.impl.ScoreListDaoImpl;
import com.atguigu.pojo.ScoreList;
import com.atguigu.service.ScoreListService;

import java.util.List;

public class ScoreListServiceImpl implements ScoreListService {
    private ScoreListDao scoreListDao =new ScoreListDaoImpl();

    @Override
    public List<ScoreList> queryScore(String studentID) {
        return scoreListDao.queryScoreByStudentID(studentID);
    }
}
