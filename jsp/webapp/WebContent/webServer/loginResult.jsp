<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Result</title>
</head>
<body>
	<c:choose>
		<c:when test = "${requestScope.login_result eq true}">
			<p class = "result">로그인 성공</p>
			<ol>
				<li class = "id">${user.id}</li>
				<li class = "name">${user.name}</li>
				<li class = "pw">${user.pw}</li>
				<li class = "email">${user.email}</li>
				<li class = "phone">${user.phone}</li>
				<li class = "content">${user.content}</li>
				<li class = "profilePhoto">${user.profilePhoto}</li>
				<li class = "point">${user.point}</li>
			
			</ol>
		</c:when>
		<c:otherwise>
			<p class = "result">로그인 실패</p>
		</c:otherwise>
	</c:choose>
</body>
</html>