<%@ page language="java" contentType="text/html; charset=utf-8" isELIgnored="true"
	pageEncoding="utf-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%@taglib uri="/struts-dojo-tags" prefix="ss"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="js/jquery.min.js" type="text/javascript" charset="utf-8"></script>
<title>Insert title here</title>
<s:head />
<ss:head />

<script type="text/javascript">



</script>
</head>
<body>
	<ss:a
		href="CatListAction.do?pageNumberStr=1&typeIdStr=1&rankIdStr=1&priceLowStr=1&priceHighStr=100000" value="123"
		targets="divCatList">update</ss:a>
	<ss:div id="divCatList" />

<s:set name="pageNumberStr" value="1"></s:set>

	<s:form id="form1" action="CatListAction.do" method="post"
		target="main_cat_list">
		<input type="text" value="<s:property value='#a'/>" /> 
		<s:hidden name="pageNumberStr"   ></s:hidden>
		<s:hidden name="typeIdStr" value="1"></s:hidden>
		<s:hidden name="rankIdStr" value="1"></s:hidden>
		<s:hidden name="priceLowStr" value="1"></s:hidden>
		<s:hidden name="priceHighStr" value="100000"></s:hidden>
		<%--  <s:param name="pageIdStr" value="1"></s:param> --%>
		<ss:submit targets="main_cat_list"></ss:submit>
		
	</s:form>
	
	<input type="button" id="button1" value="上一页">
	<input type="button" id="button1" value="下一页">
	
	<ss:div id="main_cat_list" formId="form1"></ss:div>
</body>
</html>