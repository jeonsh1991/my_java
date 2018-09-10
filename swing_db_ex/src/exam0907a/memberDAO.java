package exam0907a;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class memberDAO {
	
	ResultSet rs;
	Connection conn;
	
	public memberDAO () {
		
		try {
		String dbUrl = "jdbc:mysql://localhost/sample?serverTimezone=UTC&characterEncoding=UTF-8";
		String jdbcDriver = "com.mysql.cj.jdbc.Driver";
		System.out.println("여기");
		
		Class.forName(jdbcDriver);
		System.out.println("여기-1");
		conn = DriverManager.getConnection(dbUrl, "javabook", "1234");
		System.out.println("여기1");
		
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public ArrayList<MemberVo> listMember() {
		System.out.println("여기2");
		String sql = "select * from examuser";
		System.out.println("여기3");
		ArrayList<MemberVo> list = new ArrayList<MemberVo>();
		try {
			System.out.println("여기4");
			Statement stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				System.out.println("여기4-1");
				MemberVo memberVO = new MemberVo();
				memberVO.setUserID(rs.getString(1));
				memberVO.setUserName(rs.getString(2));
				memberVO.setHeight(rs.getInt(3));
				memberVO.setWeight(rs.getInt(4));
				memberVO.setAge(rs.getInt(5));
				System.out.println("여기5");
				list.add(memberVO);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("여기7");
		return list;
	}
	
	public void insertMember(MemberVo memberVO) {
		String sql = "insert into examuser values (?,?,?,?,?)";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, memberVO.getUserID());
			pstmt.setString(2, memberVO.getUserName());
			pstmt.setInt(3, memberVO.getHeight());
			pstmt.setInt(4, memberVO.getWeight());
			pstmt.setInt(5, memberVO.getAge());
			pstmt.executeUpdate();
			System.out.println("성공");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void updateMember(MemberVo memberVO) {
		String sql = "update examuser set userName = ?, height = ?, weight = ?, age = ? where userID = ?";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, memberVO.getUserName());
			pstmt.setInt(2, memberVO.getHeight());
			pstmt.setInt(3, memberVO.getWeight());
			pstmt.setInt(4, memberVO.getAge());
			pstmt.setString(5, memberVO.getUserID());
			pstmt.executeUpdate();
			System.out.println("성공");
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void deleteMember(MemberVo memberVO) {
		String sql = "delete from examuser where userID = ? ";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, memberVO.getUserID());
			pstmt.executeUpdate();
			System.out.println("성공");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
