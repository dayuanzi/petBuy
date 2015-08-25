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


<s:property value="cat.name"/><!--猫名  -->
<s:property value="cat.cattery.name"/><!-- 猫舍名 -->
<s:property value="cat.catype.catype"/> <!-- 猫 品种-->
<s:property value="cat.rank.rank"/><!-- 猫繁育等级 -->
<s:property value="cat.sex"/><!-- 猫性别 -->
<s:property value="cat.pedigreeCertificate.pedigreeCertificate"/><!-- 猫认证种类 -->
<s:property value="cat.immune"/><!--猫是否除虫免疫  -->
<s:property value="cat.birthday"/><!-- 猫出生日期 -->
<s:property value="cat.price"/><!-- 猫价格 -->
<s:property value="cat.oldprice"/><!--  -->
<s:property value="mainimage.path"/><!-- 猫头像路径 -->

<s:iterator value="imagelist" var="image"><!-- 猫详情图片 -->
<s:property value="#image.path"/>
</s:iterator>





</body>
</html>