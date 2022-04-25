package DBAccessSample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBAccessSample3 {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost/testsql";
		String user = "root";
		String password = "";
		try(Connection con = DriverManager.getConnection(url,user,password);
				PreparedStatement pstmt = con.prepareStatement
						("SELECT name,age,sex FROM trainee")){
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				String name = rs.getString("name");
				int age = rs.getInt("age");
				String sex = rs.getString("sex");
				System.out.println("名前" + name + "年齢" + age + "性別" + sex);
			}
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
