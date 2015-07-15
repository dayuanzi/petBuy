<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix='security' uri='http://www.springframework.org/security/tags'%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>成功</title>
<security:authentication property="principal.password"></security:authentication>
<%
HttpSession sessions=request.getSession();
  // Object sessionValues=sessions.getAttribute("SPRING_SECURITY_CONTEXT");
  Object sessionValues=sessions.getAttribute("userid");
   %>
   <%=sessionValues%>
   
</head>
<body>

	<h1>你已经跳转到了第二个界面了</h1>


	<li><a href="<c:url value="/j_spring_security_logout" />">退出登陆</a></li>
	
	<c:url value="/j_spring_security_logout" var="logoutUrl" />
	<input type="button" onclick="window.location.href='${logoutUrl}'"
		value="退出登陆">
</body>
<br/>

<c:url value="/order/order.jsp" var="order" />
<input type="button" onclick="window.location.href='${order}'"
	value="跳转订单界面">
</body>
</html>