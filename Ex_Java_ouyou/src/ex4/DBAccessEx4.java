package ex4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
public class DBAccessEx4 {
	public static void main(String[] main) throws SQLException {
		System.out.println("会社IDを変更する研修生のIDを入力して下さい。");
		Scanner sc = new Scanner(System.in);
		int co_id1 = sc.nextInt();
		String url = "jdbc:mysql://localhost/testsql";
		String user = "root";
		String password = "";
		Connection con = DriverManager.getConnection(url,user,password);
		PreparedStatement pstmt = con.prepareStatement("select co_id from traine  where id = ?");{
		pstmt.setInt(1, co_id1);

		System.out.println("変更後の会社IDを入力してください");
		int co_id2 = sc.nextInt();
		PreparedStatement pstmt2 = con.prepareStatement("UPDATE trainee SET co_id = ?");{
			pstmt2.setInt(1, co_id2);

		}
        int rows = pstmt2.executeUpdate();
		}
	}
}
