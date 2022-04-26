package ex4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
public class DBAccessEx3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("会社名を入力してください。");
		String inputName = sc.next();
		String url = "jdbc:mysql://localhost/testsql";
		String user = "root";
		String password = "";
		try(Connection con = DriverManager.getConnection(url,user,password);
				PreparedStatement pstmt = con.prepareStatement("SELECT trainee.id,trainee.name,company.co_id FROM trainee,company WHERE trainee.co_id = company.co_id AND co_name = ?")){
			pstmt.setString(1, inputName);
			ResultSet rs = pstmt.executeQuery();

			while(rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				System.out.println("ID:" + id + "名前:" + name);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
}