<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%@taglib uri="/struts-dojo-tags"  prefix="ss"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<ss:head/>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>宠你-首页</title>
</head>
<body>




<s:form action="CatsByQueryAction.do?pageNumner=1&pageId=1">
	<s:textfield name="query"/>
	<ss:submit targets="divCatList" label="搜索"/>
</s:form>



<ss:div id="divCatList" href="CatListAction.do?pageNumner=1&typeId=1&rankId=1&priceLow=1&priceHigh=100000&pageId=1"/>

</body>
</html>