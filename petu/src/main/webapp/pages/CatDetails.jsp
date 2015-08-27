<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="../css/common/common.css" />
<link rel="stylesheet" type="text/css" href="../css/common/nav-bar.css" />
<link rel="stylesheet" type="text/css" href="../css/common/top-search.css" />
<link rel="stylesheet" type="text/css" href="../css/common/footer.css" />
<link rel="stylesheet" type="text/css" href="../css/all.css" />
<!--链接JavaScript资源文件-->
<script src="../js/jquery.min.js" type="text/javascript" charset="utf-8"></script>
<script src="../js/common.js" type="text/javascript" charset="utf-8" ></script>
<title>Insert title here</title>
</head>
<body>
<s:set name="sex" value="cat.sex"></s:set>
<s:set name="immune" value="cat.immune"></s:set>
<%
Map<Integer,String> sexMap=new HashMap<Integer,String>();
sexMap.put(0, "男孩");
sexMap.put(1, "女孩");
Map<Integer,String> immuneMap=new HashMap<Integer,String>();
immuneMap.put(0, "未除虫免疫");
immuneMap.put(1, "已除虫免疫");
Integer sex=Integer.valueOf(request.getAttribute("sex").toString());
Integer immune=Integer.valueOf(request.getAttribute("immune").toString());

%>


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
						<li style="width: 80px;"><a href=""><img src="../image/common/cattery.png" style="margin:0 5px -2px 0">猫舍</a></li>
						<li style="width: 80px;"><a href=""><img src="../image/common/cat_basket.png" style="margin:0 5px -2px 0">猫篮</a></li>
						<li style="width:20px"><a href=""><img src="../image/common/top-line.png" style="margin:12px 0 -2px 5px"></a></li>
						<li style="width: 100px;"><a href="">买家中心<img src="../image/common/arrowdown.png" style="margin:0 0 1px 5px;float: ;"></a>
							<ul>
								<li><a href="#">我的订单</a></li>
								<li><a href="#">已买到的猫咪</a></li>
								<li><a href="#">已预订的猫咪</a></li>
							</ul>
						</li>
						<li style="width: 100px;"><a href="">猫舍中心<img src="../image/common/arrowdown.png" style="margin:0 0 1px 5px;float: ;"></a>
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
				<a href="#"><img src="../image/common/logo-green.png" alt="可莫喵星人" title="可莫喵星人"></a>
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

<div class="main_4 center">
	<div class="title"><s:property value="cat.cattery.name"/></div>
	<div class="detail">
		<img src="${initParam.fileHost}/image/<s:property value="mainimage.path"/>" width="400" height="320">
		<div class="detail_1">
			<span class="font18 lh60"><s:property value="cat.name"/></span><br/>
			<span class="font14 lh40 gray_2">价格&nbsp;&nbsp;&nbsp;&nbsp;</span><span class="font18 lh40 orange_1">&yen;&nbsp;<s:property value="cat.price"/></span><br/>
			<span class="font14 lh40 gray_2">等级&nbsp;&nbsp;&nbsp;&nbsp;</span><span class="font16 lh40 "><s:property value="cat.rank.rank"/></span><br/>
			<span class="font14 lh40 gray_2">证书&nbsp;&nbsp;&nbsp;&nbsp;</span><span class="font16 lh40 "><s:property value="cat.pedigreeCertificate.pedigreeCertificate"/></span><br/>
			<span class="font14 lh40 gray_2">地点&nbsp;&nbsp;&nbsp;&nbsp;</span><span class="font16 lh40 "><s:property value="cat.cattery.address"/></span><br/>
			<div class="goumai"><a href="">立即购买</a></div>
		<div class="jiaru"><a href="">加入猫篮子</a></div>
		</div>		
		<div class="clear"></div>
	</div>
	<div class="left">
		<div class="lefttop">
		<div class="title"><s:property value="cat.cattery.name"/></div>
		<div style="padding:0 20px;"><span class="lh40">WCF注册猫舍/英短蓝猫</span><br/>
		地址：<s:property value="cat.cattery.address"/></div>
		</div>
		<div class="leftmid"><a href="">他家的其他待售猫咪</a></div>
		<div class="leftdown"></div>
	</div>
	<div class="right">
		<div class="title">宠物详情</div>
		<table class="table">
			<tr><td>名字：<s:property value="cat.name"/></td><td>性别：<%=sexMap.get(sex) %></td><td>品种：<s:property value="cat.catype.catype"/></td></tr>
			<tr><td>年龄：幼年猫（12个月内）</td><td>除虫免疫：<%=immuneMap.get(immune) %></td><td>是否绝育：未绝育</td></tr>
		</table>
		<div class="rightdown"></div>
	</div>
</div>
<div class="clear"></div>
<div class="foot">
	<div class="foot_mian center">
		<ul>
			<li class="li_1"><a href="">新手指南</a></li>
			<li><a href="">报名指南</a></li>
			<li><a href="">购物指南</a></li>
			<li><a href="">支付配送说明</a></li>
		</ul>

		<ul>
			<li class="li_1"><a href="">关于我们</a></li>
			<li><a href="">了解网站</a></li>
		</ul>

		<ul>
			<li class="li_1_last"><a href="">售后服务</a></li>
			<li><a href="">新浪微博</a></li>
			<li><a href="">微信公众号</a></li>
		</ul>
		<div class="copy">Copyright&nbsp;&copy;&nbsp;2015&nbsp;&nbsp;&nbsp;&nbsp;武汉宠可莫科技有限公司</div>
	</div>

</div>
名：<s:property value="cat.name"/><!--猫名  -->
猫舍：<s:property value="cat.cattery.name"/><!-- 猫舍名 -->
品种：<s:property value="cat.catype.catype"/> <!-- 猫 品种-->
繁育等级：<s:property value="cat.rank.rank"/><!-- 猫繁育等级 -->
性别:<s:property value="cat.sex"/><!-- 猫性别 -->
认证种类:<s:property value="cat.pedigreeCertificate.pedigreeCertificate"/><!-- 猫认证种类 -->
除虫免疫：<s:property value="cat.immune"/><!--猫是否除虫免疫  -->
出生日期：<s:property value="cat.birthday"/><!-- 猫出生日期 -->
价格：<s:property value="cat.price"/><!-- 猫价格 -->
老价格：<s:property value="cat.oldprice"/><!--  -->
头像：<s:property value="mainimage.path"/><!-- 猫头像路径 -->

<s:iterator value="imagelist" var="image"><!-- 猫详情图片 -->
<s:property value="#image.path"/>
</s:iterator>

</body>
</html>