<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<%@ page import="javax.sql.*" %>
<%@ page import="javax.naming.*" %>
<%
	String id = null;

	if ((session.getAttribute("id")==null) || (!((String)session.getAttribute("id")).equals("admin"))){
		out.println("<script>");
		out.println("location.href='loginForm.jsp'");
		out.println("</script>");
	}
	
	String jdbcdriver ="com.mysql.cj.jdbc.Driver";
    String url="jdbc:mysql://localhost/register?serverTimezone=UTC";
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs= null;
	
	try{
		Class.forName(jdbcdriver);
    	conn=DriverManager.getConnection(url,"root","tmdgml65");
		
		pstmt = conn.prepareStatement("select * from member");
		rs = pstmt.executeQuery();
		
	}catch(Exception e){
		e.printStackTrace();
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
table{
	margin :auto;
	width: 400px;
	border : 1px solid gray;
	text-align: center;
}
.td_title{
	font-weight: bold;
	font-size: x-large;
}
</style>
</head>
<body>
<table>
	<tr>
		<td colspan="2" class="td_title">회원 목록</td>
	</tr>
	<%while(rs.next()) {%>
	<tr>
		<td><a href="member_info.jsp?id=<%=rs.getString("id") %>"><%=rs.getString("id") %></a></td>
		<td><a href="member_delete.jsp?id=<%=rs.getString("id") %>">삭제</a></td>
	</tr>
	<%} %>
</table>
</body>
</html>