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
	</a> 회원정보수정</h3>
<br>

<p>
	수정할 아이디 입력 : <input type="text" id="searchId">
	<input type="button" id="searchIdBtn" value="검색"> 
</p>
<div id="resultDiv"></div>
<br>

<div id="updateDiv">
	<form id="updateForm">
		<table border="1" cellspacing="0" cellpadding="5">
			<tr>
				<th>이름</th>
				<td>
					<input type="text" name="name" id="name">
					<div id="nameDiv"></div>
				</td>
			</tr>
			<tr>
				<th>아이디</th>
				<td>
					<input type="text" name="id" id="id" readonly="readonly">
				</td>
			</tr>
			<tr>
				<th>비밀번호</th>
				<td>
					<input type="password" name="pwd" id="pwd">
					<div id="pwdDiv"></div>
				</td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<input type="button" value="수정" id="updateBtn">
					<input type="reset" value="취소" id="resetBtn">
				</td>
			</tr>
		</table>
	</form>
</div>

<script type="text/javascript" src="http://code.jquery.com/jquery-3.6.4.min.js"></script>
<script type="text/javascript" src="../js/update.js"></script>
</body>
</html>

<!-- 검색 버튼을 눌렀을 때 아이디가 없으면 "찾고자 하는 아이디가 없습니다." -->
