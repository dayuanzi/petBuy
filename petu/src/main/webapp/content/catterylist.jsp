<%@ page contentType="text/html; charset=utf-8" language="java" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link rel="stylesheet" type="text/css" href="../css/all.css" />
<link rel="stylesheet" type="text/css" href="../css/common/common.css" />
<title>Insert title here</title>
</head>
<body>


<div class="middle_5">
<ul>
	 <s:iterator value="catterylist" var="Cattery" status="image">
	  <%--  商铺：<s:property value="#Cattery.name"/>
          头像: <s:property value="mainimage[#image.index].path"/>
          图片： <s:iterator value="imagelist[#image.index]" var="imagelistsub">  <s:property value="#imagelistsub.path"/></s:iterator>
          <p></p> --%>
	 <li>
				<img src="${initParam.fileHost}/image/<s:property value="mainimage[#image.index].path"/>" class="mst">
				<div class="jieshao">
					<a  href="" class="orange_1 f16 lh30"><b><s:property value="#Cattery.name"/></b></a><br/>
					<span class=" f14 lh30"><s:property value="#Cattery.address"/>/<s:property value="#Cattery.mainvariety"/></span><br/>
					<span class="gray_2 f14"><s:property value="#Cattery.maintxt" /></span>
				</div>
				<ul class="slt">
				<s:iterator value="imagelist[#image.index]" var="imagelistsub">
					<li><a href=""><img src="${initParam.fileHost}/image/<s:property value="#imagelistsub.path"/>"></a></li>
				</s:iterator>
				</ul>			
			</li>
        
     </s:iterator>
 </ul>  
 </div>
<%--<s:iterator value="mainimage" var="image">
     <s:property value="#image.path"/>
     </s:iterator>
    图片2：
     <s:iterator value="imagelist" var="imagelistsub">
     第二层：
     <s:iterator value="#imagelistsub" var="#image">
     <s:property value="#image.path"/>
     </s:iterator> 
     </s:iterator> --%>
 
   
    

</body>
</html>