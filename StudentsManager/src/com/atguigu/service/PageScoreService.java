package com.atguigu.service;

import com.atguigu.pojo.Page;
import com.atguigu.pojo.ScoreList;

import java.util.List;

public interface PageScoreService {
    /**
     * 通过页面号，和页面大小，创建Page对象
     *
     * @param pageNo
     * @return
     */
    public Page page(int pageNo);

    public void addScore(ScoreList scoreList);

    public void deleteScore(Integer id);

    public void update(ScoreList scoreList);

    public List<ScoreList> queryScores(String studentID);

    public ScoreList queryScore(String studentID,String subject);
}
