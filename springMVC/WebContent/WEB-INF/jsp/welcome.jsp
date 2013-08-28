<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Hello :: Spring Application</title>
</head>
<body>
	<h1>Hello - Spring Application</h1>
	<p>欢迎！</p>
	<p>传递数据: ${result }</p>
	<div>
		<c:forEach items="${map }" var="map">
		${map.key }  ------------> ${map.value }
		</c:forEach>
	</div>
</body>
</html>