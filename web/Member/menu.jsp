<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 2022/5/11
  Time: 10:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="m_left">
    <div class="left_n">管理中心</div>
    <div class="left_m">
        <div class="left_m_t t_bg1">会员中心</div>
        <ul>
            <li><a href="Member_User.jsp">用户信息</a></li>
            <li><a href="Member_User.jsp">用户列表</a></li>
        </ul>
    </div>
    <div class="left_m">
        <div class="left_m_t t_bg2">订单中心</div>
        <ul>
            <li><a href="/eachnet/OrderServlet">我的订单</a></li>
            <li><a href="/eachnet/OrderServlet">全部订单</a></li>
        </ul>
    </div>
    <div class="left_m">
        <div class="left_m_t t_bg3">商品管理</div>
        <ul>
            <li><a href="Member_productCategoryList--商品分类列表.html">分类管理</a></li>
            <li><a href="/eachnet/MemberProductServlet">商品管理</a></li>
            <li><a href="Member_productAdd--商品上架.html">商品上架</a></li>
        </ul>
    </div>
    <div class="left_m">
        <div class="left_m_t t_bg4">资讯中心</div>
        <ul>
            <li><a href="/eachnet/NewsServlet">资讯列表</a></li>
        </ul>
    </div>
</div>
