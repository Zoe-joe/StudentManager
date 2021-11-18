package com.atguigu.service.impl;

import com.atguigu.dao.TeacherDao;
import com.atguigu.dao.impl.TeacherDaoImpl;
import com.atguigu.pojo.Teacher;
import com.atguigu.service.TeacherService;

public class TeacherServiceImpl implements TeacherService {
    private TeacherDao teacherDao=new TeacherDaoImpl();
    @Override
    public void updateTeacher(Teacher teacher) {
        teacherDao.saveTeacher(teacher);
    }

    @Override
    public Teacher loadTeacher(String teacherID) {
        return teacherDao.queryTeacherByTeacherID(teacherID);
    }
}
