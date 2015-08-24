<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">

<link rel="stylesheet" type="text/css" href="../css/all.css" />
<link rel="stylesheet" type="text/css" href="../css/common/common.css" />
<title>Insert title here</title>
</head>
<body>
<div class="main-content center">
<div class="middle_1">
	<div class="smallpic">
		<ul>
		 <s:iterator value="catlist" var="Cat" status="image">
		 <li>
	 		<a href=""><img src="${initParam.fileHost}/image/<s:property value="imagelist[#image.index].path"/>"></a><span class="gray_1 lh30"><s:property value="#Cat.name"/>&nbsp;&nbsp;&nbsp;&nbsp;</span><span class="gray_3 lh30"><s:property value="#Cat.cattery.name"/></span><br/><span class="orange_1 f18 lh30" > &yen; <s:property value="#Cat.price"/></span>
	 	</li>
    <%--  <p><s:property value="#Cat.name"/></p>
     <s:property value="#Cat.sex"/>
     <s:property value="#Cat.getCatype().getCatype()"/>
     <s:property value="#Cat.getRank().getRank()"/>
     <s:property value="#Cat.pedigreeCertificate"/>
     <s:property value="#Cat.immune"/>
     <s:property value="#Cat.birthday"/>
     <s:property value="#Cat.getCattery().getCattery()"/>
     <s:property value="#Cat.price"/>
     <s:property value="#Cat.oldprice"/>
     --%>
     	</s:iterator>
		</ul>
	</div>
</div>
</div>

 <%-- <s:iterator value="imagelist" var="image" status="st"> 
 
     <img src="${initParam.fileHost}/image/<s:property value="imagelist[0].path"/>">
      </s:iterator>  --%>



  
  
</body>
</html>