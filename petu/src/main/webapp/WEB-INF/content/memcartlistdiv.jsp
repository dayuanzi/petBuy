<%@ page contentType="text/html; charset=utf-8" language="java" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>

	 <s:iterator value="cartlist" var="Order">
	     <s:property value="#Order.get(0).cat.cattery.name"/>
     <s:iterator value="#Order" var="Cart"> 
         <s:property value="#Cart.admin.id"/>
         <s:property value="#Cart.time"/>
         <s:property value="#Cart.cat.name"/>
       </s:iterator> 
      </s:iterator>
      
     
     <s:form action="OrderRegisterAction.do"  method="post">
     <s:iterator value="cartlist" var="Order">
     <s:iterator value="#Order" var="Cart" status="status">
     <s:property value="#status.index"/>
     <s:textfield name="cartlist.id" type="Integer" value="1"/> 
     </s:iterator>
     </s:iterator>  
     <s:textfield name="addressid" type="Integer" value="1"/> 
     <s:submit label="新增猫咪"/>
     </s:form>
      
    
     
     
</body>
</html>