<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>selectedWorkerList</title>
</head>
<body>
	<c:choose>
		<c:when test = "${selectedWorkerList.size() > 0}">
			<p class = "result">목록있음</p>
			<c:forEach var = "selectedWorkerList" items = "${selectedWorkerList}">
			
				<ol>
					<li class = "workerNum">${selectedWorkerList.num}</li>
					<li class = "workerId">${selectedWorkerList.workerId}</li>
					<li class = "workerContent">${selectedWorkerList.content}</li>
				</ol>
				
			</c:forEach>
		</c:when>
		
		<c:otherwise>
			<p class = "result">목록없음</p>
		</c:otherwise>
	</c:choose>
	
	
</body>
</html>