package ex4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;
public class DBAccessEx4 {
	public static void main(String[] main) {
		System.out.println("会社IDを変更する研修生のIDを入力して下さい。");
		Scanner sc = new Scanner(System.in);
		int id = sc.nextInt();
		String url = "jdbc:mysql://localhost/testsql";
		String user = "root";
		String password = "";
		try(Connection con = DriverManager.getConnection(url,user,password);
				PreparedStatement pstmt = con.prepareStatement("SELECT id FROM trainee WHERE id = ?")){
			pstmt.setInt(1, sc);
			ResultSet rs = pstmt.executeQuery();
		}
	}
}
