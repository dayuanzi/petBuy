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

<s:form action="getCatteryList.do">
	<tr><td colspan="2">
	<s:submit value="登录" theme="simple"/><s:reset theme="simple" value="重填"/>
	</td></tr>
</s:form>
</div>

<tr height="60">
	<td>&nbsp;
	<div align="center">
	 <s:iterator value="catterylist" var="Cattery">
     商铺：<s:property value="#Cattery.name"/></p>
     
     
     
     </s:iterator>
     </div>
	</td>
  </tr>
</body>
</html>