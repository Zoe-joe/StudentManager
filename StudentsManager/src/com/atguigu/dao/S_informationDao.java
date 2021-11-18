package com.atguigu.dao;

import com.atguigu.pojo.S_information;
import com.atguigu.pojo.User;

public interface S_informationDao {
    /**
     *
     * @param s_information 学生
     * @return
     */
    public int saveStudent(S_information s_information);

    /**
     *
     * @param username
     * @return
     */
    public S_information queryInformationByUsername(String username);
}
