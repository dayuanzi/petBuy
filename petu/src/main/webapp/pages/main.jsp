<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%@taglib uri="/struts-dojo-tags"  prefix="ss"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<!--链接标签图标-->
<link rel="shortcut icon" href="../img/logo.ico">

<link rel="stylesheet" type="text/css" href="../css/common/common.css" />
<link rel="stylesheet" type="text/css" href="../css/common/nav-bar.css" />
<link rel="stylesheet" type="text/css" href="../css/common/top-search.css" />
<link rel="stylesheet" type="text/css" href="../css/common/footer.css" />
<link rel="stylesheet" type="text/css" href="../css/all.css" />

<!--链接JavaScript资源文件-->
<script src="../js/jquery.min.js" type="text/javascript" charset="utf-8"></script>
<script src="../js/common.js" type="text/javascript" charset="utf-8" ></script>
<title>宠你-首页</title>

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
							<a href=""><img src="../image/common/cattery.png" style="margin:0 5px -2px 0">猫舍</a>
						</li>
						</li>
						<li style="width: 80px;">
							<a href=""><img src="../image/common/cat_basket.png" style="margin:0 5px -2px 0">猫篮</a>
						</li>
						<li style="width:20px">
							<a href=""><img src="../image/common/top-line.png" style="margin:12px 0 -2px 5px"></li>
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
		
		<div class="main-content center">
		<div class="all_4"><a href="">所有猫咪浏览&nbsp;>&nbsp;</a></div>
		<div class="all_4_1">
		<span class="gray_2">品种</span>
	<ul class="pz">				
			<li><a href="">布偶猫</a></li><li><a href="">波斯猫</a></li><li><a href="">罗威森林猫</a></li>			<li><a href="">缅因猫</a></li>			<li><a href="">伯曼猫</a></li>			<li><a href="">索马里猫</a></li><li><a href="">土耳其梵猫</a></li>			<li><a href="">英国短耳猫</a></li>			<li><a href="">布偶猫</a></li>
			<li><a href="">波斯猫</a></li>			<li><a href="">罗威森林猫</a></li>			<li><a href="">缅因猫</a></li>
			<li><a href="">布偶猫</a></li>			<li><a href="">波斯猫</a></li>			<li><a href="">罗威森林猫</a></li>
			<li><a href="">缅因猫</a></li>			<li><a href="">伯曼猫</a></li>			<li><a href="">索马里猫</a></li>
			<li><a href="">土耳其梵猫</a></li>			<li><a href="">英国短耳猫</a></li>			<li><a href="">布偶猫</a></li>			<li><a href="">波斯猫</a></li>			<li><a href="">罗威森林猫</a></li>			<li><a href="">缅因猫</a></li>			<li><a href="">布偶猫</a></li>			<li><a href="">波斯猫</a></li>		<li><a href="">罗威森林猫</a></li>			<li><a href="">缅因猫</a></li>			<li><a href="">伯曼猫</a></li><li><a href="">索马里猫</a></li>			<li><a href="">土耳其梵猫</a></li>			<li><a href="">英国短耳猫</a></li>
			<li><a href="">布偶猫</a></li>			<li><a href="">波斯猫</a></li>			<li><a href="">罗威森林猫</a></li>
			<li><a href="">缅因猫</a></li>
	</ul>
		<div class="clear"></div>
		<span class="gray_2">毛长</span>
		<ul class="pz">	
			<li><a href="">长毛</a></li>
			<li><a href="">短毛</a></li>
			<li><a href="">无毛</a></li>
		</ul>
		<div class="clear"></div>
		<span class="gray_2">等级</span>
		<ul class="pz">	
			<li><a href="">宠物级</a></li>
			<li><a href="">繁育级</a></li>
			<li><a href="">赛级</a></li>
		</ul>
		<div class="clear"></div>
	</div>
	<div class="all_4_1">
		<span class="gray_2">价格</span>
		<div class="pz">
		<input type="text" name="" id="q" value=" " class="jiage" style="margin-left:20px"/>&nbsp;到&nbsp;
		<input type="text" name="" id="q" value=" " class="jiage" />&nbsp;元
		<button type="button" class="button"  style="cursor:pointer">确定</button>
		</div>
	</div>
	<div class="middle_1">
	<div class="smallpic">
			<ul>
				<li><a href=""><img src="image/cat1.png"></a><span class="gray_1 lh30">英国蓝猫&nbsp;&nbsp;&nbsp;&nbsp;</span><span class="gray_3 lh30">D&C名猫舍</span><br/><span class="orange_1 f18 lh30" > &yen; 30,000</span></li>
				<li><a href=""><img src="image/cat2.png"></a><span class="gray_1 lh30">英国蓝猫&nbsp;&nbsp;&nbsp;&nbsp;</span><span class="gray_3 lh30">D&C名猫舍</span><br/><span class="orange_1 f18 lh30" > &yen; 30,000</span></li>
				<li><a href=""><img src="image/cat3.png"></a><span class="gray_1 lh30">英国蓝猫&nbsp;&nbsp;&nbsp;&nbsp;</span><span class="gray_3 lh30">D&C名猫舍</span><br/><span class="orange_1 f18 lh30" > &yen; 30,000</span></li>
				<li><a href=""><img src="image/cat4.png"></a><span class="gray_1 lh30">英国蓝猫&nbsp;&nbsp;&nbsp;&nbsp;</span><span class="gray_3 lh30">D&C名猫舍</span><br/><span class="orange_1 f18 lh30" > &yen; 30,000</span></li>
				<li><a href=""><img src="image/cat5.png"></a><span class="gray_1 lh30">英国蓝猫&nbsp;&nbsp;&nbsp;&nbsp;</span><span class="gray_3 lh30">D&C名猫舍</span><br/><span class="orange_1 f18 lh30" > &yen; 30,000</span></li>
				<li><a href=""><img src="image/cat1.png"></a><span class="gray_1 lh30">英国蓝猫&nbsp;&nbsp;&nbsp;&nbsp;</span><span class="gray_3 lh30">D&C名猫舍</span><br/><span class="orange_1 f18 lh30" > &yen; 30,000</span></li>
				<li><a href=""><img src="image/cat2.png"></a><span class="gray_1 lh30">英国蓝猫&nbsp;&nbsp;&nbsp;&nbsp;</span><span class="gray_3 lh30">D&C名猫舍</span><br/><span class="orange_1 f18 lh30" > &yen; 30,000</span></li>
				<li><a href=""><img src="image/cat3.png"></a><span class="gray_1 lh30">英国蓝猫&nbsp;&nbsp;&nbsp;&nbsp;</span><span class="gray_3 lh30">D&C名猫舍</span><br/><span class="orange_1 f18 lh30" > &yen; 30,000</span></li>
				<li><a href=""><img src="image/cat4.png"></a><span class="gray_1 lh30">英国蓝猫&nbsp;&nbsp;&nbsp;&nbsp;</span><span class="gray_3 lh30">D&C名猫舍</span><br/><span class="orange_1 f18 lh30" > &yen; 30,000</span></li>
				<li><a href=""><img src="image/cat5.png"></a><span class="gray_1 lh30">英国蓝猫&nbsp;&nbsp;&nbsp;&nbsp;</span><span class="gray_3 lh30">D&C名猫舍</span><br/><span class="orange_1 f18 lh30" > &yen; 30,000</span></li>
				<li><a href=""><img src="image/cat1.png"></a><span class="gray_1 lh30">英国蓝猫&nbsp;&nbsp;&nbsp;&nbsp;</span><span class="gray_3 lh30">D&C名猫舍</span><br/><span class="orange_1 f18 lh30" > &yen; 30,000</span></li>
				<li><a href=""><img src="image/cat2.png"></a><span class="gray_1 lh30">英国蓝猫&nbsp;&nbsp;&nbsp;&nbsp;</span><span class="gray_3 lh30">D&C名猫舍</span><br/><span class="orange_1 f18 lh30" > &yen; 30,000</span></li>
				<li><a href=""><img src="image/cat3.png"></a><span class="gray_1 lh30">英国蓝猫&nbsp;&nbsp;&nbsp;&nbsp;</span><span class="gray_3 lh30">D&C名猫舍</span><br/><span class="orange_1 f18 lh30" > &yen; 30,000</span></li>
				<li><a href=""><img src="image/cat4.png"></a><span class="gray_1 lh30">英国蓝猫&nbsp;&nbsp;&nbsp;&nbsp;</span><span class="gray_3 lh30">D&C名猫舍</span><br/><span class="orange_1 f18 lh30" > &yen; 30,000</span></li>
				<li><a href=""><img src="image/4_1.png"></a><span class="gray_1 lh30">英国蓝猫&nbsp;&nbsp;&nbsp;&nbsp;</span><span class="gray_3 lh30">D&C名猫舍</span><br/><span class="orange_1 f18 lh30" > &yen; 30,000</span></li>
			</ul>
		</div>
		</div>
	<div class="page">
		<span style="margin-right:20px;"><a href="">上一页</a></span>
		<span class="gray_2" style="margin-right:10px;">第&nbsp;1&nbsp;页</span>
		<span class="gray_2">共&nbsp;16&nbsp;页</span>
		<span  style="margin-left:20px;"><a href="">下一页</a></span>
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

	
</body>
</html>