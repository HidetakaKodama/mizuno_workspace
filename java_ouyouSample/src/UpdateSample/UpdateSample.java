package UpdateSample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class UpdateSample {
	public static void main(String[] args) throws SQLException{
		String url = "jdbc:mysql://localhost/testsql";
		String user = "root";
		String password = "";
		Connection con = DriverManager.getConnection(url,user,password);
		PreparedStatement pstmt = con.prepareStatement("UPDATE trainee SET name = '鈴木三郎' WHERE id = 21");
		int rows = pstmt.executeUpdate();
		System.out.println(rows + "件のデータを変更しました。");
	}
}
