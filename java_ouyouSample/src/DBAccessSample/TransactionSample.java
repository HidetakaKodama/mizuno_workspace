package DBAccessSample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
public class TransactionSample {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost/testsql";
		String user = "root";
		String password = "";
		Connection con = DriverManager.getConnection(url,user,password);
		con.setAutoCommit(false);
		PreparedStatement pstmt1 = con.prepareStatement("UPDATE trainee SET age = 25 WHERE id = 1");
		PreparedStatement pstmt2 = con.prepareStatement("UPDATE trainee SET age = 20 WHERE id = 2");

		int rows = 0;
		rows = rows + pstmt1.executeUpdate();
		rows = rows + pstmt2.executeUpdate();
		if(rows == 2) {
			con.commit();
			System.out.println(rows + "件のデータを更新しました。");
		} else {
			con.rollback();
			System.out.println("更新が失敗しました");
		}
	}
}
