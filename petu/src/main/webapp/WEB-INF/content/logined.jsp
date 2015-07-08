<%@ page contentType="text/html; charset=gb2312" language="java" %>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
	"http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>宠物首页</title>
</head>
<body>

<table width="780" align="center" 
	background="images/bodybg.jpg">
  <tr height="60">
	<td>&nbsp;</td>
  </tr>
  <tr>
	<td>
<s:if test="tip!=null">
<div class="mytitle">
	<s:property value="tip"/>
</div>
</s:if>	
	</td>
  </tr>
  <tr height="80">
	<td>&nbsp;</td>
  </tr>
  <tr>
	<td><s:property value="#session.user"/> ，
		欢迎您使用宠物交易平台！</td>
  </tr>
  <tr height="60">
	<td><s:form action="processLogin" methid="">
	<s:submit value="下一页" theme="simple"/>
	</td>
	</tr>
</s:form>
</td>
  </tr>
  
  <tr height="60">
	<td>&nbsp;
<div>
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
 </div>
	</td>
  </tr>
</table>
</body>
</html>
