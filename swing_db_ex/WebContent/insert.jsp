<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="inserAction.jsp" method="post">
	<table>
		<tr>
			<td>아이디 : </td>
			<td><input type="text" name="id"></td>
		</tr>
		<tr>
			<td>이름 : </td>
			<td><input type="text" name="name"></td>
		</tr>
		<tr>
			<td>키 : </td>
			<td><input type="text" name="height"></td>
		</tr>
		<tr>
			<td>몸무게 : </td>
			<td><input type="text" name="weight"></td>
		</tr>
		<tr>
			<td>나이 : </td>
			<td><input type="text" name="age"></td>
		</tr>
		<tr>
		<td></td>
		<td><input type="submit"></td>
		</tr>
	</table>
</form>
</body>
</html>