<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<h1>개인정보</h1>
아이디 : ${dto.id }
<br>
비밀번호 : ${dto.pwd }
<br>
이름 : ${dto.name }
<br>
</body>
</html>