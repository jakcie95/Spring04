<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>회원목록</h1><br>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<table border="1">
	<tr>
		<th>아이디</th><th>비밀번호</th><th>이름</th>
	</tr>
	<c:if test="${list.size() == 0 }">
		<tr>
			<th colspan="3">데이터 없음</th>
		</tr>
	</c:if>
	
	<c:forEach var="dto" items="${list }">
		<tr>
			<td>${dto.id }</td>
			<td>${dto.pwd }</td>
			<td>
			<a href="info?id=${dto.id }">
			${dto.name }
			</a>
			</td>
	</c:forEach>
		<tr>
			<th colspan="3">
				<a href="index">index이동</a>
			</th>
		</tr>
</table>
</body>
</html>