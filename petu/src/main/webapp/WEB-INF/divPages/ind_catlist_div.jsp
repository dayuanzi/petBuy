<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>




	  <s:iterator value="catlist" var="Cat">
     <p><s:property value="#Cat.name"/></p>
  <!--    <s:property value="#Cat.sex"/>
     <s:property value="#Cat.getCatype().getCatype()"/>
     <s:property value="#Cat.getRank().getRank()"/>
     <s:property value="#Cat.pedigreeCertificate"/>
     <s:property value="#Cat.immune"/>
     <s:property value="#Cat.birthday"/>
     <s:property value="#Cat.getCattery().getCattery()"/>
     <s:property value="#Cat.price"/>
     <s:property value="#Cat.oldprice"/>
     <s:property value="#Cat.image"/>
      -->
     </s:iterator>
  




  
  
</body>
</html>