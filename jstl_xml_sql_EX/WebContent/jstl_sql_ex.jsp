<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<sql:setDataSource var="conn"
	driver="com.mysql.cj.jdbc.Driver"
	url="jdbc:mysql://localhost/register?serverTimezone=UTC"
	user="root"
	password="tmdgml65"/>
	
<sql:update dataSource="${conn}">
	insert into test (numb, name) values(1, '홍길동')
</sql:update>
<sql:update dataSource="${conn}">
	insert into test (numb, name) values(2, '조준동')
</sql:update>
<sql:update dataSource="${conn}">
	insert into test (numb, name) values(3, '홍길동')
</sql:update>
<sql:update dataSource="${conn}">
	insert into test (numb, name) values(4, '홍길순')
</sql:update>

<sql:query var="rs" dataSource="${conn }">
	select * from test where name=?
	<sql:param>홍길동</sql:param>
</sql:query>

<c:forEach var="data" items="${rs.rows }">
	<c:out value="${data['numb']}"/>
	<c:out value="${data['name']}"/>
	<br>
</c:forEach>

</body>
</html>