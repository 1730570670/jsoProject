package com.jsp.eachnet.servlet;

import com.jsp.eachnet.mapper.BaseDao;
import com.jsp.eachnet.mapper.RepService;
import com.jsp.eachnet.pojo.EabyShopcar;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;


public class BuyCarServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");
        HttpSession session = req.getSession();
        try {
            double priceSum = RepService.priceSum();
            List<EabyShopcar> eabyShopcars = RepService.searchBuyCarList();
            session.setAttribute("priceSum",priceSum);
            session.setAttribute("eabyShopcars",eabyShopcars);
            /*
            * 客户端发送ajax请求,将数量进行改变
            * */
            int count= Integer.parseInt(req.getParameter("count"));
            String proname=req.getParameter("proname");
            Connection connection= BaseDao.getConn();
            //SQL语句,将客户端传来的数量进行改变
            String sql="update eaby_shopcar set count=? where proname=?";
            PreparedStatement pre=connection.prepareStatement(sql);
            pre.setInt(1,count);
            pre.setString(2,proname);
            boolean execute = pre.execute();
            //修改成功
            if(execute){
                resp.getWriter().println("修改成功");
                return;
            }
            resp.getWriter().println("修改失败");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
