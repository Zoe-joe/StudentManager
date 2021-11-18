package com.atguigu.dao;

import com.atguigu.pojo.ScoreList;

import java.util.List;

public interface PageScoreDao {
    public int addScore(ScoreList scoreList);

    public int deleteScore(Integer id);

    public int updateScore(ScoreList scoreList);

    public List<ScoreList> queryScoreByStudentID(String studentID);

    public ScoreList queryScoreByStudentIDAndSubject(String studentID,String subject);

    /**
     * 返回总的成绩记录数参数
     *
     * @return
     */
    public Integer queryForPageTotalCount();

    /**
     * 返回当前页面数据
     *
     * @return
     */
    public List<ScoreList> queryForItems(int begin, int pageSize);
}
