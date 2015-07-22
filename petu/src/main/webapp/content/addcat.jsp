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


<s:form action="CatRegisterAction.do" enctype="multipart/form-data" method="post">
	<s:textfield name="name" type="String" label="名字"/>
    <s:textfield name="sex" type="Integer" label="性别"/>
	<s:textfield name="typeid" type="Integer" label="类别"/>
	<s:textfield name="rankid" type="Integer"  label="等级"/>
	<s:textfield name="pedigree_certificate" type="Integer"  label="血统证明"/>
	<s:textfield name="immune" type="Byte" label="是否免疫"/>
 <ss:datetimepicker label="生日" name="birthday" value="today"   
toggleType="plain" toggleDuration="300" language="zh_CN" type="date"   
displayWeeks="5" displayFormat="dd/MM/yyyy" formatLength="long"  /> 
	<s:textfield name="price" type="Integer" label="价格"/>
	<s:textfield name="stalen" type="Byte" label="毛长"/>
    <s:textfield label="图片类别" name="imageType" value="1"></s:textfield>  
    <s:file label="上传文件" name="uploadfile"></s:file>  
    
    
    <s:textfield name="name" type="String" label="名字"/>
    <s:textfield name="sex" type="Integer" label="性别"/>
	<s:textfield name="typeid" type="Integer" label="类别"/>
	<s:textfield name="rankid" type="Integer"  label="等级"/>
	<s:textfield name="pedigree_certificate" type="Integer"  label="血统证明"/>
	<s:textfield name="immune" type="Byte" label="是否免疫"/>
 <ss:datetimepicker label="生日" name="birthday" value="today"   
toggleType="plain" toggleDuration="300" language="zh_CN" type="date"   
displayWeeks="5" displayFormat="dd/MM/yyyy" formatLength="long"  /> 
	<s:textfield name="price" type="Integer" label="价格"/>
	<s:textfield name="stalen" type="Byte" label="毛长"/>
    <s:textfield label="图片类别" name="imageType" value="1"></s:textfield>  
    <s:file label="上传文件" name="uploadfile"></s:file>  
  
    
    
	<s:submit label="新增猫咪"/>
</s:form>

	
</body>
</html>