<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%@taglib uri="/struts-dojo-tags"  prefix="ss"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<s:head/>
<ss:head/>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<!--链接标签图标-->
<link rel="shortcut icon" href="../img/logo.ico">

<link rel="stylesheet" type="text/css" href="../css/common/common.css" />
<link rel="stylesheet" type="text/css" href="../css/common/nav-bar.css" />
<link rel="stylesheet" type="text/css" href="../css/common/top-search.css" />
<link rel="stylesheet" type="text/css" href="../css/common/footer.css" />
<link rel="stylesheet" type="text/css" href="../css/all.css" />
<link rel="stylesheet" type="text/css" href="../css/style.css" />

<!--链接JavaScript资源文件-->
<script src="../js/jquery.min.js" type="text/javascript" charset="utf-8"></script>
<script src="../js/common.js" type="text/javascript" charset="utf-8" ></script>
<%-- <script src="../js/script.js" type="text/javascript" charset="utf-8" ></script> --%>
<title>宠你-首页</title>

<script type="text/javascript">
$(document).ready(function(){
	
	var type="";
	var hair="";
	var rank="";
	
							
	 $("#select1 dd a").click(function () {
		$(this).parent().addClass("selected").siblings().removeClass("selected");
		$(this).parent().parent().siblings().children($("dd")).removeClass("selected");
		if ($(this).parent().hasClass("select-all")) {
			$("#selectA").remove();
		} else {
			var copyThisA = $(this).parent().clone();
			var title=$(this).attr("label");
			if ($("#selectA").length > 0) {
				$("#selectA a").html($(this).attr("title")).attr("label",title);
				
			} else {
				$(".select-result dl").append(copyThisA.attr("id", "selectA"));
			}
		}
		type=$("#selectA a").attr("label");
		
		linkToUrl($(this)); 
		
	});
	
	
	
	$("#select2 dd a").click(function () {
		$(this).parent().addClass("selected").siblings().removeClass("selected");
		$(this).parent().parent().siblings().children($("dd")).removeClass("selected");
		if ($(this).parent().hasClass("select-all")) {
			$("#selectB").remove();
		} else {
			var copyThisA = $(this).parent().clone();
			var title=$(this).attr("label");
			if ($("#selectB").length > 0) {
				$("#selectB a").html($(this).attr("title")).attr("label",title);
			} else {
				$(".select-result dl").append(copyThisA.attr("id", "selectB"));
			}
		}
		hair=$("#selectB a").attr("label");
		linkToUrl($(this)); 
	});
	
	$("#select3 dd a").click(function () {
		$(this).parent().addClass("selected").siblings().removeClass("selected");
		$(this).parent().parent().siblings().children($("dd")).removeClass("selected");
		if ($(this).parent().hasClass("select-all")) {
			$("#selectC").remove();
		} else {
			var copyThisA = $(this).parent().clone();
			var title=$(this).attr("label");
			if ($("#selectC").length > 0) {
				$("#selectC a").html($(this).attr("title")).attr("label",title);
			} else {
				$(".select-result dl").append(copyThisA.attr("id", "selectC"));
			}
		}
		rank=$("#selectC a").attr("label");
		linkToUrl($(this)); 
	});
	
	$(document).on("click","#selectA",function () {
		type="";
		linkToUrl($("#selectA").children());
		$(this).remove();
		$("#select1 .select-all").addClass("selected").siblings().removeClass("selected");
	});
	
	$(document).on("click", "#selectB",function () {
		hair="";
		linkToUrl($("#selectB").children());
		$(this).remove();
		$("#select2 .select-all").addClass("selected").siblings().removeClass("selected");
	});
	
	$(document).on("click","#selectC", function () {
		rank="";
		linkToUrl($("#selectC").children());
		$(this).remove();
		$("#select3 .select-all").addClass("selected").siblings().removeClass("selected");
	});
	
	$(document).on("click", ".select dd",function () {
		if ($(".select-result dd").length > 1) {
			$(".select-no").hide();
		} else {
			$(".select-no").show();
		}
	});
	
	function linkToUrl(meth) {  
    var host = "CatListAction.do";  
    var Url;
    Url=host+"?"+"pageNumberStr=1&"+"typeIdStr="+type+"&"+"rankIdStr="+rank+"&priceLowStr=1&priceHighStr=100000";
    //alert(Url);
    meth.attr("href",Url);
    } 
});

function showMore(){
	$("#typeMore").toggle("fast","linear");
    }
</script>
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
		<div class="all_4_1">
			<ul class="select">
		<li class="select-result" style="padding:10px 0 5px 100px;">
			<dl>
				<dt>所有猫咪浏览&nbsp;>&nbsp;</dt>
				<dd class="select-no">&nbsp;</dd>
			</dl>
		</li>
	</ul>
	</div>
	<div class="all_4_1">
		<ul class="select">
		<li class="select-list" id="select1">
			<dl >
				<dt>品种 &nbsp;&nbsp;</dt>
				<dd class="select-all selected" ><ss:a href="#">全部</ss:a></dd>
				<dd><ss:a href="CatListAction.do?pageNumberStr=1&typeIdStr=1&rankIdStr=1&priceLowStr=1&priceHighStr=100000"title="布偶猫" targets="main_cat_list" label="1">布偶猫</ss:a></dd>
				<dd><ss:a href="#"title="波斯猫" targets="_blank" label="2">波斯猫</ss:a></dd> 
				<dd><ss:a href="#"title="挪威森林猫" targets="_blank" label="3">挪威森林猫</ss:a></dd>
				<dd><ss:a href="#"title="缅甸猫" targets="_blank" label="4">缅甸猫</ss:a></dd>
				<dd><ss:a href="#"title="伯曼猫" targets="_blank" label="5">伯曼猫</ss:a></dd>
				<dd><ss:a href="#"title="英国短毛猫" targets="_blank" label="6">英国短耳猫</ss:a></dd>
				<dd><ss:a href="#"title="美国短毛猫" targets="_blank" label="7" >美国短毛猫</ss:a></dd>
				<a class="right" href="#" onclick="showMore()">更多></a>
			</dl>
			<dl id="typeMore" style="display: none;">
				<dd><ss:a href="#"title="1">布偶猫</ss:a></dd>
				<dd><ss:a href="#"title="2">波斯猫</ss:a></dd>
				<dd><ss:a href="#"title="3">挪威森林猫</ss:a></dd>
				<dd><ss:a href="#"title="4">缅甸猫</ss:a></dd>
				<dd><ss:a href="#"title="5">伯曼猫</ss:a></dd>
			</dl>
		</li>
		<li class="select-list" id="select2">
			<dl >
				<dt>毛长 &nbsp;&nbsp;&nbsp;&nbsp;</dt>
				<dd class="select-all selected"><ss:a href="#">全部</ss:a></dd>
				<dd><ss:a href="#" title="长毛" targets="_blank" label="1">长毛</ss:a></dd>
				<dd><ss:a href="#" title="短毛" targets="_blank" label="2">短毛</ss:a></dd>
				<dd><ss:a href="#" title="无毛" targets="_blank" label="3">无毛</ss:a></dd>
			</dl>
		</li>
		<li class="select-list" id="select3" style="border-bottom: none;">
			<dl >
				<dt>等级&nbsp;&nbsp;&nbsp;&nbsp; </dt>
				<dd class="select-all selected"><ss:a href="#">全部</ss:a></dd>
				<dd><ss:a href="#" title="宠物级" targets="_blank" label="1">宠物级</ss:a></dd>
				<dd><ss:a href="#" title="繁育级" targets="_blank" label="2">繁育级</ss:a></dd>
				<dd><ss:a href="#" title="赛级" targets="_blank" label="3">赛级</ss:a></dd>
			</dl>
		</li>
		</ul>
	</div>
	<div class="all_4_1">
		<span class="gray_2">价格</span>
		<div class="pz">
		<input type="text" name="" id="q" value=" " class="jiage" style="margin-left:20px"/>&nbsp;到&nbsp;
		<input type="text" name="" id="q" value=" " class="jiage" />&nbsp;元
		<button type="button" class="button"  style="cursor:pointer">确定</button>
		</div>
	</div>
	
	 <%-- <s:form id="form1" action="CatListAction.do" method="post" >
	 <s:param name="pageNumberStr" value="1"></s:param>
 	 <s:param name="typeIdStr" value="1"></s:param>
	 <s:param name="rankIdStr" value="1"></s:param>
 	 <s:param name="priceLowStr" value="1"></s:param>
 	 <s:param name="priceHighStr" value="100000"></s:param> 
 	 <s:param name="pageIdStr" value="1"></s:param>
 	  <ss:submit targets="main_cat_list" ></ss:submit> 
 	 </s:form>  --%>
 	 <ss:a
		href="CatListAction.do?pageNumberStr=1&typeIdStr=1&rankIdStr=1&priceLowStr=1&priceHighStr=100000" value="123"
		targets="main_cat_list">update</ss:a>
	<ss:div id="main_cat_list"></ss:div>
	<%-- <div class="middle_1">
	<div class="smallpic">
			<ul>
			<li><a href=""><img src="${initParam.fileHost}/image/cat1.png"></a><span class="gray_1 lh30"><s:property value="#Cat.name"/>&nbsp;&nbsp;&nbsp;&nbsp;</span><span class="gray_3 lh30"><s:property value="#Cat.cattery.name"/></span><br/><span class="orange_1 f18 lh30" > &yen; <s:property value="#Cat.price"/></span></li>
				<li><a href=""><img src="${initParam.fileHost}/image/cat2.png"></a><span class="gray_1 lh30">英国蓝猫&nbsp;&nbsp;&nbsp;&nbsp;</span><span class="gray_3 lh30">D&C名猫舍</span><br/><span class="orange_1 f18 lh30" > &yen; 30,000</span></li>
				<li><a href=""><img src="${initParam.fileHost}/image/cat3.png"></a><span class="gray_1 lh30">英国蓝猫&nbsp;&nbsp;&nbsp;&nbsp;</span><span class="gray_3 lh30">D&C名猫舍</span><br/><span class="orange_1 f18 lh30" > &yen; 30,000</span></li>
				<li><a href=""><img src="${initParam.fileHost}/image/cat4.png"></a><span class="gray_1 lh30">英国蓝猫&nbsp;&nbsp;&nbsp;&nbsp;</span><span class="gray_3 lh30">D&C名猫舍</span><br/><span class="orange_1 f18 lh30" > &yen; 30,000</span></li>
				<li><a href=""><img src="${initParam.fileHost}/image/cat5.png"></a><span class="gray_1 lh30">英国蓝猫&nbsp;&nbsp;&nbsp;&nbsp;</span><span class="gray_3 lh30">D&C名猫舍</span><br/><span class="orange_1 f18 lh30" > &yen; 30,000</span></li>
				<li><a href=""><img src="${initParam.fileHost}/image/cat1.png"></a><span class="gray_1 lh30">英国蓝猫&nbsp;&nbsp;&nbsp;&nbsp;</span><span class="gray_3 lh30">D&C名猫舍</span><br/><span class="orange_1 f18 lh30" > &yen; 30,000</span></li>
				<li><a href=""><img src="${initParam.fileHost}/image/cat2.png"></a><span class="gray_1 lh30">英国蓝猫&nbsp;&nbsp;&nbsp;&nbsp;</span><span class="gray_3 lh30">D&C名猫舍</span><br/><span class="orange_1 f18 lh30" > &yen; 30,000</span></li>
				<li><a href=""><img src="${initParam.fileHost}/image/cat3.png"></a><span class="gray_1 lh30">英国蓝猫&nbsp;&nbsp;&nbsp;&nbsp;</span><span class="gray_3 lh30">D&C名猫舍</span><br/><span class="orange_1 f18 lh30" > &yen; 30,000</span></li>
				<li><a href=""><img src="${initParam.fileHost}/image/cat4.png"></a><span class="gray_1 lh30">英国蓝猫&nbsp;&nbsp;&nbsp;&nbsp;</span><span class="gray_3 lh30">D&C名猫舍</span><br/><span class="orange_1 f18 lh30" > &yen; 30,000</span></li>
				<li><a href=""><img src="${initParam.fileHost}/image/cat5.png"></a><span class="gray_1 lh30">英国蓝猫&nbsp;&nbsp;&nbsp;&nbsp;</span><span class="gray_3 lh30">D&C名猫舍</span><br/><span class="orange_1 f18 lh30" > &yen; 30,000</span></li>
				<li><a href=""><img src="${initParam.fileHost}/image/cat1.png"></a><span class="gray_1 lh30">英国蓝猫&nbsp;&nbsp;&nbsp;&nbsp;</span><span class="gray_3 lh30">D&C名猫舍</span><br/><span class="orange_1 f18 lh30" > &yen; 30,000</span></li>
				<li><a href=""><img src="${initParam.fileHost}/image/cat2.png"></a><span class="gray_1 lh30">英国蓝猫&nbsp;&nbsp;&nbsp;&nbsp;</span><span class="gray_3 lh30">D&C名猫舍</span><br/><span class="orange_1 f18 lh30" > &yen; 30,000</span></li>
				<li><a href=""><img src="${initParam.fileHost}/image/cat3.png"></a><span class="gray_1 lh30">英国蓝猫&nbsp;&nbsp;&nbsp;&nbsp;</span><span class="gray_3 lh30">D&C名猫舍</span><br/><span class="orange_1 f18 lh30" > &yen; 30,000</span></li>
				<li><a href=""><img src="${initParam.fileHost}/image/cat4.png"></a><span class="gray_1 lh30">英国蓝猫&nbsp;&nbsp;&nbsp;&nbsp;</span><span class="gray_3 lh30">D&C名猫舍</span><br/><span class="orange_1 f18 lh30" > &yen; 30,000</span></li>
				<li><a href=""><img src="${initParam.fileHost}/image/cat5.png"></a><span class="gray_1 lh30">英国蓝猫&nbsp;&nbsp;&nbsp;&nbsp;</span><span class="gray_3 lh30">D&C名猫舍</span><br/><span class="orange_1 f18 lh30" > &yen; 30,000</span></li> 
			</ul>
		</div>
		</div>--%>
	<div class="page">
		<span style="margin-right:20px;"><a href="">上一页</a></span>
		<span class="gray_2" style="margin-right:10px;">第&nbsp;1&nbsp;页</span>
		<span class="gray_2">共&nbsp;16&nbsp;页</span>
		<span  style="margin-left:20px;"><a href="">下一页</a></span>
		<input type="button" value="AJAX" onclick="ajax()">
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