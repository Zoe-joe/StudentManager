package com.atguigu.service;

import com.atguigu.pojo.ScoreList;

import java.util.List;

public interface ScoreListService {
    /**
     * 根据学号查询成绩
     * @param studentID
     * @return
     */
    public List<ScoreList> queryScore(String studentID);
}
