package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import entity.Country;

public class CountryDao {
	private static final String DRIVER = "com.mysql.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost/countrysql";
	private static final String USER = "root";
	private static final String PASSWORD = "";

	private Connection getConnection() throws ClassNotFoundException,SQLException{
		Class.forName(DRIVER);
		Connection con = DriverManager.getConnection(URL,USER,PASSWORD);
		return con;
	}

	public Country searchById(int population) {
		Country country = null;
		String sql = "select id,country,capital,population,area,density" + "from country where pupulation = ?";
		try (Connection con = getConnection(); PreparedStatement pstmt = con.prepareStatement(sql);){
			pstmt.setInt(1, population);
			ResultSet rs = pstmt.executeQuery();

		if(rs.next()) {
			country = new Country();
			int id2 = rs.getInt("id");
			String country2 = rs.getString("country");
			String capital = rs.getString("capital");
			int population2 = rs.getInt("population");
			int area = rs.getInt("area");
			int density = rs.getInt("density");
			country.setId(id2);
			country.setCountry(country2);
			country.setCapital(capital);
			country.setPopulation(population2);
			country.setArea(area);
			country.setDensity(density);
		}
		} catch(SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return country;
	}
}
