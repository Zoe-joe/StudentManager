package com.atguigu.service.impl;

import com.atguigu.dao.UserDao;
import com.atguigu.dao.impl.UserDaoImpl;
import com.atguigu.pojo.User;
import com.atguigu.service.UserService;


public class UserServiceImpl implements UserService {
    private UserDao userDao = new UserDaoImpl();

    @Override
    public void registUser(User user) {
        userDao.saveUser(user);
    }

    @Override
    public User login(User user) {
        return userDao.queryUserByUsernameAndPasswordAndRole(user.getUsername(), user.getPassword(),user.getRole());
    }

    @Override
    public boolean existsUsername(String username,String role) {
        if (userDao.queryUserByUsernameAndRole(username,role) == null) {
            // 等于null,说明没查到，没查到表示可用
            return false;
        }

        return true;

    }

}
