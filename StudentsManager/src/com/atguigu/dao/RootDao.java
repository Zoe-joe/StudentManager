package com.atguigu.dao;

import com.atguigu.pojo.Root;

public interface RootDao {
    /**
     * 返回修改行数
     * @return
     */
    public int saveRoot(Root root);

    /**
     * 返回管理员信息
     * @return
     */
    public Root queryTeacherByRootID(String rootID);
}
