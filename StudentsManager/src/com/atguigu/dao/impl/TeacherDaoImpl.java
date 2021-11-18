package com.atguigu.dao.impl;

import com.atguigu.dao.TeacherDao;
import com.atguigu.pojo.Teacher;

public class TeacherDaoImpl extends BaseDao implements TeacherDao {

    @Override
    public int saveTeacher(Teacher teacher) {
        String sql="UPDATE `teacher` SET `username`=?, `sex`=?, `major`=?, `grade`=?, `number`=?, `email`=?, `address`=?, `img`=?,`teach`=? WHERE `teacherID`=?";
        return updata(sql,teacher.getUsername(),teacher.getSex(),teacher.getMajor(),teacher.getGrade(),teacher.getNumber(),teacher.getEmail(),teacher.getAddress(),teacher.getImg(),teacher.getTeach(),teacher.getTeacherID());
    }

    @Override
    public Teacher queryTeacherByTeacherID(String teacherID) {
        String sql="select `teacherID`, `username`, `sex`, `major`, `grade`, `number`, `email`, `address`, `img`,`teach` from teacher where teacherID = ?";
        return queryForOne(Teacher.class,sql,teacherID);
    }
}
