<%@ page contentType="text/html; charset=utf-8" language="java" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>

<div>


	 <s:iterator value="recordlist" var="Record">
     信息：<s:property value="#Record.id"/></p>
     </s:iterator><p>
     
     <s:iterator value="imagelist" var="Image">
     图片：<s:property value="#Image.id"/></p>
     </s:iterator><p>
     
      <s:iterator value="videolist" var="Video">
     视频：<s:property value="#Video.id"/></p>
     </s:iterator><p>
     
    

</body>
</html>