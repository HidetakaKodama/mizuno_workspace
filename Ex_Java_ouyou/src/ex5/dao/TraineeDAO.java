package ex5.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import ex5.entity.Trainee;

public class TraineeDAO {
	private static final String url = "jdbc:mysql://localhost/testsql";
	private static final String user = "root";
	private static final String password = "";

	public Trainee searchById(int id) {
		Trainee trainee = null;
		try {
			Connection con = DriverManager.getConnection(url,user,password);
			PreparedStatement pstmt = con.prepareStatement("select id,name,age,sex,unit_id,co_id from trainee where id = ?");
			    pstmt.setInt(1,id);
			    ResultSet rs = pstmt.executeQuery();
			    if(rs.next()) {
			    	trainee = new Trainee();
			    	trainee.setId(rs.getInt("id"));
			    	trainee.setName(rs.getString("name"));
			    	trainee.setAge(rs.getInt("age"));
			    	trainee.setSex(rs.getString("sex"));
			    	trainee.setCoId(rs.getInt("co_id"));
}
} catch (SQLException e) {
	e.printStackTrace();
}
		return trainee;
}

	public int deleteById(int id) {
		int result = -1;
		try {
			Connection con = DriverManager.getConnection(url,user,password);
			PreparedStatement pstmt = con.prepareStatement("DELETE FROM trainee where id = ?");
			pstmt.setInt(1, id);
			result = pstmt.executeUpdate();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
}
