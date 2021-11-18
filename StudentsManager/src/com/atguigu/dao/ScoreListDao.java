package com.atguigu.dao;

import com.atguigu.pojo.ScoreList;

import java.util.List;

public interface ScoreListDao {
    /**
     * 成绩查询
     * @param studentID
     * @return
     */
    public List<ScoreList> queryScoreByStudentID(String studentID);

}
