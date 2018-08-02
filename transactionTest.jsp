<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%request.setCharacterEncoding("UTF-8"); %>
    <%@ page import="java.sql.*" %>
    <%@ page import="javax.sql.*" %>
    <%@ page import="javax.naming.*" %>
    <%
    String jdbcdriver ="com.mysql.cj.jdbc.Driver";
    String url="jdbc:mysql://localhost/register?serverTimezone=UTC";
    Connection conn=null;
    String sql = "insert into student (num, name) values (13, '조성주')";
   	String sql2= "select * from student where num=12";
    PreparedStatement pstmt=null;
    ResultSet rs= null;
    Boolean connect=false;
    
    try {
    	Class.forName(jdbcdriver);
    	conn=DriverManager.getConnection(url,"root","tmdgml65");
    	
    	System.out.println("여기1");
    	conn.setAutoCommit(false);
    	System.out.println("여기2");
    	
    	pstmt=conn.prepareStatement(sql);
    	System.out.println("여기3");
    	pstmt.executeUpdate();
    	//인설트인투 이기때문에 executeUpdate 업데이트 이다. rs를 안넣고 pstmt.executeUpdate();로 만든다.
    	
    	System.out.println("여기3");
    	
    	pstmt=conn.prepareStatement(sql2);
    	rs=pstmt.executeQuery();
    	if(!rs.next()){
    		conn.rollback();
    		//num13번을 업데이트하는 쿼리문을 실행하였다. sql2 쿼리문은 num 12번이 있을때 해당 컬럼을 모두 가져오는 걸을 뜻한다.
    		//하지만 12번은 공란이라 조건문은 성립하지 않는다. 그럴때 conn.rollback()으로 업데이트를 적용시키지않고 되돌린다.
    		out.println("<h3>데이터 삽입에 문제가 발생하여 롤백하였습니다</h3>");
    	}else{
    		conn.commit();
    		out.println("<h3>데이터 삽입이 모두 완료되었습니다.</h3>");
    	}
    	conn.setAutoCommit(true);
    	//update, insert, delete 등은 실행 즉시 완료가 되므로 되돌릴 수 없다.
    	//그러므로 setAutoCommit을 false로 두고 모든 작업이 완료 되었을때 true값을 주어 업데이트 되도록한다.
    	
    	
    	
    }catch(Exception e){
    	out.println("<h3>데이터 가져오기에 실패하였습니다</h3>");
    	connect=false;
    	e.printStackTrace();
    }finally{
    	try{
    		rs.close();
    		pstmt.close();
    		conn.close();
    		
    	}catch(Exception e){
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