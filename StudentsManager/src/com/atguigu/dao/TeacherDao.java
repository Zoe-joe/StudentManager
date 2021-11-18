package com.atguigu.dao;

import com.atguigu.pojo.Teacher;

public interface TeacherDao {
    /**
     * 返回修改行数
     * @return
     */
    public int saveTeacher(Teacher teacher);

    /**
     * 返回老师信息
     * @return
     */
    public Teacher queryTeacherByTeacherID(String teacherID);
}
