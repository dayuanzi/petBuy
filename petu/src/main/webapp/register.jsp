<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<script src="//cdn.bootcss.com/jquery/1.11.3/jquery.min.js"></script>

<title>注册</title>
</head>
<body>
	<h2>注册</h2>
	<form method="post" action="UserRegisterAction.do">

		<table>
			<tr>
				<td colspan="3"><font size="3" color="red">${msg}</font></td>
			</tr>
			<tr>
				<td>邮箱： <input name="userName" /></td>
			</tr>
			<tr>
				<td>密码: <input name="password" type="password" /></td>
			</tr>
			<tr>
				<td>重复密码: <input name="repassword" type="password" /></td>
			</tr>


		<!--<tr>
				<td>验证码</td>
				<td><input name="code" type="password" /></td>
				<td><img src="generatCode.do" width=50 height=30 id="image"
					onclick="changImage(this)"></td>
			</tr>  -->	
			<tr>
				<td><input type="submit" name="submit" value="注册" /></td>
			</tr>
		</table>

	</form>
</body>

<!--  <script type="text/javascript">
	function changImage(img) {
		img.src = img.src + "?" + new Date().getDate();
	}
</script>-->
</html>





