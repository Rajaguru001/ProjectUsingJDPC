package com.chainsys.test;

import java.sql.Connection;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.Scanner;

import com.chainsys.dao.Check;
import com.chainsys.model.ProductPricing;
import com.chainsys.model.User1;
import com.chainsys.util.DataChecking;

//import productpricingjdpc.ProductFunction;

//import productpricingjdpc.Check;
//import productpricingjdpc.DataChecking;
//import productpricingjdpc.ProductFunction;
//import productpricingjdpc.ProductPricing;
//import productpricingjdpc.ProductSpecs;
//import productpricingjdpc.ProductValidation;
//import productpricingjdpc.User1;

public class ProductFunction {
	public static void user() throws ClassNotFoundException, SQLException {
		Scanner sc = new Scanner(System.in);
		Check check = new Check();
		ProductFunction pf = new ProductFunction();
		// String input = sc.next();
		User1 u = new User1();
		ProductSpecs ps = new ProductSpecs();
		ProductPricing gps = new ProductPricing("gps", 60000, 10, 4, 4);
		ProductPricing gaming = new ProductPricing("Gaming", 70000, 10, 4, 4);
		ProductPricing theater = new ProductPricing("Theater", 50000, 10, 4, 4);
		ProductValidation pv = new ProductValidation();
		DataChecking dc = new DataChecking();
		int total = 0;
		System.out.println("Do you have a account (y/n):");
		String acc = sc.next();

		while (true) {
			if (acc.equals("y") || acc.equals("Y")) {
				System.out.println("Great! you have a account");
				System.out.println("-------LOGIN PAGE--------");
				String username = ProductValidation.name();
				u.setUsername(username);
				String pwd = ProductValidation.pwd();
				u.setPassword(pwd);
				check.login(u);
			}

			while (true) {
				if (acc.equals("n") || acc.equals("N")) {
					System.out.println("SIGNUP PAGE");

					String firstname = ProductValidation.name();
					u.setUsername(firstname);

					System.out.println("Last Name:");
					String lastname = sc.next();
					u.setLastname(lastname);

					String pwd = ProductValidation.pwd();
					u.setPassword(pwd);

					String phonenumber = ProductValidation.phone();
					u.setPhonenumber(phonenumber);

					int age = ProductValidation.getage();
					u.setAge(age);

					u.getFirstname();
					u.getLastname();
					u.getAge();

					check.Register(u);
					System.out.println("phone number:" + u.getPhonenumber());
				}
//
//				System.out.println("Your user Name :" + u.getUsername());
//				System.out.println("       The Products Are        ");
//				System.out.println("-------------------------------");
//				System.out.println("-->1) gps console" + "\n" + "-->2) gaming console" + "\n"
//						+ "-->3) smart home theater" + "-->4)Product filter");
//				System.out.println("-------------------------------");
//				System.out.println("Please choose the Number 1,2,3");
//				System.out.println("-------------------------------");
				boolean b = true;
				while (b) {
					System.out.println("Your user Name :" + u.getUsername());
					System.out.println("       The Products Are        ");
					System.out.println("-------------------------------");
					System.out.println("-->1) gps console" + "\n" + "-->2) gaming console" + "\n"
							+ "-->3) smart home theater" + "-->4)Product filter");
					System.out.println("-------------------------------");
					System.out.println("Please choose the Number 1,2,3");
					System.out.println("-------------------------------");
					String nameofproduct = sc.next();
					switch (nameofproduct.toLowerCase()) {
					case "1":

						System.out.println("product: " + gps.getNameofproduct());
						gps.display();
						System.out.println("------------------------------------");
						System.out.println("do you want to purchase your product(yes/no)? ");
						String s = sc.next();
						if (s.equals("yes")) {
							System.out.println("Thank you for purchasing our product:" + gps.getCostofproduct());
							gps.setNoofwarranty(ProductSpecs.productwarranty(gps.noofwarranty));

							System.out.println("~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~");

							System.out.println("Warrenty : " + gps.getNoofwarranty());

							System.out.println("~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~");
							System.out.println("|Our Other Maps products|");
							System.out.println("~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~");
						} else {
							System.out.println("Thanks for visit our product");
						}
						total += ps.amazonwarrentyy(total);
						total += gps.getCostofproduct();
						System.out.println(" Total purchase value is" + total);

						b = false;
						return;
					case "2":

						System.out.println("product:" + gaming.getNameofproduct());
						gaming.display();

						System.out.println("Do you want to purchase our product (yes/no): ");
						String gc = sc.next();
						if (gc.equals("yes")) {
							System.out.println("Thank you for purchasing our product:" + gaming.getCostofproduct());
							System.out.println("------------------------------------");
							gaming.setNoofwarranty(ProductSpecs.productwarranty(gaming.noofwarranty));
							System.out.println("Warranty :" + gaming.getNoofwarranty());

							System.out.println("~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~");
							System.out.println("||Our Other gaming setup  products||");
							System.out.println("~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~");

						} else {
							System.out.println("Thanks for visit our product");
						}

						total += ps.flipkartwarrentyy(total);
						total += gaming.getCostofproduct();
						System.out.println(" Total purchase value is" + total);
						b = false;
						return;
					case "3":

						System.out.println("product: " + theater.getCostofproduct());
						theater.display();
						System.out.println("Do you want to purchase our product(yes/No): ");
						String hmt = sc.next();
						if (hmt.equals("yes")) {
							System.out.println("------------------------------------");
							System.out.println("Thank you for purchasing our product:" + theater.getCostofproduct());
							theater.setNoofwarranty(ProductSpecs.productwarranty(theater.noofwarranty));
							System.out.println("Warranty: " + theater.getNoofwarranty());
							System.out.println("~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~");
							System.out.println("||Our Other gaming setup products||");
							System.out.println("~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~");

						} else {
							System.out.println("Thanks for visit our product");
						}
						total += ProductSpecs.ajiowarrenty(total);
						total += theater.getCostofproduct();
						System.out.println("Total purchase value is " + total);
						b = false;
						return;
					case "4":
						check.select();
						break;
					}
					
				}

			}

		}
	}

	public static void admin() throws ClassNotFoundException, SQLException {
		Scanner sc = new Scanner(System.in);
		Check check = new Check();
		ProductFunction pf = new ProductFunction();
		System.out.println("ADMIN USER LOGIN:");
		LinkedList liuser = new LinkedList();
		LinkedList lipwd = new LinkedList();
		liuser.add("Rajaguru");
		lipwd.add("Raja#321");
		liuser.add("vasa");
		lipwd.add("Vasa!123");
		String admin = sc.next();
		System.out.println("Password");
		String pwd = sc.next();
		while (true) {
			if (liuser.contains(admin) && lipwd.contains(pwd)) {
				ProductPricing gps1 = new ProductPricing("gps", 60000, 10, 4, 4);
				ProductPricing gaming1 = new ProductPricing("Gaming", 70000, 10, 4, 4);
				ProductPricing theater1 = new ProductPricing("Theater", 50000, 10, 4, 4);
				Connection con = DataChecking.getConnection();
				String query = "Select *from Product_pricing_info";
				Statement sc1 = con.createStatement();
				ResultSet rs = sc1.executeQuery(query);
				ResultSetMetaData rsmd = rs.getMetaData();
				int columnNumber = rsmd.getColumnCount();
				while (rs.next()) {
					for (int i = 1; i <= columnNumber; i++) {
						String columnValue = rs.getString(i);
						System.out.println(rsmd.getColumnName(i) + " : " + columnValue + " ");
					}
					System.out.println("");

				}
				break;
			}

			else {
				System.out.println("Enter the correct username");
				admin = sc.next();
				System.out.println("Enter the correct password");
				pwd = sc.next();

			}

		}
		while(true) {
		System.out.println("1)Add Product 2)Delete Product 3)update product 4)select range 5)Exit");
		int cred = sc.nextInt();
		switch (cred) {	
		case 1:
			System.out.println("Product Name");
			String productname = sc.next();
			System.out.println("Product Cost");
			int productcost = sc.nextInt();
			System.out.println("Product User");
			int productuser = sc.nextInt();
			System.out.println("Product warranty");
			int productwarranty = sc.nextInt();
			System.out.println("Product Rating");
			double productrating = sc.nextDouble();

			ProductPricing pp = new ProductPricing(productname, productcost, productuser, productwarranty,
					productrating);

			check.add(pp);
			break;
		case 2:
			System.out.println("Enter The ID");
			int delete = sc.nextInt();
			check.delete(delete);
			break;
		case 3:
			System.out.println("Enter The ID");
			System.out.println("Product Name");
			String name = sc.next();
			System.out.println("Product Cost");
			int cost = sc.nextInt();
			System.out.println("Product warranty");
			int warranty = sc.nextInt();
			System.out.println("Product Rating");
			int id = sc.nextInt();
			check.update(name, cost, warranty, id);
			break;
		case 4:
			System.out.println("Enter The price Range:");

			check.select();
		case 5:
			System.exit(0);
			break;

		}

	}
	}
}
