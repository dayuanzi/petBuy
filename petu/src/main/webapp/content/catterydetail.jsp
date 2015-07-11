<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%@taglib uri="/struts-dojo-tags"  prefix="ss"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<ss:head/>
</head>
<body>

<s:property value="cattery.name"/>
<s:property value="cattery.cattpetrank.cattpetrank"/>
<s:property value="cattery.experience"/>
<s:property value="cattery.mainvariety"/>
<s:property value="cattery.region.region"/>

<s:form action="CatsByCatteryAction?catteryId=1&pageNumner=1">
	<tr><td colspan="2">
	<s:submit value="登录" theme="simple"/><s:reset theme="simple" value="重填"/>
	</td></tr>
</s:form>



<ss:a href="CatsByCatteryAction?catteryId=1&pageNumner=2" targets="divCatList" >update</ss:a>
<ss:div id="divCatList" href="CatsByCatteryAction?catteryId=1&pageNumner=1" />









<!--<s:div align="center">
	 <s:iterator value="catlist" var="Cat">
     <p><s:property value="#Cat.name"/></p>
     <s:property value="#Cat.sex"/>
     <s:property value="#Cat.getCatype().getCatype()"/>
     <s:property value="#Cat.getRank().getRank()"/>
     <s:property value="#Cat.pedigreeCertificate"/>
     <s:property value="#Cat.immune"/>
     <s:property value="#Cat.birthday"/>
     <s:property value="#Cat.getCattery().getCattery()"/>
     <s:property value="#Cat.price"/>
     <s:property value="#Cat.oldprice"/>
     <s:property value="#Cat.image"/>
     </s:iterator>
 </s:div>
-->

</body>
</html>