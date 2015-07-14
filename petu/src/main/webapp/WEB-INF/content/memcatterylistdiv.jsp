<%@ page contentType="text/html; charset=utf-8" language="java" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>



	 <s:iterator value="catterylist" var="Cattery">
     商铺：<s:property value="#Cattery.name"/></p>
     <s:property value="#Cattery.mainvariety"/>
     <s:property value="#Cattery.experience"/>
     <s:property value="#Cattery.cattpetrank.cattpetrank"/>
     <s:property value="#Cattery.region.region"/>
     </s:iterator>
</body>
</html>