package com.jsp.eachnet.servlet;

import com.jsp.eachnet.mapper.RepService;
import com.jsp.eachnet.pojo.EabyProduct;
import com.jsp.eachnet.pojo.EabyProductCategory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ProductServlet")
public class ProductServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            HttpSession session = request.getSession();
            request.setCharacterEncoding("utf-8");//设置编码格式
            String name = request.getParameter("name");
            EabyProduct list = RepService.searchProduct(name);
            session.setAttribute("product",list);//将商品放置session中
            response.sendRedirect("Product.jsp");

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
