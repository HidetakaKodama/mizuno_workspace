package InsertSample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class InsertSample1 {
	public static void main(String[] args) throws SQLException{
		String url = "jdbc:mysql://localhost/testsql";
		String user = "root";
		String password = "";
		Connection con = DriverManager.getConnection(url,user,password);
		PreparedStatement pstmt = con.prepareStatement("INSERT INTO trainee VALUES("+ "21,'鈴木一郎',23,'男',1.7)");
		int rows = pstmt.executeUpdate();
		System.out.println(rows + "件のデータを挿入しました。");
	}
}
