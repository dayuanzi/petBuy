<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="true"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">

	<title>登录</title> <!--链接标签图标-->
	<link rel="shortcut icon" href="img/logo.ico">

		<link rel="stylesheet" type="text/css" href="css/common/common.css" />
		<link rel="stylesheet" type="text/css" href="css/common/nav-bar.css" />
		<link rel="stylesheet" type="text/css"
			href="css/jquery.validator.css" />
		<link rel="stylesheet" type="text/css"
			href="css/login.css" />

		<script src="js/jquery.min.js" type="text/javascript" charset="utf-8"></script>
		<script src="js/login/jquery.validator.js" type="text/javascript"
			charset="utf-8"></script>
		<script src="js/login/zh_CN.js" type="text/javascript" charset="utf-8"></script>

		<script language="javascript" type="text/javascript">
			$(function() {
				$(".login-form .tabs a").click(function() {
					$(this).addClass('on').siblings().removeClass('on');
					var index = $(this).index();
					number = index;
					$('.tab-page').siblings().hide();
					$('.tab-page').eq(index).slideDown(500);
				});
			});
			
			
			function  onLogin(){
				//var msg=request.getParameter("msg");
				
				alert(<%=request.getParameter("error")%>);
			}
			
			
		</script>

		<script language="javascript" type="text/javascript">
			var timeout = 100;
			var closetimer = 0;
			var ddmenuitem = 0;

			function menu_open() {
				menu_canceltimer();
				menu_close();
				ddmenuitem = $(this).find('ul').eq(0).css('visibility',
						'visible');
			}

			function menu_close() {
				if (ddmenuitem)
					ddmenuitem.css('visibility', 'hidden');
			}

			function menu_timer() {
				closetimer = window.setTimeout(menu_close, timeout);
			}

			function menu_canceltimer() {
				if (closetimer) {
					window.clearTimeout(closetimer);
					closetimer = null;
				}
			}
			$(document).ready(function() {
				$('.header-menu > li').bind('mouseover', menu_open);
				$('.header-menu > li').bind('mouseout', menu_timer);
			});
			document.onclick = menu_close;

		</script>




<style type="text/css">
input:-webkit-autofill {
	-webkit-box-shadow: 0 0 0px 1000px rgb(240, 240, 239) inset;
	-webkit-text-fill-color: #333;
}
</style>
</head>

<body>
	<!--  
	<h2>登陆</h2>
	<form action="/j_spring_security_check" method="post">
		<table>
			<tr>
				<td colspan="3"><font size="3" color="red">${msg}</font></td>
			</tr>
			<tr>
				<td>用户名</td>
				<td colspan="2"><input name="username" type="text" /></td>
			</tr>
			<tr>
				<td>密码</td>
				<td colspan="2"><input name="password" type="password" /></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="checkbox" name="_spring_security_remember_me"
					id="_spring_security_remember_me" value="true" /> <label
					for="remember-me">记住我一周</label></td>
			</tr>

			<tr>
				<td height="40" align="right"><strong> 验证码： </strong></td>
				<td><input name="code" type="text" id="code" /></td>
			</tr>


			<tr>
				<td colspan="2"><input type="submit" value="登陆"></td>
			</tr>
		</table>
	</form>


	<li><a href="register.jsp">注册</a></li>
	
	-->


	<!--顶部导航栏-->
		<div class="nav-bar">
			<div style="margin: 0 auto; width: 1120px; ">
				<div class="right">
					<ul class="header-menu">
						<li style="width: 80px;"><a href="#">首页</a></li>
						<li style="width: 80px;">
							<a href=""><img src="image/common/cattery.png" style="margin:0 5px -2px 0">猫舍</a>
						</li>
						</li>
						<li style="width: 80px;">
							<a href=""><img src="image/common/cat_basket.png" style="margin:0 5px -2px 0">猫篮</a>
						</li>
						<li style="width:20px">
							<a href=""><img src="image/common/top-line.png" style="margin:12px 0 -2px 5px"></li>
						<li style="width: 100px;"><a href="">买家中心<img src="image/common/arrowdown.png" style="margin:0 0 1px 5px;float: ;"></a>
							<ul>
								<li><a href="#">我的订单</a></li>
								<li><a href="#">已买到的猫咪</a></li>
								<li><a href="#">已预订的猫咪</a></li>
							</ul>
						</li>
						<li style="width: 100px;"><a href="">猫舍中心<img src="image/common/arrowdown.png" style="margin:0 0 1px 5px;float: ;"></a>
							<ul>
								<li><a href="#">我的订单</a></li>
								<li><a href="#">已买到的猫咪</a></li>
								<li><a href="#">已预订的猫咪</a></li>
							</ul>
						</li>

						<li style="width: 75px;"><a href="#" target="_blank" style="text-align: end;">联系客服</a></li>
					</ul>
				</div>
			</div>
			<div class="clear"> </div>

		</div>

	<div class="main">
		<div class="login-wrap">

			<!--左侧logo-->
			<div class="logo">
				<img src="img/logo.png" /> <img src="img/PetU.png"
					style="padding-bottom: 5px;" />
			</div>

			<!--右侧登陆注册界面-->
			<div class="mid-out">
				<div class="login-form">
					<div class="tabs">
						<a href="javascript:;" class="on">登录</a> <a href="javascript:;">注册</a>
					</div>
					<div class="alert-wrapper" id="alert"></div>

					<div class="content">

						<form id="tab-login" class="tab-page"
							action="/j_spring_security_check" method="post">
							<div class="input-wrapper">
								<div class="textbox-border textbox-wide">
									<span class="user"></span> <input id="username-textbox"
										class="textbox" name="username" style="margin-left: 8px;"
										type="text" placeholder="输入注册邮箱">
								</div>
							</div>
							<div class="input-wrapper" style="margin-top: 30px">
								<div class="textbox-border textbox-wide">
									<span class="password"></span> <input id="password-textbox"
										class="textbox" name="password" style="margin-left: 8px;"
										type="password" placeholder="输入密码" />
								</div>
							</div>
							<div class="button-wrapper">
							
						<%-- <%if(request.getQueryString().equals("error=1")){ %>	
						
							<%=request.getQueryString() %>
							<input id="login-button-account" 
									type="submit" value="呵呵" /> 
							<%}else if(request.getQueryString()==null){%>
					
						 --%>
						
					
								<input id="login-button-account" class="login-button" 
									type="submit" value="登录" />
	                 <%--   <%} %> --%>
							</div>

							<div class="input-wrapper" style="margin-top: 10px">
								<a href="#" class="font-common font13">登录遇到问题</a> <a href="#"
									class="font-common font13">忘记密码</a>
							</div>

						</form>

						<form id="tab-register" class="tab-page hide " method="post" action="UserRegisterAction.do">

							<div class="input-wrapper">
								<div class="textbox-border textbox-wide">
									<span class="user"></span> <input id="userName" name="userName"
										class="textbox" style="margin-left: 8px" type="text"
										placeholder="输入您的邮箱/您可以使用此邮箱登陆" value="">
								</div>
							</div>
							<div class="input-wrapper " style="margin-top: 30px">
								<div class="textbox-border textbox-wide">
									<span class="password"></span> <input id="password"
										name="password" class="textbox" style="margin-left: 8px"
										type="password" placeholder="输入密码" />
								</div>
							</div>
							<div class="input-wrapper" style="margin-top: 30px">
								<div class="textbox-border textbox-wide">
									<span class="password"></span> <input id="repassword"
										name="repassword" class="textbox" style="margin-left: 8px"
										type="password" placeholder="重新输入密码以确认" />
								</div>
							</div>
							<div class="button-wrapper">
								<input id="btn_register" class="login-button" type="submit"
									value="注册" />
							</div>
						</form>

					</div>
				</div>

			</div>

			<!--底部版权信息-->
			<div class="bottom">
				<span class="font-common font13 color-white">CopyRight
					&copy;2015 武汉可莫信息技术有限公司</span>

			</div>

		</div>

	</div>

	<script language="javascript" type="text/javascript">
		$('#tab-register').validator(
				{
					theme : 'simple_bottom',
					stopOnError : true,
					focusCleanup : true,
					timely : 1,
					//debug:false;
					fields : {
						"userName" : {
							rule : "required;email;",
							msg : {
								required : "对不起，用户名不能为空 ",
								email : "你的邮箱格式不对哦(。・＿・。)ﾉ",
							},
							invalid : function() {
								$("#userName").parent().css("border-bottom-color",
										"#e66359");
								//$("#username").prev().css("background-image", "url(img/user_erro.png)");
								$("#userName").siblings(".user").css(
										"background-image",
										"url(img/User_error.png)");
							},
							valid : function() {
								//$("#username").prev().css("background-image","url(img/User_pass.png)");
								$("#userName").parent().css("border-bottom-color",
										"#52B529");
								$("#userName").siblings(".user").css(
										"background-image",
										"url(img/User_pass.png)");

							}
						},
						"password" : {
							rule : "required;password",
							msg : {
								required : "密码不能为空哦(๑•ᴗ•๑)"
							},
							invalid : function() {
								$("#password").parent().css(
										"border-bottom-color", "#e66359");
								$("#password").siblings(".password").css(
										"background-image",
										"url(img/Lock_error.png)");
							},
							valid : function() {
								$("#password").parent().css(
										"border-bottom-color", "#52B529");
								$("#password").siblings(".password").css(
										"background-image",
										"url(img/Lock_pass.png)");
							}
						},
						"repassword" : {
							rule : "required;match(password);",
							invalid : function() {
								$("#repassword").parent().css(
										"border-bottom-color", "#e66359");
								$("#repassword").siblings(".password").css(
										"background-image",
										"url(img/Lock_error.png)");
							},
							valid : function() {
								$("#repassword").parent().css(
										"border-bottom-color", "#52B529");
								$("#repassword").siblings(".password").css(
										"background-image",
										"url(img/Lock_pass.png)");
							}
						}
					},
					//验证失败
					invalid : function(form) {
						//按钮动画效果
						$('#btn_register').css("background", "#CC3333");
						$('#btn_register').val("请重新填写 ");
						$('#btn_register').stop().delay(100).animate({
							left : -8
						}, 100).animate({
							left : 8
						}, 100).animate({
							left : -4
						}, 100).animate({
							left : 4
						}, 100).animate({
							left : -3
						}, 100).animate({
							left : 0
						}, 100);
					}
				});
	</script>


</body>
</html>
