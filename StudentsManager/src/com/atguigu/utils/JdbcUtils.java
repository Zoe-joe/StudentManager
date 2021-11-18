package com.atguigu.utils;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;

import java.io.InputStream;
import java.sql.Connection;
import java.util.Properties;

public class JdbcUtils {
    private static DruidDataSource dataSource;
    private static Connection conn;
    static {
        try {
            Properties prop=new Properties();
            InputStream is = JdbcUtils.class.getClassLoader().getResourceAsStream("jdbc.properties");
            prop.load(is);
            dataSource= (DruidDataSource) DruidDataSourceFactory.createDataSource(prop);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnect(){
        try {
            conn=dataSource.getConnection();
        }catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }
    public static void closeConnect(){
        if(conn!=null){
            try {
                conn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
