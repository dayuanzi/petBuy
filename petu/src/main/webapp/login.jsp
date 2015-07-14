<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>

<body>
	<h2>登陆</h2>
	<form action="/j_spring_security_check" method="post">
		<table>
			<tr>
				<td colspan="3"><font size="3" color="red">${msg}</font></td>
			</tr>
			<tr>
				<td>用户名</td>
				<td colspan="2"><input name="username" type="text" /></td>
			</tr>
			<tr>
				<td>密码</td>
				<td colspan="2"><input name="password" type="password" /></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="checkbox" name="_spring_security_remember_me"
					id="_spring_security_remember_me" value="true" /> <label
					for="remember-me">记住我一周</label></td>
			</tr>

			<tr>
				<td height="40" align="right"><strong> 验证码： </strong></td>
				<td><input name="code" type="text" id="code" /></td>
			</tr>
			

			<tr>
				<td colspan="2"><input type="submit" value="登陆"></td>
			</tr>
		</table>
	</form>


	<li><a href="register.jsp">注册</a></li>
</body>
</html>
