<%@ page contentType="text/html; charset=utf-8" language="java" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>

<div>


	 <s:iterator value="catterylist" var="Cattery">
     商铺：<s:property value="#Cattery.name"/></p>
     </s:iterator><p>
     图片1：
     <s:iterator value="mainimage" var="image">
    <s:property value="#image.path"/></p>
     </s:iterator><p>
    
    图片2：
     <s:iterator value="imagelist" var="imagelistsub">
     第二层：
     <s:iterator value="#imagelistsub" var="#image">
     <s:property value="#image.path"/></p>
     </s:iterator> 
     </s:iterator><p>
    

</body>
</html>