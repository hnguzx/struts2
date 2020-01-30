<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<body>
<h2>ognl页面</h2>
<h5>获取值栈中的值</h5>
<h5>栈顶是map</h5>
<s:property value="name"></s:property>
<h5>栈顶是list</h5>
<s:property value="[0].top"></s:property>
<s:debug/>
</body>
</html>
