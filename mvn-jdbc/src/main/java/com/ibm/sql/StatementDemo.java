package com.ibm.sql;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementDemo {
	public static void main(String[] args) {
		String sql = "insert into emp values (123,'Marker',2500)";
		Connection conn = null;

		try {
			conn = JdbcConnection.getConnection();
			//creating statement to perform fixed query
			Statement stmt = conn.createStatement();
			int rec=stmt.executeUpdate(sql);
			System.out.println(rec + "Record inserted");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}