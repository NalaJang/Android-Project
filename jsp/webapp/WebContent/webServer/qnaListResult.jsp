<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>QnaList</title>
</head>
<body>
	<c:choose>
		<c:when test = "${qnaList.size() == 0}">
			<p class = "result">문의없음</p>
		</c:when>
		
		<c:otherwise>
			<p class = "result">문의있음</p>
				<c:forEach var = "qnaList" items = "${qnaList}">
					
					<ol>
						<li class = "num">${qnaList.num}</li>
						<li class = "email">${qnaList.email}</li>
						<li class = "subject">${qnaList.subject}</li>
						<li class = "title">${qnaList.title}</li>
						<li class = "content">${qnaList.content}</li>
						<li class = "indate">${qnaList.indate}</li>
						<li class = "replyResult">${qnaList.result}</li>
					</ol>
				</c:forEach>
		</c:otherwise>
	</c:choose>
</body>
</html>