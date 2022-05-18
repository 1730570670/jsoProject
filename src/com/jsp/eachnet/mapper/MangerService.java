package com.jsp.eachnet.mapper;

import com.jsp.eachnet.pojo.EabyNews;
import com.jsp.eachnet.pojo.EabyOrder;
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
 * @Author 小胡
 */
public class MangerService {

    /**
     * 查询商品
     * @param pageCurrent 页数
     * @param request
     * @return 商品列表
     * @throws Exception
     */
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

    /**
     * 删除商品
     * @param name
     * @return Boolean
     * @throws Exception
     */
    public static boolean ProDeByName(String name)throws Exception{
        Connection conn=BaseDao.getConn();
        String sql="DELETE FROM eaby_product where name=?";
        PreparedStatement pre= conn.prepareStatement(sql);
        pre.setString(1,name);
        boolean execute = pre.execute();
        BaseDao.closeConn(conn,pre,null);
        return execute;
    }


    /**
     * 新闻列表
     * @param pageCurrent 页数
     * @param pageSize 数量
     * @param request HTTPServletRequest
     * @return 新闻列表
     * @throws Exception
     */
    public static List<EabyNews> searchNews(int pageCurrent, int pageSize, HttpServletRequest request) throws Exception{
        Connection conn = BaseDao.getConn();
        String sql="SELECT * FROM eaby_news LIMIT ?,?";
        PreparedStatement preparedStatement = conn.prepareStatement(sql);
        preparedStatement.setInt(1,(pageCurrent*pageSize)-1);
        preparedStatement.setInt(2,pageSize);
        ResultSet resultSet = preparedStatement.executeQuery();
        List<EabyNews> list=new ArrayList<>();
        HttpSession session = request.getSession();
        int i=0;
        while (resultSet.next()){
            i++;
            EabyNews eabyNews=new EabyNews();
            eabyNews.setId(resultSet.getInt(1));
            eabyNews.setTitle(resultSet.getString(2));
            eabyNews.setContent(resultSet.getString(3));
            eabyNews.setCreateTime(resultSet.getTimestamp(4));
            list.add(eabyNews);
        }
        session.setAttribute("MaxPage",i);
        BaseDao.closeConn(conn,preparedStatement,resultSet);
        return list;
    }

    /**
     * 查询订单信息
     * @return 订单信息列表
     * @throws Exception
     */
    public static List<EabyOrder> searchOrderList() throws Exception{
        Connection conn=BaseDao.getConn();//创建连接
        String sql="SELECT * FROM eaby_order";//准备语句
        Statement state=conn.createStatement();
        ResultSet resultSet = state.executeQuery(sql);//执行
        List<EabyOrder> list=new ArrayList<>();
        while (resultSet.next()){//查询(赋值)
            EabyOrder eabyOrder=new EabyOrder();
            eabyOrder.setId(resultSet.getInt(1));
            eabyOrder.setUserId(resultSet.getByte(2));
            eabyOrder.setLoginName(resultSet.getString(3));
            eabyOrder.setUserAddress(resultSet.getString(4));
            eabyOrder.setCreateTime(resultSet.getTimestamp(5));
            eabyOrder.setSunPrice(resultSet.getDouble(6));
            eabyOrder.setStatus(resultSet.getString(7));
            eabyOrder.setSerialNumber(resultSet.getString(8));
            list.add(eabyOrder);
        }
        //关闭连接
        BaseDao.closeConn(conn,state,resultSet);
        return list;
    }

}
