package com.chainsys.main;

import java.sql.SQLException;
import java.util.LinkedList;
import java.util.Scanner;
import com.chainsys.dao.Check;
import com.chainsys.model.*;
import com.chainsys.test.*;

import com.chainsys.util.DataChecking;

//import productpricingjdpc.ProductFunction;
//import productpricingjdpc.ProductPricing;
//import productpricingjdpc.ProductSpecs;
//import productpricingjdpc.ProductValidation;
//import productpricingjdpc.User1;

public class ProductDetails {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Scanner sc = new Scanner(System.in);
		Check check = new Check();
		ProductFunction pf = new ProductFunction();
		System.out.println("ADMIN/USER");
		String input = sc.next();

		switch (input.toLowerCase()) {
		case "user":

			User1 u = new User1();
			ProductSpecs ps = new ProductSpecs();
			ProductPricing gps = new ProductPricing("gps", 60000, 10, 4, 4);
			ProductPricing gaming = new ProductPricing("Gaming", 70000, 10, 4, 4);
			ProductPricing theater = new ProductPricing("Theater", 50000, 10, 4, 4);
			ProductValidation pv = new ProductValidation();
			DataChecking dc = new DataChecking();

			ProductFunction.user();

			break;

		case "admin":
			ProductFunction.admin();

		}

	}
	}

