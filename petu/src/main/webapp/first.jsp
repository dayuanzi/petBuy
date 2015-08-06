<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>宠你-最美丽的邂逅</title>
</head>
<body>

<s:action name="IndexAction" id="meth"  namespace="/" executeResult="true">
<s:property value="#meth.IndexAction"/>
<%--  <s:param name="pageNumberStr" value="1" ></s:param>
<s:param name="typeIdStr" value="1" ></s:param>
<s:param name="rankIdStr" value="1"></s:param>
<s:param name="priceLowStr" value="1" ></s:param>
<s:param name="priceHighStr" value="100000"></s:param>
<s:param name="pageIdStr" value="1" ></s:param>  --%>
</s:action> 

</body>
</html>