<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<%@ taglib uri= "http://java.sun.com/jsp/jstl/fmt" prefix = "fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>orderListResult</title>
</head>
<body>
	<c:choose>
		<c:when test = "${orderList.size() > 0}">
			<p class = "order">주문내역</p>
			<c:forEach var = "orderList" items = "${orderList}">
				<ol>
					<li class = "pname">${orderList.pname}</li>
					<li class = "image">${orderList.image}</li>
					<li class = "quantity">${orderList.quantity}</li>
					<li class = "content">${orderList.content}</li>
					<li class = "price"><fmt:formatNumber value = "${orderList.price2}" pattern = "#,###"/></li>
					<li class = "result">${orderList.result}</li>
					<li class = "indate"><fmt:formatDate value = "${orderList.indate}" pattern = "yy-MM-dd"/></li>
				</ol>
			</c:forEach>
			
		</c:when>
		
		<c:otherwise>
			<p class = "order">없음</p>
		</c:otherwise>
	</c:choose>
</body>
</html>