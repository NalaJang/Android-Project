<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>qnaContentResult</title>
</head>
<body>
	<ol>
		<li class = "email">${contentList.email}</li>
		<li class = "subject">${contentList.subject}</li>
		<li class = "title">${contentList.title}</li>
		<li class = "content">${contentList.content}</li>
		<li class = "indate">${contentList.indate}</li>
		<li class = "result">${contentList.result}</li>
	</ol>

</body>
</html>