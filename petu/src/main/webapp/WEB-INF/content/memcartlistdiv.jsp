<%@ page contentType="text/html; charset=utf-8" language="java" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>

	 <s:iterator value="cartlist" var="Cart">
    
      <s:property value="#Cart.admin.name"/>
      <s:property value="#Cart.time"/>
      <s:property value="#Cart.cat.id"/>
      <s:property value="#Cart.count"/>
      
     </s:iterator>

</body>
</html>