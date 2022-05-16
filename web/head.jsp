<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 2022/5/11
  Time: 10:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!--Begin Header Begin-->
<div class="soubg">
    <div class="sou">
        <!--Begin 所在收货地区 Begin-->
        <span class="s_city_b">
        	<span class="fl">送货至：</span>
            <span class="s_city">
            	<span>长沙</span>
                <div class="s_city_bg">
                	<div class="s_city_t"></div>
                    <div class="s_city_c">
                    	<h2>请选择所在的收货地区</h2>
                        <table border="0" class="c_tab" style="width:235px; margin-top:10px;" cellspacing="0" cellpadding="0">
                          <tr>
                            <th>A</th>
                            <td class="c_h"><span>安徽</span><span>澳门</span></td>
                          </tr>
                          <tr>
                            <th>B</th>
                            <td class="c_h"><span>北京</span></td>
                          </tr>
                          <tr>
                            <th>C</th>
                            <td class="c_h"><span>重庆</span></td>
                          </tr>
                          <tr>
                            <th>F</th>
                            <td class="c_h"><span>福建</span></td>
                          </tr>
                          <tr>
                            <th>G</th>
                            <td class="c_h"><span>广东</span><span>广西</span><span>贵州</span><span>甘肃</span></td>
                          </tr>
                          <tr>
                            <th>H</th>
                            <td class="c_h"><span>河北</span><span>河南</span><span>黑龙江</span><span>海南</span><span>湖北</span><span>湖南</span></td>
                          </tr>
                          <tr>
                            <th>J</th>
                            <td class="c_h"><span>江苏</span><span>吉林</span><span>江西</span></td>
                          </tr>
                          <tr>
                            <th>L</th>
                            <td class="c_h"><span>辽宁</span></td>
                          </tr>
                          <tr>
                            <th>N</th>
                            <td class="c_h"><span>内蒙古</span><span>宁夏</span></td>
                          </tr>
                          <tr>
                            <th>Q</th>
                            <td class="c_h"><span>青海</span></td>
                          </tr>
                          <tr>
                            <th>S</th>
                            <td class="c_h"><span>上海</span><span>山东</span><span>山西</span><span class="c_check">四川</span><span>陕西</span></td>
                          </tr>
                          <tr>
                            <th>T</th>
                            <td class="c_h"><span>台湾</span><span>天津</span></td>
                          </tr>
                          <tr>
                            <th>X</th>
                            <td class="c_h"><span>西藏</span><span>香港</span><span>新疆</span></td>
                          </tr>
                          <tr>
                            <th>Y</th>
                            <td class="c_h"><span>云南</span></td>
                          </tr>
                          <tr>
                            <th>Z</th>
                            <td class="c_h"><span>浙江</span></td>
                          </tr>
                        </table>
                    </div>
                </div>
            </span>
        </span>
        <!--End 所在收货地区 End-->
        <span class="fr">
        	<span class="fl">你好
              <c:if test="${!sessionScope.loginStatus}">
                  ,请<a href="Login.jsp">登录</a>
              </c:if>
              <a href="Regist.jsp" style="color:#ff4e00;">免费注册</a>&nbsp;|&nbsp;<a href="#">我的订单</a>&nbsp;|</span>
        	<span class="ss">
            	<div class="ss_list">
                	<a href="#">收藏夹</a>
                    <div class="ss_list_bg">
                    	<div class="s_city_t"></div>
                        <div class="ss_list_c">
                        	<ul>
                            	<li><a href="#">我的收藏夹</a></li>
                                <li><a href="#">我的收藏夹</a></li>
                            </ul>
                        </div>
                    </div>
                </div>
                <div class="ss_list">
                	<a href="#">客户服务</a>
                    <div class="ss_list_bg">
                    	<div class="s_city_t"></div>
                        <div class="ss_list_c">
                        	<ul>
                            	<li><a href="#">客户服务</a></li>
                                <li><a href="#">客户服务</a></li>
                                <li><a href="#">客户服务</a></li>
                            </ul>
                        </div>
                    </div>
                </div>
                <div class="ss_list">
                	<a href="#">网站导航</a>
                    <div class="ss_list_bg">
                    	<div class="s_city_t"></div>
                        <div class="ss_list_c">
                        	<ul>
                            	<li><a href="#">网站导航</a></li>
                                <li><a href="#">网站导航</a></li>
                            </ul>
                        </div>
                    </div>
                </div>
            </span>
            <span class="fl">|&nbsp;关注我们：</span>
            <span class="s_sh"><a href="#" class="sh1">新浪</a><a href="#" class="sh2">微信</a></span>
            <span class="fr">|&nbsp;<a href="#">手机版&nbsp;<img src="images/s_tel.png" align="absmiddle" /></a></span>
        </span>
    </div>
</div>
<div class="top">
    <div class="logo"><a href="Index.html"><img src="images/logo.png" /></a></div>
    <div class="search">
        <form>
            <input type="text" value="" class="s_ipt" />
            <input type="submit" value="搜索" class="s_btn" />
        </form>
        <span class="fl"><a href="#">咖啡</a><a href="#">iphone 6S</a><a href="#">新鲜美食</a><a href="#">蛋糕</a><a href="#">日用品</a><a href="#">连衣裙</a></span>
    </div>
    <div class="i_car">
        <div class="car_t">购物车 [ <span>3</span> ]</div>
        <div class="car_bg">
            <!--Begin 购物车未登录 Begin-->
            <div class="un_login">
                <c:if test="${!sessionScope.loginStatus}">
                    还未登录！<a href="Login.html" style="color:#ff4e00;">马上登录</a> 查看购物车！
                </c:if>
            </div>
            <!--End 购物车未登录 End-->
            <!--Begin 购物车已登录 Begin-->
            <ul class="cars">
                <li>
                    <div class="img"><a href="#"><img src="images/car1.jpg" width="58" height="58" /></a></div>
                    <div class="name"><a href="#">法颂浪漫梦境50ML 香水女士持久清新淡香 送2ML小样3只</a></div>
                    <div class="price"><font color="#ff4e00">￥399</font> X1</div>
                </li>
                <li>
                    <div class="img"><a href="#"><img src="images/car2.jpg" width="58" height="58" /></a></div>
                    <div class="name"><a href="#">香奈儿（Chanel）邂逅活力淡香水50ml</a></div>
                    <div class="price"><font color="#ff4e00">￥399</font> X1</div>
                </li>
                <li>
                    <div class="img"><a href="#"><img src="images/car2.jpg" width="58" height="58" /></a></div>
                    <div class="name"><a href="#">香奈儿（Chanel）邂逅活力淡香水50ml</a></div>
                    <div class="price"><font color="#ff4e00">￥399</font> X1</div>
                </li>
            </ul>
            <div class="price_sum">共计&nbsp; <font color="#ff4e00">￥</font><span>1058</span></div>
            <div class="price_a"><a href="BuyCar.jsp">去购物车结算</a></div>
            <!--End 购物车已登录 End-->
        </div>
    </div>
</div>
<!--End Header End-->
<!--Begin Menu Begin-->
<div class="menu_bg">
    <div class="menu">
        <!--Begin 商品分类详情 Begin-->
        <div class="nav">
            <div class="nav_t">全部商品分类</div>
            <div class="leftNav">
                <ul>
                    <c:forEach items="${sessionScope.category1}" var="c1" varStatus="i">
                        <li>
                            <div class="fj">
                                <span class="n_img"><span></span><img src="images/nav1.png" /></span>
                                <span class="fl">${c1.name}</span>
                            </div>
                            <div class="zj" style="top:${-40*i.index }px;">
                                <div class="zj_l">
                                    <c:forEach items="${sessionScope.category2}" var="c2">
                                        <c:if test="${c2.parentId==c1.id}">
                                            <div class="zj_l_c">
                                                <h2>${c2.name}</h2>
                                                <c:forEach items="${sessionScope.category3}" var="c3">
                                                    <c:if test="${c3.parentId==c2.id}">
                                                        <a href="ProductServlet?name=${c3.name}">${c3.name}</a>|
                                                    </c:if>
                                                </c:forEach>
                                            </div>
                                        </c:if>
                                    </c:forEach>
                                </div>
                                <div class="zj_r">
                                    <a href="#"><img src="images/n_img1.jpg" width="236" height="200" /></a>
                                    <a href="#"><img src="images/n_img2.jpg" width="236" height="200" /></a>
                                </div>
                            </div>
                        </li>
                    </c:forEach>
                </ul>

            </div>
            <!--End 商品分类详情 End-->
            <ul class="menu_r">
                <li><a href="Index.html">首页</a></li>
                <li><a href="Food.html">美食</a></li>
                <li><a href="Fresh.html">生鲜</a></li>
                <li><a href="HomeDecoration.html">家居</a></li>
                <li><a href="SuitDress.html">女装</a></li>
                <li><a href="MakeUp.html">美妆</a></li>
                <li><a href="Digital.html">数码</a></li>
                <li><a href="GroupBuying.html">团购</a></li>
            </ul>
            <div class="m_ad">中秋送好礼！</div>
        </div>
    </div>
    <!--End Menu End-->
    <div class="i_bg bg_color">
        <div class="i_ban_bg">
            <!--Begin Banner Begin-->
            <div class="banner">
                <div class="top_slide_wrap">
                    <ul class="slide_box bxslider">
                        <li><img src="images/ban1.jpg" width="740" height="401" /></li>
                        <li><img src="images/ban1.jpg" width="740" height="401" /></li>
                        <li><img src="images/ban1.jpg" width="740" height="401" /></li>
                    </ul>
                    <div class="op_btns clearfix">
                        <a href="#" class="op_btn op_prev"><span></span></a>
                        <a href="#" class="op_btn op_next"><span></span></a>
                    </div>
                </div>
            </div>
            <script type="text/javascript">
                //var jq = jQuery.noConflict();
                (function(){
                    $(".bxslider").bxSlider({
                        auto:true,
                        prevSelector:jq(".top_slide_wrap .op_prev")[0],nextSelector:jq(".top_slide_wrap .op_next")[0]
                    });
                })();
            </script>
            <!--End Banner End-->
            <div class="inews">
                <div class="news_t">
                    <span class="fr"><a href="#">更多 ></a></span>新闻资讯
                </div>
                <ul>
                    <li><span>[ 特惠 ]</span><a href="#">掬一轮明月 表无尽惦念</a></li>
                    <li><span>[ 公告 ]</span><a href="#">好奇金装成长裤新品上市</a></li>
                    <li><span>[ 特惠 ]</span><a href="#">大牌闪购 · 抢！</a></li>
                    <li><span>[ 公告 ]</span><a href="#">发福利 买车就抢千元油卡</a></li>
                    <li><span>[ 公告 ]</span><a href="#">家电低至五折</a></li>
                </ul>
                <div class="charge_t">
                    话费充值<div class="ch_t_icon"></div>
                </div>
                <form>
                    <table border="0" style="width:205px; margin-top:10px;" cellspacing="0" cellpadding="0">
                        <tr height="35">
                            <td width="33">号码</td>
                            <td><input type="text" value="" class="c_ipt" /></td>
                        </tr>
                        <tr height="35">
                            <td>面值</td>
                            <td>
                                <select class="jj" name="city">
                                    <option value="0" selected="selected">100元</option>
                                    <option value="1">50元</option>
                                    <option value="2">30元</option>
                                    <option value="3">20元</option>
                                    <option value="4">10元</option>
                                </select>
                                <span style="color:#ff4e00; font-size:14px;">￥99.5</span>
                            </td>
                        </tr>
                        <tr height="35">
                            <td colspan="2"><input type="submit" value="立即充值" class="c_btn" /></td>
                        </tr>
                    </table>
                </form>
            </div>
        </div>
        <!--Begin 热门商品 Begin-->
        <div class="content mar_10">
            <div class="h_l_img">
                <div class="img"><img src="images/l_img.jpg" width="188" height="188" /></div>
                <div class="pri_bg">
                    <span class="price fl">￥53.00</span>
                    <span class="fr">16R</span>
                </div>
            </div>
            <div class="hot_pro">
                <div id="featureContainer">
                    <div id="feature">
                        <div id="block">
                            <div id="botton-scroll">
                                <ul class="featureUL">
                                    <li class="featureBox">
                                        <div class="box">
                                            <div class="h_icon"><img src="images/hot.png" width="50" height="50" /></div>
                                            <div class="imgbg">
                                                <a href="#"><img src="images/hot1.jpg" width="160" height="136" /></a>
                                            </div>
                                            <div class="name">
                                                <a href="#">
                                                    <h2>德国进口</h2>
                                                    德亚全脂纯牛奶200ml*48盒
                                                </a>
                                            </div>
                                            <div class="price">
                                                <font>￥<span>189</span></font> &nbsp; 26R
                                            </div>
                                        </div>
                                    </li>
                                    <li class="featureBox">
                                        <div class="box">
                                            <div class="h_icon"><img src="images/hot.png" width="50" height="50" /></div>
                                            <div class="imgbg">
                                                <a href="#"><img src="images/hot2.jpg" width="160" height="136" /></a>
                                            </div>
                                            <div class="name">
                                                <a href="#">
                                                    <h2>iphone 6S</h2>
                                                    Apple/苹果 iPhone 6s Plus公开版
                                                </a>
                                            </div>
                                            <div class="price">
                                                <font>￥<span>5288</span></font> &nbsp; 25R
                                            </div>
                                        </div>
                                    </li>
                                    <li class="featureBox">
                                        <div class="box">
                                            <div class="h_icon"><img src="images/hot.png" width="50" height="50" /></div>
                                            <div class="imgbg">
                                                <a href="#"><img src="images/hot3.jpg" width="160" height="136" /></a>
                                            </div>
                                            <div class="name">
                                                <a href="#">
                                                    <h2>倩碧特惠组合套装</h2>
                                                    倩碧补水组合套装8折促销
                                                </a>
                                            </div>
                                            <div class="price">
                                                <font>￥<span>368</span></font> &nbsp; 18R
                                            </div>
                                        </div>
                                    </li>
                                    <li class="featureBox">
                                        <div class="box">
                                            <div class="h_icon"><img src="images/hot.png" width="50" height="50" /></div>
                                            <div class="imgbg">
                                                <a href="#"><img src="images/hot4.jpg" width="160" height="136" /></a>
                                            </div>
                                            <div class="name">
                                                <a href="#">
                                                    <h2>品利特级橄榄油</h2>
                                                    750ml*4瓶装组合 西班牙原装进口
                                                </a>
                                            </div>
                                            <div class="price">
                                                <font>￥<span>280</span></font> &nbsp; 30R
                                            </div>
                                        </div>
                                    </li>
                                </ul>
                            </div>
                        </div>
                        <a class="h_prev" href="javascript:void();">Previous</a>
                        <a class="h_next" href="javascript:void();">Next</a>
                    </div>
                </div>
            </div>
        </div>
