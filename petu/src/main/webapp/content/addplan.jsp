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


    <s:form action="PlanRegisterAction.do"  method="post">
     
    <s:textfield name="breedingplan.parentcatByMother.id" type="Integer"/>
    <s:textfield name="breedingplan.parentcatByFather.id" type="Integer"/>
    <ss:datetimepicker label="生日" name="breedingplan.time" value="today"
toggleType="plain" toggleDuration="300" language="zh_CN" type="date"
displayWeeks="5" displayFormat="dd/MM/yyyy" formatLength="long"/>
    <s:submit label="添加订单"/>
     
    </s:form>

</body>
</html>