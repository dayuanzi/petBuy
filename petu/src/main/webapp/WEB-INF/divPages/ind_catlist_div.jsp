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

	 <p><s:iterator value="catlist_pet" var="Cat">
     <s:property value="#Cat.name"/>
     
     </s:iterator></p>
     ================================
     <p> <s:iterator value="catlist_breed" var="Cat">
     <s:property value="#Cat.name"/>
   
     </s:iterator></p>
     ----------------------
      <p><s:iterator value="catlist_match" var="Cat">
      <s:property value="#Cat.name"/>
   
     </s:iterator></p>
     
     ----------------------
     <p>
     <s:iterator value="planlist" var="Plan">
     <s:property value="#Plan.parentcatByMother.name"/>  <s:property value="#Plan.parentcatByFather.name"/> 
     </s:iterator></p>
     
</body>
</html>