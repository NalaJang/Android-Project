<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<%@ taglib uri= "http://java.sun.com/jsp/jstl/fmt" prefix = "fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>pointListResult</title>
</head>
<body>
	<c:choose>
		<c:when test = "${pointList.size() > 0}">
			
			<c:forEach var = "pointList" items = "${pointList}">
				<ol>
					<li class = "indate"><fmt:formatDate value = "${pointList.indate}" pattern = "yy-MM-dd"/></li>
					<li class = pname>${pointList.pname}</li>
					<li class = "point"><fmt:formatNumber value = "${pointList.point}" pattern = "#,###"/></li>
					
				</ol>
			</c:forEach>
			
		</c:when>
	</c:choose>
</body>
</html>