<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>myBodyListResult</title>
</head>
<body>
	<c:choose>
		<c:when test = "${myBody != null}">
			<p class = "result">성공</p>
			
			<ol>
				<li class = "shoulder">${myBody.shoulder}</li>
				<li class = "arm">${myBody.arm}</li>
				<li class = "bust">${myBody.bust}</li>
				<li class = "waist">${myBody.waist}</li>
				<li class = "totalUpperBody">${myBody.totalUpperBody}</li>
				<li class = "hip">${myBody.hip}</li>
				<li class = "thigh">${myBody.thigh}</li>
				<li class = calf>${myBody.calf}</li>
				<li class = "totalLowerBody">${myBody.totalLowerBody}</li>
				<li class = "foot">${myBody.foot}</li>
				<li class = "height">${myBody.height}</li>
				<li class = "weight">${myBody.weight}</li>
				<li class = "indate">${myBody.indate}</li>
			</ol>
			
		</c:when>
		
		<c:otherwise>
			<p class = "result">실패</p>
		</c:otherwise>
	</c:choose>
</body>
</html>