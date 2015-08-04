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


<s:form action="AddressRegisterAction.do"  method="post">

    <s:textfield name="address.province" type="String" label="省份"/>
	<s:textfield name="address.city" type="String" label="市"/>
    <s:textfield name="address.district" type="String" label="区"/>
	<s:textfield name="address.content" type="String" label="详细地址"/>
    <s:textfield name="address.userid" type="Integer" label="用户"/>
    <s:textfield name="address.phone" type="String" label="电话"/>
	<s:textfield name="address.name" type="String" label="名字"/>
	<s:textfield name="address.street" type="String" label="街道"/>
	<s:textfield name="address.zipCode" type="String" label="邮编"/>
	<s:textfield name="address.defaultMain" type="Byte" label="默认"/>

	<s:submit label="新增猫咪"/>
</s:form>


<s:form action="DefaultAddressAction.do"  method="post">
    
    <s:textfield name="addressid" type="Integer" label="地址id"/>
	<s:submit label="新增猫咪"/>
</s:form>


<s:form action="DeleteAddressAction.do"  method="post">
    
    <s:textfield name="addressid" type="Integer" label="地址id"/>
	<s:submit label="新增猫咪"/>
</s:form>

</body>
</html>