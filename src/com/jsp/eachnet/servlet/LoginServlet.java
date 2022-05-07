package com.jsp.eachnet.servlet;

import com.jsp.eachnet.mapper.RepService;
import com.jsp.eachnet.pojo.EabyShopcar;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            req.setCharacterEncoding("utf-8");
            resp.setContentType("text/html;charset=utf-8");
            PrintWriter writer = resp.getWriter();
            HttpSession session = req.getSession();
            //获取登录,账号密码参数
            String loginName = req.getParameter("loginName");
            String password = req.getParameter("password");
            //登录验证
            boolean login = RepService.Login(loginName, password);
            //登录成功
            if(login){
                /*
                * 登录的时候将购物车价格,以及数量详细信息放入Session当中
                * */
                //设置登陆状态为true
                session.setAttribute("loginStatus",login);
                List<EabyShopcar> eabyShopcars = RepService.searchBuyCarList();
                //将查询的购物车放置session中
                session.setAttribute("eabyShopcars",eabyShopcars);
                //将价格存入
                session.setAttribute("priceSum",RepService.priceSum());
                writer.println("<script>alert('登陆成功');location.href='index.jsp'</script>");
                return;
            }
            //登陆失败
            writer.println("<script>alert('账号或密码错误!登陆失败');location.href='index.jsp'</script>");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
