<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
#writeForm div {
	color: red;
	font-size: 10pt;
	font-weight: bold;
}
</style>
</head>
<body>
<h3><a href="/chapter06_SpringWebMaven/"><img src="../image/apeach.png" width="50" height="50"></a>회원가입</h3>
<form id="writeForm">
	
		<label>이름 : </label>
		<input type="text" name="name" id="name">
		<div id="nameDiv"></div>
	<br>
	
		<label>아이디 : </label>
		<input type="text" name="id" id="id">
		<div id="idDiv"></div>
	<br>
	
		<label>비밀번호 : </label>
		<input type="password" name="pwd" id="pwd">
		<div id="pwdDiv"></div>
	<br>
	
	<input type="button" value="등록" id="writeBtn">
	<input type="reset" value="취소">
</form>

<script type="text/javascript" src="http://code.jquery.com/jquery-3.6.4.min.js"></script>
<script type="text/javascript" src="../js/write.js"></script>
</body>
</html>