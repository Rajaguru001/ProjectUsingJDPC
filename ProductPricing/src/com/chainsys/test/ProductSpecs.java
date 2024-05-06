package com.chainsys.test;

import java.util.*;

public class ProductSpecs {
	public static int productwarranty(int noofwarranty) {
		Scanner scn = new Scanner(System.in);
		while (true) {
			if (noofwarranty > 0) {
				break;
			} else {
				System.out.println("Enter The value in positive Interger: ");
				noofwarranty = scn.nextInt();
			}
		}

		System.out.println("do have membership (yes/no)?");
		String m = scn.next();
		System.out.println("----------------------------------------------");
		
		if (m.equalsIgnoreCase("yes")) {
			noofwarranty += 1;
			System.out.println("*Congrats you have now 1 year !Extra warranty*");
			return noofwarranty;
		}
		return noofwarranty;

	}

	public int amazonwarrentyy(int total) {
		Scanner product = new Scanner(System.in);
		System.out.println("please choose the product(Navigator,Location Finder,Smart way out)");

		boolean b = true;
		while (b) {

			String product1 = product.nextLine();

			switch (product1.toLowerCase()) {

			case "navigator":
				System.out.println("The cost is 15000");
				System.out.println("No.of.Users: 12k");
				System.out.println("pre Register: 20k");
				System.out.println("Special discount for Members");
				System.out.println("do you want to buy our product (Yes/No/exit):");
				
				String map = product.next();
				if (map.equals("yes")) {
					total+=15000;
					System.out.println("Thanks for purchasing your "+total);
				} else {
					System.out.println("Thanks for visiting your products");

				}
				b = false;
				break;
			case "location finder":
				System.out.println("The cost is 18000");
				System.out.println("No.of.Users: 13k");
				System.out.println("pre Register: 10k");
				System.out.println("Special discount for Members");
				System.out.println("do you want to buy our product (Yes/No/exit):");
				String map1 = product.next();
				if (map1.equals("yes")) {
					total+=18000;
					System.out.println("Thanks for purchasing your  "+total);
				} else {
					System.out.println("Thanks for visiting your products");

				}
				b = false;
				break;
			case "smart way out":
				System.out.println("The cost is 17000");
				System.out.println("No.of.Users: 15k");
				System.out.println("pre Register:1k");
				System.out.println("Special discount for Members");
				System.out.println("do you want to buy our product (Yes/No/Exit):");
				String map2 = product.next();
				if (map2.equals("yes")) {
					total+=17000;
					System.out.println("Thanks for purchasing your "+total);
				} else {
					System.out.println("Thanks for visiting your products");

				}

				b = false;
				break;

			case "exit":
				System.exit(0);
			default:
				System.out.println("ENter the valid data");

			}

		}

		return total;
	}

	public int flipkartwarrentyy(int total) {
		Scanner input = new Scanner(System.in);
	//	ProductPricing gaming= new ProductPricing("Gaming", 70000, 10, 4,4);
		System.out.println("please choose the product (Gaming fps,Bluestack,Online games");
		boolean b = true;
		while (b) {

			String product2 = input.nextLine();
			switch (product2) {
			case "gaming fps":
				System.out.println("The cost is 20000");
				System.out.println("No.of.Users: 1M");
				System.out.println("pre Register: 21k");
				System.out.println("Special discount for Members");
				System.out.println("do you want to buy our product (Yes/No/exit):");
				String gamings = input.next();
				if (gamings.equals("yes")) {
					total+=20000;
					System.out.println("Thanks for purchasing your "+total);
				} else {
					System.out.println("Thanks for visiting your products");

				}
				b = false;
				break;
			case "bluestack":
				System.out.println("The cost is 10000");
				System.out.println("No.of.Users: 1.5M");
				System.out.println("pre Register: 12k");
				System.out.println("Special discount for Members");
				System.out.println("do you want to buy our product (Yes/No/exit):");
				String gaming1 = input.next();
				if (gaming1.equals("yes")) {
					total+=10000;
					System.out.println("Thanks for purchasing your "+total);
				} else {
					System.out.println("Thanks for visiting your products");

				}
				b = false;
				break;
			case "online games":
				System.out.println("The cost is 25000");
				System.out.println("No.of.Users: 500 k");
				System.out.println("pre Register:5k");
				System.out.println("Special discount for Members");
				System.out.println("do you want to buy our product (Yes/No/exit):");
				String gaming2 = input.next();
				if (gaming2.equals("yes")) {
					total+=25000;
					System.out.println("Thanks for purchasing your  "+total);
				} else {
					System.out.println("Thanks for visiting your products");

				}
				b = false;
				break;
			case "exit":
			System.exit(0);
			default:
				System.out.println("ENter the valid data");
				product2 = input.next();

			}
		}
		return total;

	}

	public static int ajiowarrenty(int total) {
		Scanner product = new Scanner(System.in);
		System.out.println("please choose the product (Streaming movie ,Rented Movies,dolby home driver");
		boolean b = true;
		while (b) {
			String product3 = product.nextLine();
			switch (product3) {
			case "streaming movie":
				
				System.out.println("Date of release:Next month");
				System.out.println("pre Register: 26k");
				System.out.println("Special discount for Members");
				System.out.println("do you want to buy our product (Yes/No/exit):");
				String movie = product.next();
				if (movie.equals("yes")) {
					total+=15000;
					System.out.println("Thanks for purchasing your "+total);
				} else {
					System.out.println("Thanks for visiting your products");

				}
				b = false;
				break;
			case "rented movies":
				System.out.println("The cost is 12000");
				System.out.println("Date of release:Next month");
				System.out.println("pre Register: 13k");
				System.out.println("Special discount for Members");
				System.out.println("do you want to buy our product (Yes/No/exit):");
				String movie2 = product.next();
				if (movie2.equals("yes")) {
					total+=12000;
					System.out.println("Thanks for purchasing your"+total);
				} else {
					System.out.println("Thanks for visiting your products");

				}
				b = false;
				break;
			case "dolby home driver":
				System.out.println("The cost is 14000");
				System.out.println("Date of release:Not yet confirmed");
				System.out.println("pre Register :5k");
				System.out.println("Special discount for Members");
				System.out.println("do you want to buy our product (Yes/No/Exit):");
				String movie3 = product.next();
				if (movie3.equals("yes")) {
					total+=14000;
					System.out.println("Thanks for purchasing your "+total);
				} else {
					System.out.println("Thanks for visiting your products");

				}
				b = false;
				break;
			case "exit":
				
				System.exit(0);
				
			
			default:
				System.out.println("ENter the valid data");
				product3 = product.next();

			}
		}

		return total;
	}

	public static int totalcost(int costofproduct) {

		Scanner sc = new Scanner(System.in);
		String n1 = sc.next();
		if (n1.equals("yes")) {
			return costofproduct;
		} else {
			return 0;
		}

	}
}
