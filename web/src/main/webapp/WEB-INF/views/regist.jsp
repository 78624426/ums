<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019\3\7 0007
  Time: 17:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h2>用户注册</h2>
    <form action="${pageContext.request.contextPath }/regist" method="post">
        用户名：<input type="text" name="name"><br>
        密码：<input type="password" name="pass"><br>
        年龄：<input type="text" name="age"><br>
        <input type="submit" value="注册">
    </form>
</body>
</html>
