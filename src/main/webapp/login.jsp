<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP Page</title>
</head>
<body>
	<h1>Please Login!</h1>
	<a href="${pageContext.request.contextPath}/login">触发方法！</a>
	<h2>测试jenkins自动部署打版是否成功！</h2>
	<h3>确认项目！</h3>
	<form action="${pageContext.request.contextPath}/login" method="post">
		<input type="text" placeholder="用户名" name="username">
		<input type="password" placeholder="密码" name="password">
		<input type="submit">
	</form>
</body>
</html>
