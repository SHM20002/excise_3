<%--
  Created by IntelliJ IDEA.
  User: zzc
  Date: 2020/10/6
  Time: 23:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>用户管理</title>
    <link type="text/css" href="${pageContext.request.contextPath}/css/userManager.css" rel="stylesheet"/>
</head>
<body>
<div class="header">
    <div class="header_right">
        <div class="user_info">
            <p>欢迎您：<span id="user_name">${main.chrName}</span>
                <a href="Logout.do" id="exit_btn">【安全退出】</a>
            </p>
        </div>
        <div>
            <ul>
                <li><a href="main.jsp">首页</a></li>
                <li><a href="GetDownloadList.do">资源下载</a></li>
                <li>用户管理</li>
                <li><a href="resourceManager.do">资源管理</a></li>
                <li><a href="personalCenter.do">个人中心</a></li>
            </ul>
        </div>
    </div>
</div>

<h2 id="tip_show">404</h2>
</body>
</html>
