<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>addressListResult</title>
</head>
<body>
	<c:choose>
		<c:when test = "${addressList.size() > 0}">
			
			<c:forEach var = "addressList" items = "${addressList}">
				<ol>
					<li class = "no">${addressList.no}</li>
					<li class = "nickName">${addressList.name}</li>
					<li class = "userName">${addressList.userName}</li>
					<li class = "id">${addressList.id}</li>
					<li class = "phone">${addressList.phone}</li>
					<li class = "zip_num">${addressList.zip_num}</li>
					<li class = "address1">${addressList.address1}</li>
					<li class = "address2">${addressList.address2}</li>
					<li class = "result">${addressList.result}</li>
				</ol>
			</c:forEach>
			
		</c:when>
	</c:choose>
</body>
</html>