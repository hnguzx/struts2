<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
</head>
<body>
<h1>Welcome!</h1>
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

<p>struts2对json进行操作</p>
<a href="${pageContext.request.contextPath}/json.jsp">点击获取json数据</a>

<p>获取所有的用户信息，服务端返回json串</p>
<a href="${pageContext.request.contextPath}/user.jsp">点击获取用户信息</a>
</body>
</html>
