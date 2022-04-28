package ex4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
public class DBAccessEx4 {
	public static void main(String[] main) throws SQLException {


        Scanner sc = new Scanner(System.in);
        System.out.println("会社IDを変更する研修生のIDを入力して下さい。");
		int id = sc.nextInt();

		System.out.println("変更後の会社IDを入力してください");
		int co_id = sc.nextInt();
		String url = "jdbc:mysql://localhost/testsql";
		String user = "root";
		String password = "";
		try (
			Connection con = DriverManager.getConnection(url,user,password);
			PreparedStatement pstmt = con.prepareStatement("UPDATE trainee SET co_id = ? where id = ?")){
				pstmt.setInt(1, id);
		        pstmt.setInt(2, co_id);
                int rows = pstmt.executeUpdate();
			} catch (SQLException e){
				e.printStackTrace();
		}
	}
}