package com.jsp.eachnet.mapper;

import com.jsp.eachnet.pojo.EabyShopcar;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class RepService {
    //登录功能
    public static boolean Login(String userName,String userPassword){
        try {
            Connection conn=BaseDao.getConn();
            //SQL语句
            String sql="select * from eaby_user where loginName = ? and password=?";
            /*
             * 查询到账户密码返回true
             * */
            PreparedStatement pre=conn.prepareStatement(sql);
            pre.setString(1,userName);
            pre.setString(2,userPassword);
            ResultSet resultSet = pre.executeQuery();
            //查询到返回true
            if(resultSet.next()){
                return true;
            }
            BaseDao.closeConn(conn,pre,resultSet);//关闭连接
        } catch (Exception throwables) {
            throwables.printStackTrace();
        }
        return false;
    }

    //查询购物车数量
    public static List<EabyShopcar> searchBuyCarList() throws Exception{
        List<EabyShopcar> list=new ArrayList<>();
        Connection connection=BaseDao.getConn();//创建连接
        String sql="SELECT * FROM eaby_shopcar";
        Statement state=connection.createStatement();//创建适配器
        ResultSet resultSet = state.executeQuery(sql);
        //创建查询
        while (resultSet.next()){
            EabyShopcar eabyShopcar=new EabyShopcar();
            eabyShopcar.setProid(resultSet.getInt(1));
            eabyShopcar.setProname(resultSet.getString(2));
            eabyShopcar.setCount(resultSet.getInt(3));
            eabyShopcar.setPrice(resultSet.getDouble(4));
            eabyShopcar.setUserid(resultSet.getInt(5));
            eabyShopcar.setFileName(resultSet.getString(6));
            list.add(eabyShopcar);
        }
        BaseDao.closeConn(connection,state,resultSet);//关闭连接
        return list;
    }
    //查询购物车价格
    public static double priceSum() throws Exception{
        Connection connection=BaseDao.getConn();
        String sql="SELECT SUM(count*price) FROM eaby_shopcar";
        Statement state= connection.createStatement();
        ResultSet resultSet = state.executeQuery(sql);
        while (resultSet.next()){
           return resultSet.getInt(1);
        }
        return 0;
    }
}
