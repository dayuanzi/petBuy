<%@ page contentType="text/html; charset=utf-8" language="java" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>

	 <s:iterator value="orderlist" var="Order">
     <p><s:property value="#Order.admin.username"/></p>
     <s:property value="#Order.cat.name"/>
     <s:property value="#Order.time"/>
     <s:property value="#Order.count"/>
     <s:property value="#Order.ispay"/>
     </s:iterator>

</body>
</html>