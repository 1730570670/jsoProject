package com.jsp.eachnet.mapper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class BaseDao {
        //创建连接
        public static Connection getConn()throws Exception{
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/eaby","root","1234");
            return connection;
        }

        //关闭连接
        public static void closeConn(Connection conn, Statement state, ResultSet res)throws Exception {
            if (conn != null) {
                conn.close();
            }
            if (state != null) {
                state.close();
            }
            if (res != null) {
                res.close();
            }
        }
}

