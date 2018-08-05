<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<%@ page import="javax.sql.*" %>
<%@ page import="javax.naming.*" %>
<%
	request.setCharacterEncoding("UTF-8");
	String id = request.getParameter("id");
	String pass = request.getParameter("pass");
	
	String jdbcdriver ="com.mysql.cj.jdbc.Driver";
    String url="jdbc:mysql://localhost/register?serverTimezone=UTC";
	
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	try {
		Class.forName(jdbcdriver);
    	conn=DriverManager.getConnection(url,"root","tmdgml65");
		
		pstmt=conn.prepareStatement("select * from member where id=?");
		pstmt.setString(1, id);
		rs=pstmt.executeQuery();
		
		if(rs.next()) {
			if(pass.equals(rs.getString("password"))){
				session.setAttribute("id", id);
				out.println("연결되었습니다");
				out.println("<script>");
				out.println("location.href='main.jsp'");
				out.println("</script>");
			}
		}
		out.println("넘어감");
		out.println("<script>");
		out.println("location.href='loginForm.jsp'");
		out.println("</script>");
		
	}catch(Exception e){
		e.printStackTrace();
	}finally{
		try{
			rs.close();
			pstmt.close();
			conn.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>