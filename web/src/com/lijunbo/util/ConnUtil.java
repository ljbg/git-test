package com.lijunbo.util;

import org.apache.commons.dbcp.BasicDataSourceFactory;

import javax.sql.DataSource;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

public class ConnUtil {
    private  static DataSource ds = null;
    private  static ThreadLocal<Connection> threadLocal  =new ThreadLocal<>();
    static{
        try{
            Properties prop = new Properties();
            InputStream is= ConnUtil.class.getClassLoader().getResourceAsStream("db.properties");
            prop.load(is);
            ds = BasicDataSourceFactory.createDataSource(prop);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static Connection getConn() throws SQLException {
        Connection conn = threadLocal.get();
        if(conn == null || conn.isClosed()){
            conn = ds.getConnection();
            threadLocal.set(conn);
        }
        return conn;
    }
    public  static void closeConn(){
        try{
            Connection conn = threadLocal.get();
            if(conn!= null && !conn.isClosed()){
                conn.close();
            }
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            threadLocal.set(null);
        }
    }
}
