package com.atguigu.dao.impl;

import com.atguigu.dao.S_informationDao;
import com.atguigu.pojo.S_information;

public class S_informationDaoImpl extends BaseDao implements S_informationDao {
    @Override
    public int saveStudent(S_information s_information) {
        String sql = "UPDATE `S_information` SET `username`=?, `sex`=?, `major`=?, `grade`=?, `number`=?, `email`=?, `address`=?, `img`=? WHERE `studentID`=? ";
        return updata(sql,s_information.getUsername(), s_information.getSex(), s_information.getMajor(), s_information.getGrade(), s_information.getNumber(), s_information.getEmail(), s_information.getAddress(), s_information.getImg(), s_information.getStudentID());
    }

    @Override
    public S_information queryInformationByUsername(String username) {
        String sql = "select `studentID`, `username`, `sex`, `major`, `grade`, `number`, `email`, `address`, `img` from s_information where studentID = ?";
        return queryForOne(S_information.class, sql, username);
    }
}
