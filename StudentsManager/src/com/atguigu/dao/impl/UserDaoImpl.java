package com.atguigu.dao.impl;

import com.atguigu.dao.UserDao;
import com.atguigu.pojo.User;

public class UserDaoImpl extends BaseDao implements UserDao {
    @Override
    public User queryUserByUsernameAndRole(String username,String role) {
        String sql="select `id`,`username`,`password`,`email`,`role`from `person` where username=? And role=?";
        return queryForOne(User.class,sql,username,role);
    }

    @Override
    public User queryUserByUsernameAndPasswordAndRole(String username, String password,String role) {
        String sql="select `id`,`username`,`password`,`email`,`role` from `person` where username=? and password=? and role=?";
        return queryForOne(User.class,sql,username,password,role);
    }

    @Override
    public int saveUser(User user) {
        String sql ="insert into `person`(`username`,`password`,`email`,`role`) values (?,?,?,?)";
        return updata(sql ,user.getUsername(),user.getPassword(),user.getEmail(),user.getRole());
    }
}
