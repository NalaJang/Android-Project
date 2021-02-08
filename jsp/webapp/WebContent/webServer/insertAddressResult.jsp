<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>insertAddressResult</title>
</head>
<body>
	<ol>
		<li class = "name">${insertAddress.name}</li>
		<li class = "nickName">${insertAddress.userName}</li>
		<li class = "userId">${insertAddress.id}</li>
		<li class = "phone">${insertAddress.phone}</li>
		<li class = "zip_num">${insertAddress.zip_num}</li>
		<li class = "address1">${insertAddress.address1}</li>
		<li class = "address2">${insertAddress.address2}</li>
		<li class = "result">${insertAddress.result}</li>
	</ol>

</body>
</html>