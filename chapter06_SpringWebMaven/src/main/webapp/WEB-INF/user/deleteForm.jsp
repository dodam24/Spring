<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>
	<a href="/chapter06_SpringWebMaven/">
		<img src="../image/apeach.png" width="50" height="50">
	</a> 회원탈퇴</h3>
<br>

<p>
	삭제할 아이디 입력 : <input type="text" id="searchId">
	<input type="button" id="searchIdBtn" value="검색"> 
</p>
<div id="resultDiv"></div>
<br>

<script type="text/javascript" src="http://code.jquery.com/jquery-3.6.4.min.js"></script>
<script type="text/javascript" src="../js/delete.js"></script>
</body>
</html>