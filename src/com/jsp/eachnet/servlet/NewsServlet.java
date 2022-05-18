package com.jsp.eachnet.servlet;

import com.jsp.eachnet.mapper.MangerService;
import com.jsp.eachnet.pojo.EabyNews;

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
@WebServlet(name = "NewsServlet")
public class NewsServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            int pageCurrent=1;
            if(request.getParameter("pageCurrent")!=null){
                pageCurrent= Integer.parseInt(request.getParameter("pageCurrent"));
            }
            HttpSession session = request.getSession();
            List<EabyNews> list = MangerService.searchNews(pageCurrent, 5, request);
            session.setAttribute("newsList",list);
            session.setAttribute("pageCurrent",pageCurrent);
            response.sendRedirect("Member/Member_NewList.jsp");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
