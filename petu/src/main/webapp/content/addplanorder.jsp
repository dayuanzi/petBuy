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

<!--<s:form action="OrderRegisterAction.do"  method="post">
	<s:textfield name="cartlist.id" type="Integer"/>
    <s:textfield name="cartlist.id" type="Integer"/>
	<s:submit label="新增猫咪"/>
    </s:form>
-->

     
     <s:form action="BreedingPlanOrderRegisterAction.do"  method="post">
     
     
     <s:textfield name="breedingorder.breedingplan.id" type="Integer" value="1"/>
     
     
     <s:submit label="新增猫咪"/>
     
     </s:form>

</body>
</html>