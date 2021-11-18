package com.atguigu.dao.impl;

import com.atguigu.dao.RootDao;
import com.atguigu.pojo.Root;

public class RootDaoImpl extends BaseDao implements RootDao {

    @Override
    public int saveRoot(Root root) {
        String sql = "UPDATE `root` SET `username`=?,`number`=?, `email`=?, `img`=? WHERE `rootID`=?";
        return updata(sql,root.getUsername(),root.getNumber(),root.getEmail(),root.getImg(),root.getRootID());

    }

    @Override
    public Root queryTeacherByRootID(String rootID) {
        String sql = "select `rootID`, `username`,`email`,`number`,`img` from root where rootID = ?";
        return queryForOne(Root.class, sql, rootID);
    }
}
