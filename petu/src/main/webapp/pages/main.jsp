<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%@taglib uri="/struts-dojo-tags"  prefix="ss"%>
<%-- <%@taglib uri="/struts-jquery-tags" prefix="sj"%> --%>
<%-- <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> --%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script src="../js/jquery.min.js" type="text/javascript" charset="utf-8"></script>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<s:head/>
<ss:head />



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
/*
 * MAP对象，实现MAP功能
 *
 * 接口：
 * size()     获取MAP元素个数
 * isEmpty()  判断MAP是否为空
 * clear()    删除MAP所有元素
 * put(key, value)   向MAP中增加元素（key, value) 
 * remove(key)    删除指定KEY的元素，成功返回True，失败返回False
 * get(key)    获取指定KEY的元素值VALUE，失败返回NULL
 * isContainsKey(key)  判断MAP中是否含有指定KEY的元素
 * isContainsValue(value) 判断MAP中是否含有指定VALUE的元素
 * valueArray()    获取MAP中所有VALUE的数组（ARRAY）
 * keyArray()     获取MAP中所有KEY的数组（ARRAY）
 *
 * 例子：
 * var map = new Map();
 *
 * map.put("key", "value");
 * var val = map.get("key")
 * ……
 *
 */

//定义map       
function Map()       
{        
this.container = {};        
} 
 

   
//将key-value放入map中       
Map.prototype.put = function(key,value){        
try{        
     
if(key!=null && key != "")       
 this.container[key] = value;        
   
}catch(e){        
return e;        
}        
};        
   
//根据key从map中取出对应的value       
Map.prototype.get = function(key){        
try{        
   
return this.container[key];        
   
}catch(e){        
return e;        
}        
}; 

Map.prototype.set=function(key,value){
	
	try{
		this.remove(key);
		this.put(key,value);
		
		
	}catch(e){
		return e;
	}
}
   
//判断map中是否包含指定的key       
Map.prototype.isContainsKey=function(key){       
   
try{       
for(var p in this.container)       
{       
   if(this.p==key)       
      return true;       
}       
   
return false;       
   
}catch(e){       
return e;       
}       
   
};       
   
//判断map中是否包含指定的value       
Map.prototype.isContainsValue = function(value){        
try{        
   
for(var p in this.container)       
{        
if(this.container[p] === value)        
  return true;        
}        
   
return false;        
   
}catch(e){        
return e;        
}        
};        
   
   
//删除map中指定的key       
Map.prototype.remove = function(key){        
try{        
   
delete this.container[key];        
   
}catch(e){        
return e;        
}        
};        
   
//清空map       
Map.prototype.clear = function(){        
try{        
delete this.container;        
this.container = {};        
   
}catch(e){        
 return e;        
}        
};  

   
 //判断map是否为空       
Map.prototype.isEmpty = function(){        
     
if(this.keyArray().length==0)       
 return true;       
else        
 return false;       
};        
   
//获取map的大小       
Map.prototype.size=function(){       
   
return this.keyArray().length;       
};       
   
//返回map中的key值数组       
Map.prototype.keyArray=function(){       
    
  var keys=new Array();       
  for(var p in this.container)       
  {       
      keys.push(p);       
  }       
      
  return keys;       
} 
   
//返回map中的value值数组       
Map.prototype.valueArray=function(){       
    
 var values=new Array();       
 var keys=this.keyArray();       
 for(var i=0;i<keys.length;i++)       
 {       
    values.push(this.container[keys[i]]);       
 }       
        
 return values;       
} ; 

var type=null;
var hair=null;
var rank=null;
var priceLow=1;
var priceHigh=100000;
var pageNumber=1;


var map=new Map();
map.put("typeIdStr",type);
map.put("rankIdStr",rank);
map.put("priceLowStr",priceLow);
map.put("priceHighStr",priceHigh);
map.put("pageNumberStr",pageNumber);

 
 $(document).ready(function(){
	
	 $('#main_cat_list').load('CatListAction.do?pageNumberStr=1&priceLowStr=1&priceHighStr=100000');
	 var pageNow=document.getElementById ("pageNow");
	 pageNow.innerHTML="第  "+pageNumber+" 页 ";
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
		map.set("typeIdStr",$("#selectA a").attr("label"));
		
		
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
		map.set("hairIdStr",$("#selectB a").attr("label"));
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
		map.set("rankIdStr",$("#selectC a").attr("label"));
		linkToUrl($(this)); 
	});
	
	$(document).on("click","#selectA",function () {
		map.remove("typeIdStr");
		linkToUrl($("#selectA").children());
		$(this).remove();
		$("#select1 .select-all").addClass("selected").siblings().removeClass("selected");
	});
	
	$(document).on("click", "#selectB",function () {
		map.remove("hairIdStr");
		linkToUrl($("#selectB").children());
		$(this).remove();
		$("#select2 .select-all").addClass("selected").siblings().removeClass("selected");
	});
	
	$(document).on("click","#selectC", function () {
		map.remove("rankIdStr");
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
    var host = "CatListAction.do?";
    pageNumber=1;
    map.set("pageNumberStr",1);
    doPost();
    pageNow.innerHTML="第  1 页 ";
    } 

});
 
 function doPost(){
		
		for(var key in map.container){
			
			if(map.get(key)==""||map.get(key)==null){
				map.remove(key);
			}
		}
		
		$.post("CatListAction.do",map.container,
			   function(data){
				   
				   $('#main_cat_list').html(data);
			   }
		);
	}

function showMore(){
	$("#typeMore").toggle("fast","linear");
  }  
    
 function pageNext(){
	 
	pageNumber=pageNumber+1;
	map.set("pageNumberStr",pageNumber);
	doPost();
	pageNow.innerHTML="第  "+pageNumber+" 页 ";
 }   
function pagePre(){
	
	if(pageNumber>1){
		
		pageNumber=pageNumber-1;
	}
	map.set("pageNumberStr",pageNumber);
	doPost();
	pageNow.innerHTML="第  "+pageNumber+" 页 ";
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
		<li class="select-result" style="padding:10px 0 5px 100px;height: 25px">
			<dl>
				<dt>所有猫咪浏览&nbsp;>&nbsp;</dt>
				<dd class="select-no"></dd>
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
				<dd><ss:a  title="布偶猫" targets="main_cat_list" label="1">布偶猫</ss:a></dd>
				<dd><ss:a title="波斯猫"  targets="main_cat_list" label="2" >波斯猫</ss:a></dd> 
				<dd><ss:a title="挪威森林猫" targets="main_cat_list" label="3" >挪威森林猫</ss:a></dd>
				<dd><ss:a title="缅甸猫" targets="main_cat_list" label="4">缅甸猫</ss:a></dd>
				<dd><ss:a href="#"title="伯曼猫" targets="main_cat_list" label="5">伯曼猫</ss:a></dd>
				<dd><ss:a href="#"title="英国短毛猫" targets="_blank" label="6">英国短耳猫</ss:a></dd>
				<dd><ss:a href="#"title="美国短毛猫" targets="_blank" label="7" >美国短毛猫</ss:a></dd>
				<a class="right" href="#" onclick="showMore()">更多></a>
			</dl>
			<dl id="typeMore" style="display: none;">
				<dd><ss:a href="#"title="hairIdStr1">布偶猫</ss:a></dd>
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
	
	<div id="main_cat_list"></div>
	
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
		<span style="margin-right:20px;"><a href="#" onclick="pagePre()">上一页</a></span>
		<span class="gray_2" style="margin-right:10px;" id="pageNow"></span>
		<span class="gray_2">共&nbsp;16&nbsp;页</span>
		<span  style="margin-left:20px;"><a href="#" onclick="pageNext()">下一页</a></span>
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