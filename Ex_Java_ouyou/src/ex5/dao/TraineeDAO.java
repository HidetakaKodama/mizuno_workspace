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
			PreparedStatement pstmt = con.prepareStatement("SELECT trainee.id,trainee.name,trainee.age,trainee.sex,unit.unit_id,company.co_id FROM trainee,unit,company WHERE trainee.unit_id = unit.unit_id AND trainee.co_id = company.co_id AND id = ?");
			pstmt.setInt(1, id);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				trainee = new Trainee();
				trainee.setId(rs.getInt("id"));
				trainee.setName(rs.getString("name"));
				trainee.setAge(rs.getInt("age"));
				trainee.setSex(rs.getString("sex"));
				trainee.setUnitId(rs.getInt("unitId"));
				trainee.setCoId(rs.getInt("coId"));


			}
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return trainee;
	}
}
