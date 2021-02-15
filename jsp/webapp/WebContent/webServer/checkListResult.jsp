<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>checkListResult</title>
</head>
<body>

	<c:choose>
		<c:when test = "${requestScope.checkList eq true}">
		
			<p class = "result">이미선택한상담사</p>
		</c:when>
		
		<c:otherwise>
			<p class = "result">등록가능</p>
		</c:otherwise>
	</c:choose>

</body>
</html>