package databaseEX;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class database {
	
	Scanner scanner = new Scanner(System.in);
	
	String jdbcDriver = "com.mysql.cj.jdbc.Driver";
	String jdbcUrl = "jdbc:mysql://localhost/test?serverTimezone=UTC&characterEncoding=UTF-8"; 
	Connection conn;
	
	PreparedStatement pstmt;
	ResultSet rs;
	
	public database() {
		System.out.println("## event");
		System.out.println("이름: ");
		String uname=scanner.next();
		System.out.println("이메일 : ");
		String email = scanner.next();
		
		connectDB();
		registUser(uname,email);
		printList();
		closeDB();
		
	}
	public void connectDB() {
		try {
			Class.forName(jdbcDriver);
			
			conn = DriverManager.getConnection(jdbcUrl, "testuser", "testuser");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	public void closeDB() {
		try {
			pstmt.close();
			rs.close();
			conn.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public void registUser(String uname, String email) {
		String sql ="insert into event values(?,?)";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, uname);
			pstmt.setString(2, email);
			pstmt.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	public void printList() {
		System.out.println("#리스트");
		String sql = " select * from event";
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getString("uname")+","+rs.getString(2));
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		database er = new database();
	}

}
