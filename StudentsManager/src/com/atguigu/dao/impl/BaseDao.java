package com.atguigu.dao.impl;

import com.atguigu.utils.JdbcUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class BaseDao {
    private QueryRunner queryRunner=new QueryRunner();
    public int updata(String sql,Object ...args){
        Connection connection= JdbcUtils.getConnect();
        try {
            return queryRunner.update(connection,sql,args);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            JdbcUtils.closeConnect();
        }
        return -1;
    }

    public <T> T queryForOne(Class<T> type,String sql,Object ...args){
        Connection connection=JdbcUtils.getConnect();
        try {
            return queryRunner.query(connection,sql,new BeanHandler<T>(type),args);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            JdbcUtils.closeConnect();
        }
        return null;
    }
    public <T> List<T> queryForList(Class<T> type, String sql, Object... args) {
        Connection con = JdbcUtils.getConnect();
        try {
            return queryRunner.query(con, sql, new BeanListHandler<T>(type), args);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JdbcUtils.closeConnect();
        }
        return null;
    }
    /**
     * 执行返回一行一列的 sql 语句
     * @param sql 执行的 sql 语句
     * @param args sql 对应的参数值
     * @return
     */
    public Object queryForSingleValue(String sql, Object... args){
        Connection conn = JdbcUtils.getConnect();
        try {
            return queryRunner.query(conn, sql, new ScalarHandler(), args);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JdbcUtils.closeConnect();
        }
        return null;
    }
}
