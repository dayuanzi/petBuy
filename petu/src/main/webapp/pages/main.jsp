<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<link rel="stylesheet" type="text/css" href="css/common/common.css" />
<link rel="stylesheet" type="text/css" href="css/common/nav-bar.css" />
<link rel="stylesheet" type="text/css" href="css/common/top-search.css" />
<link rel="stylesheet" type="text/css" href="css/common/footer.css" />

<script type="text/javascript" src="js/common.js"></script>
<script type="text/javascript" src="js/jquery.min.js"></script>
<title>Insert title here</title>
</head>
<body>
<!--顶部导航栏-->
		<div class="nav-bar">
			<div style="margin: 0 auto; width: 1120px; ">
				<div class="header-login">
					<ul class="header-grid">
						<li>您好，请</li>
						<li><a href="login.html" style="margin-left: 0px;">登录</a></li>
						<li>或</li>
						<li><a href="sign up" style="margin-left: 0px;">注册 </a> </li>
					</ul>

					<div class="clearfix"> </div>
				</div>

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

		<!--搜索部分  -->
		<div class="top_search">
			<div class="logo">
				<a href="#"><img src="image/common/logo-green.png" alt="可莫喵星人" title="可莫喵星人"></a>
			</div>
			<div class="right" style="float:right;margin:30px 0 0 0;">
				<div class="search ">
					<form id="search_form" method="get" action="http://www.boqii.com/search" target="_blank">
						<input type="text" id="keyword" name="keywords" class="search_edit" value="请输入关键字" onfocus="this.value=''" onblur="if(this.value==" "){this.value=" "}" style="color: #AAAAAA;">
						<input type="submit" class="search_btn " id="button" name="button" value="搜 索">
					</form>

				</div>

				<div class="search_link right">
					<ul>
						<li><a href="">苏格兰折耳</a></li>
						<li><a href="">英国蓝猫</a></li>
						<li><a href="">布偶猫</a></li>
						<li><a href="">暹罗猫</a></li>
					</ul>

				</div>
			</div>
		</div>


</body>
</html>