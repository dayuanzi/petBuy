<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%@taglib uri="/struts-dojo-tags"  prefix="ss"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<ss:head/>
</head>
<body>

<s:property value="cattery.name"/>
<s:property value="cattery.cattpetrank.cattpetrank"/>
<s:property value="cattery.experience"/>
<s:property value="cattery.mainvariety"/>
<s:property value="cattery.region.region"/>

<ss:a href="MemFollowedAction.do?userid=1&pageNumber=1" targets="divCatList" >我的猫舍</ss:a>
<ss:a href="MemCartAction.do?userid=1&pageNumber=1" targets="divCatList" >我的购物车</ss:a>
<ss:a href="MemOrderListAction.do?userid=1&pageNumber=1&ispay=0" targets="divCatList" >我的订单</ss:a>
<ss:a href="MemOwnCatsAction.do?userid=1&pageNumber=1" targets="divCatList" >我的猫咪</ss:a>
<ss:div id="divCatList" href="MemOwnCatsAction.do?userid=1&pageNumber=1" />

</body>
</html>