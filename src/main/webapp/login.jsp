<%--
  Created by IntelliJ IDEA.
  User: HuoBi
  Date: 2016/6/20
  Time: 14:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login</title>
</head>
<body>
    <form name="login" method="post" action="/webtest01/login">
        用户名:<input type="text" name="username">
        密码:<input type="password" name="password">
        <input type="submit" name="Submit" value="登录">
    </form>
</body>
</html>
