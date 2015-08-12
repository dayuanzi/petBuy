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


<s:property value="cat.name"/>
<s:property value="cat.cattery.name"/>
<s:property value="cat.catype.catype"/>
<s:property value="cat.rank.rank"/>
<s:property value="cat.sex"/>
<s:property value="cat.pedigreeCertificate.pedigreeCertificate"/>
<s:property value="cat.immune"/>
<s:property value="cat.birthday"/>
<s:property value="cat.price"/>
<s:property value="cat.oldprice"/>
<s:property value="mainimage.path"/>

<s:iterator value="imagelist" var="image">
<s:property value="#image.path"/>
</s:iterator>





</body>
</html>