package com.chainsys.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.chainsys.model.User1;

public class DataChecking {
	public static Connection getConnection() throws ClassNotFoundException, SQLException {

		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/productinfo", "root",
				"Guru@7733");
		return connection;
	}
	
//	public void Register (User1 u) throws ClassNotFoundException, SQLException {
//		Connection connection = getConnection();
//		String checking="select name From jdpc where name= ?";
//		PreparedStatement prestm=connection.prepareStatement(checking);
//		prestm.setString(1, u.getUsername());	
//		ResultSet result=prestm.executeQuery();
//		if(!result.next()) {
//			String query="insert into jdpc values(?,?)";
//			PreparedStatement ps=connection.prepareStatement(query);
//			ps.setString(1, u.getUsername());	
//			ps.setString(2, u.getPassword());
//			ps.executeUpdate();
//			
//		}
//		else {
//			System.out.println("You have Already Account:");
//		}
//			
//		
//	}
//	public void login(User1 u) throws ClassNotFoundException, SQLException {
//		Connection connection=getConnection();
//		String checking="select name from jdpc where name=? and password=?";
//		PreparedStatement prestm=connection.prepareStatement(checking);
//		prestm.setString(1, u.getUsername());
//		prestm.setString(2, u.getPassword());
//		ResultSet result=prestm.executeQuery();
//		if(!result.next()) {
//		System.out.println("you dont have account");
//		}
//		else {
//			System.out.println("login  successfully");
//		}
//		
//		
//		
//	}
//
//

}
