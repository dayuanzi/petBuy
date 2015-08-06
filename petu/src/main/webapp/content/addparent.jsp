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


<s:form action="ParentcatRegisterAction.do" enctype="multipart/form-data" method="post">
	
	<s:textfield name="parentcatlist[0].name" type="String" label="名字"/>
    <s:textfield name="parentcatlist[0].sex" type="Byte" label="性别"/> 

    <s:textfield label="图片类别" name="imageType" value="1"></s:textfield>  
    <s:textfield label="图片类别" name="catsimagelist" value="0"></s:textfield>  
    <s:file label="上传文件" name="uploadfile"></s:file>  
    
     <s:textfield label="图片类别" name="imageType" value="1"></s:textfield>  
    <s:textfield label="图片类别" name="catsimagelist" value="0"></s:textfield>  
    <s:file label="上传文件" name="uploadfile"></s:file>  
    
    
    <s:textfield name="parentcatlist[1].name" type="String" label="名字"/>
    <s:textfield name="parentcatlist[1].sex" type="Byte" label="性别"/>
    <s:textfield label="图片类别" name="imageType" value="1"></s:textfield> 
    <s:textfield label="图片类别" name="catsimagelist" value="1"></s:textfield>  
    <s:file label="上传文件" name="uploadfile"></s:file>  
  
  
    <s:textfield name="parentcatlist[2].name" type="String" label="名字"/>
    <s:textfield name="parentcatlist[2].sex" type="Byte" label="性别"/>
    <s:textfield label="图片类别" name="imageType" value="1"></s:textfield> 
    <s:textfield label="图片类别" name="catsimagelist" value="2"></s:textfield>  
    <s:file label="上传文件" name="uploadfile"></s:file>  
    
    
    
    
    
	<s:submit label="新增猫咪"/>
</s:form>

	
</body>
</html>