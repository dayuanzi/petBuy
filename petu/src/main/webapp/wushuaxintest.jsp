<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%@taglib uri="/struts-dojo-tags"  prefix="ss"%>
<%@taglib prefix="sj" uri="/struts-jquery-tags"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript" src="/js/jquery.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<s:head/>
<ss:head/>
<sj:head locale='en' jqueryui="true"/> 

</head>
<body>
<%-- 1111
<ss:a href="CatsByCatteryAction.do" targets = "divCatList">aaa</ss:a>	
<ss:div id="divCatList" href="CatsByCatteryAction.do"/>
11111 --%>
<%-- <s:form action="CatsByQueryAction.do?pageNumber=1&pageId=1">
	<s:textfield name="query"/>
	<ss:submit targets="divCatList" label="搜索"/>
</s:form>--%>

<sj:datepicker id="date0" label="Select a Date" />
<script>  

  $.subscribe('beforeForm', function(event,data) {  
   alert(111111);
  });  
</script>

<sj:a id="formId" href="CatListAction.do" targets = "divCatList" onBeforeTopics="beforeForm">aaa</sj:a>

<div id="divCatList"></div>  
</body>
</html>