<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP Page</title>
</head>
<body>
	<h1>Welcome  {sessionScope.user.username}!</h1>
	<%=session.getAttribute("username")%>
	<h1>登录成功！</h1>
	<a href="${pageContext.request.contextPath}/add">新增=========</a>
	<a href="${pageContext.request.contextPath}/delete">删除！========</a>
	<a href="${pageContext.request.contextPath}/modify">修改！=====</a>
	<a href="${pageContext.request.contextPath}/check">查看！========</a>
</body>
</html>
