<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
</head>
<script>
	function login(){
		var form=document.getElementById('loginform');
		form.submit();
	}

</script>
<body>
<form action="login" method="post" id="loginform">
<input type='hidden' name='${_csrf.parameterName }' value="${_csrf.token }">
아이디:<input type="text" name="loginid" >
비밀번호:<input type="password" name="loginpwd" >
<input type="submit" value="로그인">

</form>
</body>
</html>