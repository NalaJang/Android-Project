<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>qnaInsert</title>
</head>
<body>
	<c:choose>
		<c:when test = "${requestScope.insertQna eq true}">
			
			<p class = "result">문의성공</p>
		</c:when>
	</c:choose>
	
</body>
</html>