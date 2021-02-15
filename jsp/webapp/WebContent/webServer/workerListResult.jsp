<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>WorkerList</title>
</head>
<body>

	<c:forEach var = "workerList" items = "${workerList}">
		<ol>
			<li class = "num">${workerList.num}</li>
			<li class = "id">${workerList.id}</li>
			<li class = "content">${workerList.content}</li>
		</ol>
	</c:forEach>
	
</body>
</html>