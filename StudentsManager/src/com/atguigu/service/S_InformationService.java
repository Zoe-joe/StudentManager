package com.atguigu.service;

import com.atguigu.pojo.S_information;

public interface S_InformationService {
    /**
     *上传修改信息
     * @param s_information
     */
    public void updateStudent(S_information s_information);

    /**
     * 通过学号查询学生信息
     * @param username
     * @return
     */
    public S_information loadStudent(String username);
}
