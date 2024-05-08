package com.chainsys.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.chainsys.model.ProductPricing;
import com.chainsys.model.User1;
import com.chainsys.util.DataChecking;
//
//import productpricingjdpc.ProductPricing;

public class Check implements UserDAO {
	DataChecking dc = new DataChecking();

	public void Register(User1 u) throws ClassNotFoundException, SQLException {
		Connection connection = DataChecking.getConnection();
		String checking = "select name From jdpc where name= ?";
		PreparedStatement prestm = connection.prepareStatement(checking);
		prestm.setString(1, u.getUsername());
		ResultSet result = prestm.executeQuery();
		if (!result.next()) {
			String query = "insert into jdpc(name,lastname,password,phonenumber,age)values(?,?,?,?,?)";
			PreparedStatement ps = connection.prepareStatement(query);
			ps.setString(1, u.getUsername());
			ps.setString(2, u.getLastname());
			ps.setString(3, u.getPassword());
			ps.setString(4, u.getPhonenumber());
			ps.setInt(5, u.getAge());
			ps.executeUpdate();

		} else {
			System.out.println("You have Already Account:");
		}

	}

	public void login(User1 u) throws ClassNotFoundException, SQLException {
		Connection connection = DataChecking.getConnection();
		String checking = "select name from jdpc where name=? and password=?";
		PreparedStatement prestm = connection.prepareStatement(checking);
		prestm.setString(1, u.getUsername());
		prestm.setString(2, u.getPassword());
		ResultSet result = prestm.executeQuery();
		if (!result.next()) {
			System.out.println("you dont have account");
		} else {
			System.out.println("login  successfully");
		}

	}

	public void add(ProductPricing p) throws ClassNotFoundException, SQLException {
		Connection connection = DataChecking.getConnection();
		String update = "INSERT INTO Product_pricing_info (name, price, users,warranty,productrating)\r\n"
				+ "VALUES (?,?,?,?,?);";
		PreparedStatement stm = connection.prepareStatement(update);
		stm.setString(1, p.getNameofproduct());
		stm.setInt(2, p.getCostofproduct());
		stm.setInt(3, p.getNoofusers());
		stm.setInt(4, p.getNoofwarranty());
		stm.setDouble(5, p.getProductrating());
		int rows = stm.executeUpdate();
		System.out.println("Updated product :" + rows);

	}

	public void delete(int id) throws ClassNotFoundException, SQLException {
		Connection connection = DataChecking.getConnection();
		String delete = "delete from Product_pricing_info where ID=?";
		PreparedStatement stm = connection.prepareStatement(delete);
		stm.setInt(1, id);
		int row = stm.executeUpdate();
		System.out.println("Deleted product :" + row);

	}

	public void update(String name, int price, int warranty, int id) throws ClassNotFoundException, SQLException {
		Connection connection = DataChecking.getConnection();
		String update = "update from Product_pricing_info(name,price,warranty)+value(?,?,?) where ID=?";
		PreparedStatement stm = connection.prepareStatement(update);
		stm.setString(1, name);
		stm.setInt(2, price);
		stm.setInt(3, warranty);
		stm.setInt(4, id);

		int row = stm.executeUpdate();
		System.out.println("Updated product :" + row);

	}

	public void select() throws ClassNotFoundException, SQLException {
		Connection connection = DataChecking.getConnection();
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("1)name 2)price 3)warranty");
			try {
				int select = sc.nextInt();
				switch (select) {
				case 1:
					System.out.println("Enter the name:");
					String name = sc.next();
					String select1 = "select name from Product_pricing_info where name where name=?";
					PreparedStatement stm = connection.prepareStatement(select1);

					ResultSet resultset = stm.executeQuery();
					ResultSetMetaData rsmd = resultset.getMetaData();
					while (resultset.next()) {
						for (int i = 1; i <= rsmd.getColumnCount(); i++) {
							String columnvalue = resultset.getString(i);
							System.out.println(rsmd.getColumnClassName(i) + " : " + columnvalue + " ");
						}
						System.out.println();
					}
					break;
				case 2:
					System.out.println("enter two price  :");
					System.out.println("First Value");
					int value1 = sc.nextInt();
					System.out.println("Second Value");
					int value2 = sc.nextInt();
					String select2 = "select name,price,warranty from Product_pricing_info where price between ? and ?";
					PreparedStatement stm2 = connection.prepareStatement(select2);

					stm2.setInt(1, value1);
					stm2.setInt(2, value2);
					ResultSet resultSet = stm2.executeQuery();
					rsmd = resultSet.getMetaData();
					while (resultSet.next()) {
						for (int i = 1; i <= rsmd.getColumnCount(); i++) {
							String columnValue = resultSet.getString(i);
							System.out.println(rsmd.getColumnName(i) + " : " + columnValue + " ");
						}
						System.out.println("");
					}
					break;
				case 3:
					System.out.println("enter two warranty :");
					System.out.println("First Value");
					int value3 = sc.nextInt();
					System.out.println("second Value");
					int value4 = sc.nextInt();
					String select3 = "select name,price,warranty from Product_pricing_info where warranty between ? and ?";
					PreparedStatement stm3 = connection.prepareStatement(select3);

					stm3.setInt(1, value3);
					stm3.setInt(2, value4);
					resultSet = stm3.executeQuery();
					rsmd = resultSet.getMetaData();
					while (resultSet.next()) {
						for (int i = 1; i <= rsmd.getColumnCount(); i++) {
							String columnValue = resultSet.getString(i);
							System.out.println(rsmd.getColumnName(i) + " : " + columnValue + " ");
						}
						System.out.println("");
					}
					break;
				default:
					System.out.println("Enter the Correct input");
					select = sc.nextInt();
					break;
				}
			} catch (Exception e) {
				System.out.println(e);
				sc.nextLine();

			}

		}
	}

}
