<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
김연아 : ${vo.name }<br>
<hr>
소트니코바 : ${list[2] }
<hr>
전지형 : ${map['map2'].name }
전지형 : ${map.map2.name }
<hr>
<b>상품정보를 출력</b><br>
상품명 : ${p.name }<br>
상품가격 : ${ p.price }<br>
</body>
</html>