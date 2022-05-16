package com.jsp.eachnet.mapper;

import com.jsp.eachnet.pojo.EabyProduct;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * Author 小胡
 */
public class MangerService {

    public static List<EabyProduct> searchProductList(int pageCurrent,HttpServletRequest request) throws Exception{
        HttpSession session = request.getSession();
        List<EabyProduct> list=new ArrayList<>();//创建列表储存数据
        Connection conn=BaseDao.getConn();//创建连接
        String sql="SELECT* FROM eaby_product limit ?,?";
        PreparedStatement pre=conn.prepareStatement(sql);
        pre.setInt(1,(pageCurrent-1)*6);
        pre.setInt(2,6);
        ResultSet resultSet = pre.executeQuery();
        int i = 0;
        while (resultSet.next()){
            i++;
            EabyProduct eabyProduct=new EabyProduct();
            eabyProduct.setId(resultSet.getInt(1));
            eabyProduct.setName(resultSet.getString(2));
            eabyProduct.setPrice(resultSet.getDouble(4));
            eabyProduct.setStock(Long.parseLong(resultSet.getString(5)));
            eabyProduct.setFileName(resultSet.getString(9));
            list.add(eabyProduct);
        }
        //最大页数
        session.setAttribute("MaxPage",i);
        BaseDao.closeConn(conn,pre,resultSet);//关闭连接
        return list;
    }

    public static boolean ProDeByName(String name)throws Exception{
        Connection conn=BaseDao.getConn();
        String sql="DELETE FROM eaby_product where name=?";
        PreparedStatement pre= conn.prepareStatement(sql);
        pre.setString(1,name);
        boolean execute = pre.execute();
        BaseDao.closeConn(conn,pre,null);
        return execute;
    }

}
