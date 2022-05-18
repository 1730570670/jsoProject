package com.jsp.eachnet.servlet;

import com.jsp.eachnet.mapper.MangerService;
import com.jsp.eachnet.mapper.RepService;
import com.jsp.eachnet.pojo.EabyOrder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

/**
 * @Author: Java小胡
 * @Date: 2022/5/18
 * @PROJECT_NAME: eachnet
 */
@WebServlet(name = "OrderServlet")
public class OrderServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            request.setCharacterEncoding("utf-8");
            response.setContentType("text/html;charset=utf-8");
            HttpSession session = request.getSession();
            List<EabyOrder> list = MangerService.searchOrderList();//查询信息
            session.setAttribute("orderList",list);//将信息存进共享域中
            //重定向
            response.sendRedirect("Member/Member_Order.jsp");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
