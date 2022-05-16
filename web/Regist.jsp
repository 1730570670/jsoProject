<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 2022/5/12
  Time: 8:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <link type="text/css" rel="stylesheet" href="css/style.css" />
    <!--[if IE 6]>
    <script src="js/iepng.js" type="text/javascript"></script>
    <script type="text/javascript">
        EvPNG.fix('div, ul, img, li, input, a');
    </script>
    <![endif]-->
    <script type="text/javascript" src="js/jquery-1.11.1.min_044d0927.js"></script>
    <script type="text/javascript" src="js/jquery.bxslider_e88acd1b.js"></script>

    <script type="text/javascript" src="js/jquery-1.8.2.min.js"></script>
    <script type="text/javascript" src="js/menu.js"></script>

    <script type="text/javascript" src="js/select.js"></script>

    <script type="text/javascript" src="js/lrscroll.js"></script>

    <script type="text/javascript" src="js/iban.js"></script>
    <script type="text/javascript" src="js/fban.js"></script>
    <script type="text/javascript" src="js/f_ban.js"></script>
    <script type="text/javascript" src="js/mban.js"></script>
    <script type="text/javascript" src="js/bban.js"></script>
    <script type="text/javascript" src="js/hban.js"></script>
    <script type="text/javascript" src="js/tban.js"></script>

    <script type="text/javascript" src="js/lrscroll_1.js"></script>

    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <title>易趣商城</title>
</head>
<body>
<!--Begin Header Begin-->
<div class="soubg">
    <div class="sou">
        <span class="fr">
        	<span class="fl">你好，请<a href="Login.jsp">登录</a>&nbsp; <a href="Regist.jsp" style="color:#ff4e00;">免费注册</a>&nbsp; </span>
            <span class="fl">|&nbsp;关注我们：</span>
            <span class="s_sh"><a href="#" class="sh1">新浪</a><a href="#" class="sh2">微信</a></span>
            <span class="fr">|&nbsp;<a href="#">手机版&nbsp;<img src="images/s_tel.png" align="absmiddle" /></a></span>
        </span>
    </div>
</div>
<!--End Header End-->
<!--Begin Login Begin-->
<div class="log_bg">
    <div class="top">
        <div class="logo"><a href="Index.html"><img src="images/logo.png" /></a></div>
    </div>
    <div class="regist">
        <div class="log_img"><img src="images/l_img.png" width="611" height="425" /></div>
        <div class="reg_c">
            <form id="Regist">
                <table border="0" style="width:420px; font-size:14px; margin-top:20px;" cellspacing="0" cellpadding="0">
                    <tr height="50" valign="top">
                        <td width="95">&nbsp;</td>
                        <td>
                            <span class="fl" style="font-size:24px;">注册</span>
                            <span class="fr">已有商城账号，<a href="Login.jsp" style="color:#ff4e00;">我要登录</a></span>
                        </td>
                    </tr>
                    <tr height="50">
                        <td align="right"><font color="#ff4e00">*</font>&nbsp;用户名 &nbsp;</td>
                        <td><input type="text" value="" class="l_user" id="userName" /></td>
                    </tr>
                    <tr height="50">
                        <td align="right"><font color="#ff4e00">*</font>&nbsp;密码 &nbsp;</td>
                        <td><input type="password" value="" class="l_pwd" id="password" /></td>
                    </tr>
                    <tr height="50">
                        <td align="right"><font color="#ff4e00">*</font>&nbsp;确认密码 &nbsp;</td>
                        <td><input type="password" value="" class="l_pwd" id="password2"/></td>
                    </tr>
                    <tr height="50">
                        <td align="right"><font color="#ff4e00">*</font>&nbsp;邮箱 &nbsp;</td>
                        <td><input type="text" value="" class="l_email" id="email"/></td>
                    </tr>
                    <tr height="50">
                        <td align="right"><font color="#ff4e00">*</font>&nbsp;手机 &nbsp;</td>
                        <td><input type="text" value="" class="l_tel" id="phone"/></td>
                    </tr>
                    <tr height="50">
                        <td align="right">邀请人会员名 &nbsp;</td>
                        <td><input type="text" value="" class="l_mem" /></td>
                    </tr>
                    <tr height="50">
                        <td align="right">邀请人ID号 &nbsp;</td>
                        <td><input type="text" value="" class="l_num" /></td>
                    </tr>
                    <tr height="50">
                        <td align="right"> <font color="#ff4e00">*</font>&nbsp;验证码 &nbsp;</td>
                        <td>
                            <input type="text" value="" id="randData" class="l_ipt" />
                            <button href="#" style="font-size:12px; font-family:'宋体';height: 40px" id="changeRand">换一张</button>
                            <input type="text" id="rand" style="width: 80px;height: 33px"/>
                        </td>
                    </tr>
                    <tr>
                        <td>&nbsp;</td>
                        <td style="font-size:12px; padding-top:20px;">
                	<span style="font-family:'宋体';" class="fl">
                    	<label class="r_rad"><input type="checkbox" /></label><label class="r_txt">我已阅读并接受《用户协议》</label>
                    </span>
                        </td>
                    </tr>
                    <tr height="60">
                        <td>&nbsp;</td>
                        <td><input type="button" id="registButton" value="立即注册" class="log_btn" /></td>
                    </tr>
                </table>
            </form>
        </div>
    </div>
</div>
<!--End Login End-->
<!--Begin Footer Begin-->
<div class="btmbg">
    <div class="btm">
        备案/许可证编号：蜀ICP备12009302号-1-www.dingguagua.com   Copyright © 2015-2018 尤洪商城网 All Rights Reserved. 复制必究 , Technical Support: Dgg Group <br />
        <img src="images/b_1.gif" width="98" height="33" /><img src="images/b_2.gif" width="98" height="33" /><img src="images/b_3.gif" width="98" height="33" /><img src="images/b_4.gif" width="98" height="33" /><img src="images/b_5.gif" width="98" height="33" /><img src="images/b_6.gif" width="98" height="33" />
    </div>
</div>
<!--End Footer End -->

</body>


<!--[if IE 6]>
<script src="//letskillie6.googlecode.com/svn/trunk/2/zh_CN.js"></script>
<![endif]-->
</html>
<script>
    //验证码随机数
    var chars = ['0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'];
    function generateMixed() {
        var res = "";
        for(var i = 0; i<5 ; i ++) {
            var id = Math.ceil(Math.random()*35);
            res += chars[id];
        }
        return res;
    }
    //创建的实例时创建随机数的方法
    $("#rand").val(generateMixed())
    //点击换一张,触发随机数的方法
    $("changeRand").click(function (){
        $("#rand").val(generateMixed())
        alert(111)
    })
    $("#registButton").click(()=>{
        var userName = $("#userName").val();
        var password = $("#password").val();
        var password2 = $("#password2").val();
        var email = $("#email").val();
        var phone = $("#phone").val();
        var rand = $("#rand").val();
        var randData = $("#randData").val();
        //前端表单验证
        // 有输入为空
        if(userName=="" ||password=="" || email=="" || phone=="" ||randData==""){
            alert("请将数据填写完整")
            return;
        }
        //两次输入的密码不一致
        if(password!=password2){
            alert("两次输入的密码不一致")
            return;
        }
        //验证码不正确
        if(randData.toLocaleUpperCase()!=rand){
            alert("验证码输入不正确")
            return ;
        }
        $.ajax({
            type:'post',
            url:'RegistServlet',
            dataType:'json',
            data:{
                userName:userName,
                password:password,
                email:email,
                phone:phone
            },
            success:(res)=>{
                if(res.length>0){
                    alert("注册成功")
                    return ;
                }
                alert("注册失败")
            }
        })
    })
</script>

