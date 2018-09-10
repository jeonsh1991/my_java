<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="updateAction.jsp" method="post">
	<table>
		<tr>
			<td>아이디 : </td>
			<td><input type="text" name="id"></td>
		</tr>
		<tr>
			<td>변경 이름 : </td>
			<td><input type="text" name="name"></td>
		</tr>
		<tr>
			<td>변경 키 : </td>
			<td><input type="text" name="height"></td>
		</tr>
		<tr>
			<td>변경 몸무게 : </td>
			<td><input type="text" name="weight"></td>
		</tr>
		<tr>
			<td>변경 나이 : </td>
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