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

<%--	<a href="${pageContext.request.contextPath}/upload">上传！========</a>--%>
	<form method="post" action="${pageContext.request.contextPath}/upload" enctype="multipart/form-data">
		<input type="file" name="upload">
		<input type="submit" value="上传文件">
	</form>

	<p>文件下载</p>
	<a href="${pageContext.request.contextPath}/download?filename=testFile.txt">点击下载</a>
</body>
</html>
