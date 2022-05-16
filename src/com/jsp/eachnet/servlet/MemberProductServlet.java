package com.jsp.eachnet.servlet;

import com.jsp.eachnet.mapper.MangerService;
import com.jsp.eachnet.pojo.EabyProduct;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "MemberServlet")
public class MemberProductServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        try {
            int pageCurrent=1;
            if(request.getParameter("pageCurrent")!=null){
                //如果传参数不为空,则页数获取的为参数
                pageCurrent= Integer.parseInt(request.getParameter("pageCurrent"));
            }
            //传名字,删除名字
            if(request.getParameter("name")!=null){
                boolean name = MangerService.ProDeByName(request.getParameter("name"));
            }
            HttpSession session = request.getSession();
            //查询的信息
            List<EabyProduct> list = MangerService.searchProductList(pageCurrent,request);
            session.setAttribute("pageCurrent",pageCurrent);
            session.setAttribute("productList",list);
            response.sendRedirect("Member/Member_productList.jsp");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
