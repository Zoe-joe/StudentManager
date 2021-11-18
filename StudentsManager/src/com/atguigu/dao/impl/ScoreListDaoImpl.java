package com.atguigu.dao.impl;


import com.atguigu.dao.ScoreListDao;
import com.atguigu.pojo.ScoreList;

import java.util.List;

public class ScoreListDaoImpl extends BaseDao implements ScoreListDao {
    @Override
    public List<ScoreList> queryScoreByStudentID(String studentID) {
        String sql="select studentID,username,teacher,subject,major,grade,score from scorelist where studentID=?";
        return queryForList(ScoreList.class,sql,studentID);
    }
}
