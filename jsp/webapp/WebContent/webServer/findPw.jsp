<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>findPw</title>
</head>
<body>
	<c:choose>
		<c:when test = "${findPw.pw != null}">
		
			<p class = "result">성공</p>
			
			<ol>
				<li class = "pw">${findPw.pw}</li>
			</ol>
		</c:when>
		
		<c:otherwise>
			<p class = "result">실패</p>
		</c:otherwise>
	</c:choose>
</body>
</html>