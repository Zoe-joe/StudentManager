package com.atguigu.dao.impl;

import com.atguigu.dao.PageScoreDao;
import com.atguigu.pojo.ScoreList;

import java.util.List;

public class PageScoreDaoImpl extends BaseDao implements PageScoreDao {

    @Override
    public int addScore(ScoreList scoreList) {
        String sql="insert into `Scorelist` (studentID, username, subject, major, grade, score) values (?,?,?,?,?,?)";
        return updata(sql,scoreList.getStudentID(),scoreList.getUsername(),scoreList.getSubject(),scoreList.getMajor(),scoreList.getGrade(),scoreList.getScore());
    }

    @Override
    public int deleteScore(Integer id) {
        String sql="delete from scorelist where `id`=?";
        return updata(sql,id);
    }

    @Override
    public int updateScore(ScoreList scoreList) {
        String sql="update scorelist set studentID=?,username=?,teacher=?,subject=?,major=?,grade=?,score=? where id=?";
        return updata(sql,scoreList.getStudentID(),scoreList.getUsername(),scoreList.getTeacher(),scoreList.getSubject(),scoreList.getMajor(),scoreList.getGrade(),scoreList.getScore(),scoreList.getId());
    }

    @Override
    public List<ScoreList> queryScoreByStudentID(String studentID) {
        String sql="select studentID,username,teacher,subject,major,grade,score from scorelist where studentID=?";
        return queryForList(ScoreList.class,sql,studentID);
    }
    @Override
    public ScoreList queryScoreByStudentIDAndSubject(String studentID,String subject) {
        String sql="select studentID,username,teacher,subject,major,grade,score from scorelist where studentID=?,subject=?";
        return queryForOne(ScoreList.class,sql,studentID,subject);
    }

    @Override
    public Integer queryForPageTotalCount() {
        String sql = "select count(*) from `scorelist`";
        Number count = (Number) queryForSingleValue(sql);
        return count.intValue();
    }

    @Override
    public List<ScoreList> queryForItems(int begin, int pageSize) {
        String sql = "select `id`,`studentID`,`username`,`teacher`,`subject`,`major`,`grade`,`score` from `scorelist` limit ?,?";
        return queryForList(ScoreList.class, sql, begin, pageSize);
    }
}
