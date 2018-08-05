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
	String info_id=request.getParameter("id");
	
	
	String jdbcdriver ="com.mysql.cj.jdbc.Driver";
    String url="jdbc:mysql://localhost/register?serverTimezone=UTC";
	Connection conn=null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	try {
		Class.forName(jdbcdriver);
    	conn=DriverManager.getConnection(url,"root","tmdgml65");
    	
    	pstmt = conn.prepareStatement("select * from member where id =?");
    	pstmt.setString(1, info_id);
    	rs = pstmt.executeQuery();
    	rs.next();
    			
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
		<td>아이디 : </td>
		<td><%=rs.getString("id") %>
	</td>
	<tr>
		<td>비밀번호 : </td>
		<td><%=rs.getString("password") %>
	</td>
	<tr>
		<td>이름 : </td>
		<td><%=rs.getString("name") %></td>
	</tr>
	<tr>
		<td>나이 : </td>
		<td><%=rs.getString("age") %></td>
	</tr>
	<tr>
		<td>성별 : </td>
		<td><%=rs.getString("gender") %>
	</td>
	<tr>
		<td>이메일 주소 : </td>
		<td><%=rs.getString("email") %></td>
	</tr>
	<tr>
		<td colspan="2"><a href="member_list.jsp">리스트로 돌아가기 </a></td>
	</tr>
</table>
</body>
</html>