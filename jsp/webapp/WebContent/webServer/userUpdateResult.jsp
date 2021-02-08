<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>UserInfoUpdateResult</title>
</head>
<body>

	<p class = "result">수정된정보</p>
	<ol>
		<li class = "content">${userInfo.content}</li>
		<li class = "pw">${userInfo.pw}</li>
		<li class = "email">${userInfo.email}</li>
		<li class = "phone">${userInfo.phone}</li>
		<li class = "photo">${userInfo.profilePhoto}</li>
	</ol>
	

</body>
</html>