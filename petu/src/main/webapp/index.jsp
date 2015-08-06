<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%@taglib uri="/struts-dojo-tags"  prefix="ss"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<ss:head/>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<!--链接标签图标-->
<link rel="shortcut icon" href="img/logo.ico">

<!--链接本地资源图片-->
<link rel="image_src" href="/img/immersive_slider_image.png" />

<!--链接css样式资源-->
<link rel="stylesheet" type="text/css" href="css/index/main.css" />
<link rel="stylesheet" type="text/css" href="css/index/index.css" />
<link rel="stylesheet" type="text/css"
	href="css/index/immersive-slider.css" />

<link rel="stylesheet" type="text/css" href="css/common/common.css" />
<link rel="stylesheet" type="text/css" href="css/common/nav-bar.css" />
<link rel="stylesheet" type="text/css" href="css/common/top-search.css" />
<link rel="stylesheet" type="text/css" href="css/common/footer.css" />

<!--链接JavaScript资源文件-->
<script src="js/jquery.min.js" type="text/javascript" charset="utf-8"></script>
<script src="js/jquery.immersive-slider.js" type="text/javascript"
	charset="utf-8"></script>
<script src="js/responsiveslides.min.js" type="text/javascript"
	charset="utf-8"></script>
<script src="js/easyResponsiveTabs.js" type="text/javascript"></script>
<title>宠你-首页</title>
<script type="text/javascript">
			$(document).ready(function() {
				$('#horizontalTab').easyResponsiveTabs({
					type: 'default', //Types: default, vertical, accordion           
					width: 'auto', //auto or any width like 600px
					fit: true // 100% fit in a container
				});
			});
</script>
<script type="text/javascript">
			var timeout = 100;
			var closetimer = 0;
			var ddmenuitem = 0;

			function menu_open() {
				menu_canceltimer();
				menu_close();
				ddmenuitem = $(this).find('ul').eq(0).css('visibility', 'visible');
			}

			function menu_close() {
				if (ddmenuitem) ddmenuitem.css('visibility', 'hidden');
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
</head>
<body>

<%-- <s:a href="CatListAction.do?pageNumber=1&typeId=1&rankId=1&priceLow=1&priceHigh=100000&pageId=1"></s:a> --%>
<%-- <ss:div id="divCatList" href="CatListAction.do?pageNumber=1&typeId=1&rankId=1&priceLow=1&priceHigh=100000&pageId=1"/> --%>


<%-- <s:form action="CatsByQueryAction.do?pageNumber=1&pageId=1">
	<s:textfield name="query"/>
	<ss:submit targets="divCatList" label="搜索"/>
</s:form>--%>

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

	<!--首页banner-->
	<div class="main">
		<div class="page_container">
			<div id="immersive_slider">
				<div class="slide" data-blurred="image/index/slide1_blurred.jpg">
					<div class="image">
					<a href="# target="_blank"><img src="image/index/middle-pic.png"Slider 1"></a>
					</div>
				</div>
			<div class="slide" data-blurred="image/index/slide2_blurred.jpg">
					<div class="image">
						<a href="#" target="_blank"><img src="image/index/middle-pic.png" alt="Slider 1"></a>
					</div>
			</div>
				<div class="slide" data-blurred="image/index/slide3_blurred.jpg">
					<div class="image">
					<a href="#" target="_blank"><img src="image/index/middle-pic.png" alt="Slider 1"></a>
		   			</div>
				</div>
				<a href="#" class="is-prev">&laquo;</a>
				<a href="#" class="is-next">&raquo;</a>
			</div>
		</div>

		<script type="text/javascript">
			$(document).ready(function() {
			$("#immersive_slider").immersive_slider({
				animation: "slide",
				container: ".main",
				});
			});
		</script>

		<div class="clearfix"></div>
	</div>
		
	<!--猫的繁育等级-->	
	<div style="width: 1120px; margin: 0 auto;">
		<div class="sap_tabs">
			<div id="horizontalTab" style="display: block; width: 100%; margin: 0px;">
				<ul class="resp-tabs-list">
					<li class="resp-tab-item" aria-controls="tab_item-0" role="tab"><span>宠物级</span></li>
					<li class="resp-tab-item" aria-controls="tab_item-1" role="tab"><span>繁育级</span></li>
					<li class="resp-tab-item" aria-controls="tab_item-2" role="tab"><span>赛级</span></li>
					<li class="more" style="float: right;padding-right: 0;"><a href="#">更多 ></a></li>
					<div class="clearfix"></div>
				</ul>

				<div class="tab-1 resp-tab-content" aria-labelledby="tab_item-0">
					<div class="smallpic">
			            <ul>
			            	<s:iterator value="catlist_pet" var="Cat">
			                      <s:set var="cname" value="#Cat.name"></s:set>
			            		<li><a href=""><img src="${initParam.fileHost}/image/cat5.png"></a><span class="gray_1 lh30"> <s:property value="#Cat.name"/>&nbsp;&nbsp;&nbsp;&nbsp;</span><span class="gray_3 lh30"><s:property value="#Cat.cattery.name"/></span><br/><span class="orange_1 font16 lh30" > &yen; <s:property value="#Cat.price" /></span></li>
			            	</s:iterator>
				        </ul>
		 			</div>

				</div>
				<div class="tab-1 resp-tab-content" aria-labelledby="tab_item-1">
					<div class="smallpic">
                 		<ul>
                 			<s:iterator value="catlist_breed" var="Cat">
								<li><a href=""><img src="${initParam.fileHost}/image/cat4.png"></a><span class="gray_1 lh30"><s:property value="#Cat.name"/>&nbsp;&nbsp;&nbsp;&nbsp;</span><span class="gray_3 lh30"><s:property value="#Cat.cattery.name"/></span><br/><span class="orange_1 font16 lh30" > &yen; <s:property value="#Cat.price" /></span></li>
							</s:iterator>
						</ul>
					</div>		
				</div>
				<div class="tab-1 resp-tab-content" aria-labelledby="tab_item-2">
					<div class="smallpic">
                 		<ul>
                 		<s:iterator value="catlist_match" var="Cat">
							<li><a href=""><img src="${initParam.fileHost}/image/cat7.png"></a><span class="gray_1 lh30"><s:property value="#Cat.name"/>&nbsp;&nbsp;&nbsp;&nbsp;</span><span class="gray_3 lh30"><s:property value="#Cat.cattery.name"/></span><br/><span class="orange_1 font16 lh30" > &yen; <s:property value="#Cat.price"/></span></li>
						</s:iterator>	
						</ul>
					</div>		
				</div>	
			</div>
		</div>
	</div>


	<!--繁育计划-->
	<div class="middle_2 center " style="width: 1120px; ">
		<div class="title ">
			<span class="font16 color-theme ">繁育计划</span>
			<span class="fr "><a href=" " class=" gray_3 ">更多 ></a></span>
		</div>
		<div class="smallpic ">
			<ul>
			<s:iterator value="planlist" var="Plan" >
			    <li>
					<div class="title f14 gray_1 "><s:property value="#Plan.cattery.name"/></div>
					<ul style="width:200px;margin-top:0; ">
					<li><a href=" "><img src="${initParam.fileHost}/image/cat5.png "></a><img src="image/index/female.png " style="margin:0 5px -2px 0 "><span class="gray_1 lh30 "><s:property value="#Plan.parentcatByMother.name"/>&nbsp;&nbsp;&nbsp;&nbsp;</span><span class="gray_3 lh30 "><s:property value="#Plan.motherColor"/></span></li>
					<li style="margin-bottom:0; "><a href=" "><img src="${initParam.fileHost}/image/cat4.png "></a><img src="image/index/male.png " style="margin:0 5px -2px 0 "><span class="gray_1 lh30 "><s:property value="#Plan.parentcatByFather.name"/>&nbsp;&nbsp;&nbsp;&nbsp;</span><span class="gray_3 lh30 "><s:property value="#Plan.fatherColor"/></span></li>
					</ul>
					<span class="f14 gray_1 lh40 ">繁育开始时间</span>&nbsp;&nbsp;&nbsp;&nbsp;<span class="f14 gray_3 lh40 "><s:property value="#Plan.time"/></span>
				</li>
			</s:iterator>
					
			
			</ul>
		</div>
	</div>	
	
	
	<!--底部页脚-->
	<div class="clear "></div>
	   <div class="foot ">
			<div class="foot_mian center " >
				<ul>
					<li class="li_1 "><a href=" ">新手指南</a></li>
					<li><a href=" ">报名指南</a></li>
					<li><a href=" ">购物指南</a></li>
					<li><a href=" ">支付配送说明</a></li>
				</ul>
	
				<ul>
					<li class="li_1 "><a href=" ">关于我们</a></li>
					<li><a href=" ">了解网站</a></li>
				</ul>
	
				<ul>
					<li class="li_1_last "><a href=" ">售后服务</a></li>
					<li><a href=" ">新浪微博</a></li>
					<li><a href=" ">微信公众号</a></li>
				</ul>
			<div class="copy ">Copyright&nbsp;&copy;&nbsp;2015&nbsp;&nbsp;&nbsp;&nbsp;武汉宠可莫科技有限公司</div>
		</div>
	</div>

</body>
</html>