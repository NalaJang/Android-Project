<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<ol>
		<li class = "result">${requestScope.sign_up_result}</li>
		<li class = "result">${requestScope.bodyInfo}</li>
	</ol>
</body>
</html>