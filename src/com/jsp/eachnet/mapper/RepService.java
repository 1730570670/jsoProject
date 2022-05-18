package com.jsp.eachnet.mapper;

import com.jsp.eachnet.pojo.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author Java小胡
 */
public class RepService {

    /**
     * 登录
     * @param userName 账号
     * @param userPassword 密码
     * @param request Servlet中的request,将存储登陆状态
     * @return 登录结果 boolean(登录成功:true)
     */
    public static boolean Login(String userName, String userPassword, HttpServletRequest request){
        try {
            HttpSession session = request.getSession();
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
                EabyUser user=new EabyUser();
                user.setUserName(resultSet.getString(3));
                user.setEmail(resultSet.getString(7));
                user.setMobile(resultSet.getString(8));
                session.setAttribute("user",user);
                return true;
            }
            BaseDao.closeConn(conn,pre,resultSet);//关闭连接
        } catch (Exception throwables) {
            throwables.printStackTrace();
        }
        return false;
    }

    /**
     *
     * @param userName 登录名
     * @param password 密码
     * @param email 邮箱地址
     * @param phone 电话号码
     * @return 返回的数量
     * @throws Exception
     */
    public  static int Regist(String userName, String password, String email, String phone) throws Exception{
        Connection conn=BaseDao.getConn();//创建连接
        String sql="INSERT INTO eaby_user (loginName,userName,password,email,mobile)VALUE(?,?,?,?,?)";
        PreparedStatement pre=conn.prepareStatement(sql);
        pre.setString(1,userName);pre.setString(2,userName);
        pre.setString(3,password);
        pre.setString(4,email);
        pre.setString(5,phone);
        int i = pre.executeUpdate();
        return i;
    }
    /**
     * 查询购物车数量
     * @return 购物车数量
     * @throws Exception
     */
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

    /**
     * 查询购物车价格
     * @return 购物车总价格
     * @throws Exception
     */
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
    /**
     * 根据商品级别，查询对应的商品分类
     * @param type
     * @return 分类名
     */
    public static List<EabyProductCategory> queryLevelList(int type) throws Exception{
        List<EabyProductCategory> list = new ArrayList<EabyProductCategory>();

        Connection conn = BaseDao.getConn();//创建连接
        String sql = " select * from eaby_product_category where type = ?";

        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, type);
            rs = pstmt.executeQuery();
            while(rs.next()){
                EabyProductCategory ct = new EabyProductCategory();
                ct.setId(rs.getInt("id"));
                ct.setName(rs.getString("name"));
                ct.setParentId(rs.getInt("parentId"));
                ct.setType(rs.getInt("type"));
                list.add(ct);
                //System.out.println(list);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            BaseDao.closeConn(conn, pstmt, rs);
        }
        return list;
    }

    /**
     * 查询商品详细信息
     * @param name 商品名称
     * @return 商品实体
     * @throws Exception
     */
    public static EabyProduct searchProduct(String name) throws Exception{
        EabyProduct product=new EabyProduct();
        Connection conn=BaseDao.getConn();//创建连接
        String sql="SELECT b.name,price,fileName,description FROM eaby_product_category a INNER JOIN eaby_product b ON a.parentId=b.categoryLevel2Id WHERE a.name=?";
        PreparedStatement pre=conn.prepareStatement(sql);
        pre.setString(1,name);//设置字段条件
        ResultSet resultSet = pre.executeQuery();
        if(resultSet.next()){
            product.setName(resultSet.getString(1));
            product.setPrice(resultSet.getDouble(2));
            product.setFileName(resultSet.getString(3));
            product.setDescription(resultSet.getString(4));
        }
        BaseDao.closeConn(conn,pre,resultSet);//关闭连接
        return product;
    }





}
