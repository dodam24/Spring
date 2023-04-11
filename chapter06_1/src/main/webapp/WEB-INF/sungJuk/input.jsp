<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="/chapter06_1/sungJuk/result.do" method="post">
		<label for="name">이름 : </label>
		<input type="text" name="name" id="name" required><br><br>	
	
		<label for="kor">국어 : </label>
		<input type="number" name="kor" id="kor" required><br><br>
		
		<label for="eng">영어 : </label>
		<input type="number" name="eng" id="eng" required><br><br>
		
		<label for="math">수학 : </label>
		<input type="number" name="math" id="math" required><br><br>
		
		<input type="submit" value="계산">
		<input type="reset" value="취소">
</form>
</body>
</html>