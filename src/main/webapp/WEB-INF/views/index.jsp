<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<script type="text/javascript">
	var result = ${result}
	if(result == 0){
		alert('비밀번호가 틀렸습니다.')
	}else if(result == -1){
		alert('존재하지 않는 아이디입니다.')
	}
</script>
<body>index.jsp<br>
<form action="logchk" method="post">
<input type="text" name="id" placeholder="id"><br>
<input type="password" name="pwd" placeholder="pwd"><br>
<input type="submit" value="login"><br>
<a href="register_form">회원가입</a><br>
<a href="list">모든회원보기</a><br>
</form>
</body>
</html>