<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3><a href="/chapter06_SpringWebMaven/"><img src="../image/apeach.png" width="50" height="50"></a>회원가입</h3>
<form>
	<p>
	<label>이름 : </label>
	<input type="text" name="name" id="name"><br>
	<div id="nameDiv"></div>
	</p>
	
	<p>
	<label>아이디 : </label>
	<input type="text" name="id" id="id"><br>
	<div id="idDiv"></div>
	</p>
	
	<p>
	<label>비밀번호 : </label>
	<input type="password" name="password" id="password">
	<div id="pwdDiv"></div>
	</p>
	
	<input type="button" value="등록" id="writeBtn">
	<input type="reset" value="취소">
</form>

<script type="text/javascript" src="http://code.jquery.com/jquery-3.6.4.min.js"></script>
<script type="text/javascript" src="../js/write.js"></script>
</body>
</html>