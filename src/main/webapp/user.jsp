<%--
  Created by IntelliJ IDEA.
  User: 25446
  Date: 2020/2/4
  Time: 15:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>json操作</title>
    <script>
        function getXmlHttpRequest() {
            let xmlhttp = null;

            if (window.XMLHttpRequest) {
                xmlhttp = new XMLHttpRequest(); // 针对于现在的浏览器包括IE7以上版本
            } else if (window.ActiveXObject) {
                // 针对于IE5,IE6版本
                xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
            }
            return xmlhttp;
        }

        function showProduct() {
            const xmlHttpRequest = getXmlHttpRequest();
            xmlHttpRequest.onreadystatechange = function () {
                if (xmlHttpRequest.status == 200 && xmlHttpRequest.readyState == 4) {
                    alert(xmlHttpRequest.responseText);
                    //return JSON.parse(xmlHttpRequest.responseText); 返回json对象
                }
            };
            xmlHttpRequest.open("GET", "${pageContext.request.contextPath}/user");
            xmlHttpRequest.send(null);
        }
    </script>
</head>
<body>
<input type="button" value="获取用户信息" onclick="showProduct();">

</body>
</html>
