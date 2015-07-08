<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>  
  
<%@ taglib uri="/struts-tags" prefix="s"%>  
  
<%  
    String path = request.getContextPath();  
    String basePath = request.getScheme() + "://"  
  
           + request.getServerName() + ":" + request.getServerPort()  
  
           + path + "/";  
%>  
  
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">  
  
<html>  
  
    <head>  
  
       <base href="<%=basePath%>">  
  
       <title>My JSP 'tagUpload.jsp' starting page</title>  
  
       <meta http-equiv="pragma" content="no-cache">  
  
       <meta http-equiv="cache-control" content="no-cache">  
  
       <meta http-equiv="expires" content="0">  
  
       <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">  
  
       <meta http-equiv="description" content="This is my page">  
  
       <!-- 
 
    <link rel="stylesheet" type="text/css" href="styles.css"> 
 
    -->  
    </head>  
    <body>  
      <h3>多个文件上传实例</h3>  
       <s:form action="uploadList.action" enctype="multipart/form-data" method="post">  
           <s:textfield label="上传名称" name="name"></s:textfield>  
           <s:file label="上传文件" name="upload"></s:file>  
           <s:file label="上传文件" name="upload"></s:file>  
           <s:file label="上传文件" name="upload"></s:file>  
           <s:submit value="上传" />  
       </s:form>  
    </body>  
</html>   