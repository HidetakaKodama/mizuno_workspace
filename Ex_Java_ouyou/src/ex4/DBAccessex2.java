package ex4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class DBAccessex2 {
	public static void main(String[] args) throws SQLException {
		String url = "jdbc:mysql://localhost/testsql";
		String user = "root";
		String password = "";
		Connection con = DriverManager.getConnection(url,user,password);
		PreparedStatement pstmt = con.prepareStatement("SELECT trainee.id,trainee.name,trainee.age,unit.unit_name FROM trainee,unit WHERE trainee.unit_id = unit.unit_id AND id = 7");
		ResultSet rs = pstmt.executeQuery();

		while(rs.next()) {
			int id = rs.getInt("id");
			String name= rs.getString("name");
			int age = rs.getInt("age");
			String unit_name = rs.getString("unit_name");
			System.out.println("id:" + id + "名前:" + name + "年齢:" + age + "単元:" + unit_name);
		}
		pstmt.close();
		con.close();
	}
}
