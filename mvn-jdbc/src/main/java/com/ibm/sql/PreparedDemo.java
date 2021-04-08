package com.ibm.sql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedDemo {
	public static void main(String[] args) {
		String sql = "insert into emp values (?,?,?)";
		Connection conn = null;
		
		try {
			conn = JdbcConnection.getConnection();
			PreparedStatement stmt = conn.prepareStatement(sql);
			
			//replacing plac holders with values from cdm line arguents
			stmt.setInt(1, Integer.parseInt(args[0]));
			stmt.setString(2, args[1]);
			stmt.setDouble(3, Double.parseDouble(args[2]));
			stmt.executeUpdate();
			
			System.out.println("Record inserted");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  finally {
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}