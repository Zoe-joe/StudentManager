package com.atguigu.service;

import com.atguigu.pojo.Teacher;

public interface TeacherService {

    public  void updateTeacher(Teacher teacher);

    public Teacher loadTeacher(String teacherID);
}
