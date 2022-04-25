package DBAccessSample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TraDao2 {
	private static final String url = "jdbc:mysql://localhost/testsql";
	private static final String user = "root";
	private static final String password = "";

	public int insert(Trainee trainee){
		int result = -1;
		try {
			Connection con = DriverManager.getConnection(url,user,password);
			PreparedStatement pstmt = con.prepareStatement("INSERT INTO trainee(id,name,age,sex) VALUES(?,?,?,?)");
			pstmt.setInt(1, trainee.getId());
			pstmt.setString(2, trainee.getName());
			pstmt.setInt(3, trainee.getAge());
			pstmt.setString(4, trainee.getSex());
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
}