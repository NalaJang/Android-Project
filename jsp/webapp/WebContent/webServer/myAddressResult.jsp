<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>myAddressResult</title>
</head>
<body>
	<ol>
		<li class = "nickName">${myAddress.name}</li>
		<li class = "userName">${myAddress.userName}</li>
		<li class = "id">${myAddress.id}</li>
		<li class = "phone">${myAddress.phone}</li>
		<li class = "zip_num">${myAddress.zip_num}</li>
		<li class = "address1">${myAddress.address1}</li>
		<li class = "address2">${myAddress.address2}</li>
		<li class = "result">${myAddress.result}</li>
	</ol>

</body>
</html>