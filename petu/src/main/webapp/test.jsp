<%@ page language="java" contentType="text/html; charset=UTF-8" 
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:set var="salary" value="true"/>
<c:choose>
<c:when test="${salary==false}">
<c:out value="${salary}"/>
</c:when>
<c:otherwise>
<c:out value="hh"></c:out>
</c:otherwise>
</c:choose>

<s:set value="yuanchao" var="name" scope="session"></s:set>



</body>
</html>