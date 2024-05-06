package com.chainsys.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.chainsys.model.ProductPricing;
import com.chainsys.model.User1;
import com.chainsys.util.DataChecking;
//
//import productpricingjdpc.ProductPricing;

public class Check implements UserDAO{
	DataChecking dc=new DataChecking();
	public void Register (User1 u) throws ClassNotFoundException, SQLException {
		Connection connection = dc.getConnection();
		String checking="select name From jdpc where name= ?";
		PreparedStatement prestm=connection.prepareStatement(checking);
		prestm.setString(1, u.getUsername());	
		ResultSet result=prestm.executeQuery();
		if(!result.next()) {
			String query="insert into jdpc values(?,?)";
			PreparedStatement ps=connection.prepareStatement(query);
			ps.setString(1, u.getUsername());	
			ps.setString(2, u.getPassword());
			ps.executeUpdate();
			
		}
		else {
			System.out.println("You have Already Account:");
		}
			
		
	}
	public void login(User1 u) throws ClassNotFoundException, SQLException {
		Connection connection=dc.getConnection();
		String checking="select name from jdpc where name=? and password=?";
		PreparedStatement prestm=connection.prepareStatement(checking);
		prestm.setString(1, u.getUsername());
		prestm.setString(2, u.getPassword());
		ResultSet result=prestm.executeQuery();
		if(!result.next()) {
		System.out.println("you dont have account");
		}
		else {
			System.out.println("login  successfully");
		}
		
		
		
	}
	public void add(ProductPricing p) throws ClassNotFoundException, SQLException {
		Connection connection=DataChecking.getConnection();
		String update="INSERT INTO Product_pricing_info (name, price, users,warranty,productrating)\r\n"
				+ "VALUES (?,?,?,?,?);";
		PreparedStatement stm=connection.prepareStatement(update);
		stm.setString(1,p.getNameofproduct());
		stm.setInt(2,p.getCostofproduct());
		stm.setInt(3,p.getNoofusers());
		stm.setInt(4,p.getNoofwarranty());
		stm.setDouble(5,p.getProductrating());
		int rows =stm.executeUpdate();
		System.out.println("Updated product :"+rows);
			

	}
	public void delete(int id) throws ClassNotFoundException, SQLException {
		Connection connection=DataChecking.getConnection();
		String delete="delete from Product_pricing_info where ID=?";
		PreparedStatement stm=connection.prepareStatement(delete);
		stm.setInt(1,id);
		int row=stm.executeUpdate();
		System.out.println("Deleted product :"+row);
		
	}
	public void update(String name,int price,int warranty,int id) throws ClassNotFoundException, SQLException {
		Connection connection=DataChecking.getConnection();
		String update="update from Product_pricing_info(name,price,warranty)+value(?,?,?) where ID=?";
		PreparedStatement stm=connection.prepareStatement(update);
		stm.setString(1, name);
		stm.setInt(2,price);
		stm.setInt(3, warranty);
		stm.setInt(4, id);
		
		int row=stm.executeUpdate();
		System.out.println("Updated product :"+row);
		
	}
		
}
