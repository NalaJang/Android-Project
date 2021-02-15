<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SelectWorkerListResult</title>
</head>
<body>

	<c:choose>
		<c:when test = "${requestScope.result ==  1}">
			<p class = "result">등록성공</p>
			
			<ol>
				<li class = "userId">${select.id}</li>
				<li class = "workerId">${select.workerId}</li>
			</ol>
		</c:when>
	
	
		<c:when test = "${requestScope.result ==  -1}">
			<p class = "result">등록실패</p>
		</c:when>
	</c:choose>
	
</body>
</html>