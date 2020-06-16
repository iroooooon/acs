<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>member_login.jsp</h1>
	
	<div class="login">
		<form action="memberLoginAction.me" method="post">
			
			<input type="text" class="input_id" placeholder="아이디 입력"><br>
			<input type="password" class="input_pw" placeholder="패스워드 입력"><br>
			<input type="submit" class="login_submit" value="로그인">
			<input type="button" class="join_button" value="회원가입" onclick="location.href='/member/member_join.jsp';">
		</form>
	</div>
</body>
</html>