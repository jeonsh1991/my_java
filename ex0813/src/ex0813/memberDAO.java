package ex0813;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class memberDAO {
	
	private static final String driver = "com.mysql.cj.jdbc.Driver";
	private static final String url = "jdbc:mysql://localhost/javadb?serverTimezone=UTC";
	private static final String user = "javabook";
	private static final String pwd = "1234";
	
	private Connection con;
	private Statement stmt;
	private ResultSet rs;
	
	
	public ArrayList<memberVO> list() {
		ArrayList<memberVO> list = new ArrayList<memberVO>();
		try {
			connDB();
			String query = "select * from member2";
			System.out.println(query);
			ResultSet rs = stmt.executeQuery(query);
			
			while(rs.next()) {
				String id = rs.getString("id");
				String name= rs.getString("name");
				int height = rs.getInt("height");
				int weight = rs.getInt("weight");
				int age = rs.getInt("age");
				memberVO data = new memberVO();
				data.setId(id);
				data.setName(name);
				data.setHeight(height);
				data.setWeight(weight);
				data.setAge(age);
				
				list.add(data);
			}
			rs.close();
			stmt.close();
			con.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	public void connDB() {
		try {
			Class.forName(driver);
			System.out.println("mysql 드라이버 로딩 성공");
			con = DriverManager.getConnection(url, user, pwd);
			System.out.println("Connection 생성 성공");
			
			stmt = con.createStatement();
			System.out.println("Statement 생성 성공");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
