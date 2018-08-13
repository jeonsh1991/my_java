package ex0813;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class memberInsert {
		
	
		private static final String driver = "com.mysql.cj.jdbc.Driver";
		private static final String url = "jdbc:mysql://localhost/javadb?serverTimezone=UTC";
		private static final String user = "javabook";
		private static final String pwd = "1234";
		
		private Connection con;
		private PreparedStatement pstmt;
		private ResultSet rs;
		
		
		public memberInsert(memberVO mem) {
			try {
				connDB();
				String query = "insert into member2 values(?, ?, ?, ?, ?)";
				
				pstmt = con.prepareStatement(query);
				System.out.println("쿼리까지");
				
					pstmt.setString(1, mem.getId());
					pstmt.setString(2, mem.getName());
					pstmt.setInt(3, mem.getHeight());
					pstmt.setInt(4, mem.getWeight());
					pstmt.setInt(5, mem.getAge());
					System.out.println("등록까지");
					
					pstmt.executeUpdate();
				
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		}
		public void connDB() {
			try {
				Class.forName(driver);
				System.out.println("mysql 드라이버 로딩 성공222");
				con = DriverManager.getConnection(url, user, pwd);
				System.out.println("Connection 생성 성공222");
				
				System.out.println("Statement 생성 성공222");
			}catch(Exception e) {
				e.printStackTrace();
			}
		}

	}
