<%@ page contentType="text/html; charset=utf-8" language="java" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>

	 <s:iterator value="planlist" var="plan">
	 <s:property value="#plan.id"/>
	 </s:iterator>

     
      <s:iterator value="imagelist_mom" var="image">
      
	 <s:property value="#image.path"/>
	 </s:iterator>

<s:iterator value="imagelist_dad" var="image">
      
	 <s:property value="#image.path"/>
	 </s:iterator>

</body>
</html>