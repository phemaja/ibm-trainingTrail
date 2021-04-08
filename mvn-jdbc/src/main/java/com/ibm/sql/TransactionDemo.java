package com.ibm.sql;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class TransactionDemo {
	public static void main(String[] args) {
		Connection conn = null;
		
		String sql1 = "insert into emp values (112, 'White Board', 500)";
		String sql2 = "update emp set salary=30 where empid=123";
		String sql3 = "delete from emp where empid=112";
		
		try {
			conn = JdbcConnection.getConnection();
			conn.setAutoCommit(false); // setting auto commit to false
			
			//adding batch of sql queries to pwrform at one go
			Statement stmt = conn.createStatement();
			stmt.addBatch(sql1);
			stmt.addBatch(sql2);
			stmt.addBatch(sql3);
			
			stmt.executeBatch(); //executing all queries at once
			conn.commit();    //comitting chances once everything goes fine
			System.out.println("Transaction complete");
		} catch (SQLException e) {
			//if sth goes wrong, all roll back
			System.out.println("Transaction failed!!");
			try {
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
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