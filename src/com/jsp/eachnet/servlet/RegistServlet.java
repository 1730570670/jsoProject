package com.jsp.eachnet.servlet;


import com.google.gson.Gson;
import com.jsp.eachnet.mapper.RepService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "RegistServlet")
public class RegistServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            response.setContentType("text/html;charset=utf-8");
            request.setCharacterEncoding("utf-8");
            String userName = request.getParameter("userName");
            String password = request.getParameter("password");
            String email = request.getParameter("email");
            String phone = request.getParameter("phone");
            int regist = RepService.Regist(userName, password, email, phone);
            List list=new ArrayList();
            Gson gson=new Gson();
            System.out.println(regist);
            if(regist>0){
                list.add("添加成功");
                String s = gson.toJson(list);
                response.getWriter().println(s);
                return;
            }
            list.add("添加失败");
            String s = gson.toJson(list);
            response.getWriter().println(s);

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
