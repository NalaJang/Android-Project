<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>myBodyUpdate</title>
</head>
<body>

	<p class = "result">수정된정보</p>
		<ol>
			<li class = "shoulder">${bodyInfo.shoulder}</li>
			<li class = "arm">${bodyInfo.arm}</li>
			<li class = "bust">${bodyInfo.bust}</li>
			<li class = "waist">${bodyInfo.waist}</li>
			<li class = "totalUpperBody">${bodyInfo.totalUpperBody}</li>
			<li class = "hip">${bodyInfo.hip}</li>
			<li class = "thigh">${bodyInfo.thigh}</li>
			<li class = "calf">${bodyInfo.calf}</li>
			<li class = "totalLowerBody">${bodyInfo.totalLowerBody}</li>
			<li class = "foot">${bodyInfo.foot}</li>
			<li class = "height">${bodyInfo.height}</li>
			<li class = "weight">${bodyInfo.weight}</li>
			<li class = "indate">${bodyInfo.indate}</li>
		</ol>
	
</body>
</html>