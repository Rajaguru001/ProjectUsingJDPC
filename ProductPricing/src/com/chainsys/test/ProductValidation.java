package com.chainsys.test;

import java.util.LinkedList;
import java.util.Scanner;

public class ProductValidation {
	public static String name() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter User name:");
		String name = sc.next();
		while (true) {
			if (name.matches("^[a-zA-Z]+$")) {
				return name;
			} else {
				System.out.println("Enter the valid data");
				name = sc.next();
			}
		}
	}

	public static String pwd() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the password:");
		String pwd = sc.next();
	//	LinkedList<String>li=new LinkedList<String>();
		while(true) {
	
				
			
		
		
		while (true) {
			if (pwd.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=!])(?=\\S+$).{8,20}$")) {

				return pwd;

			} else {
				System.out.println("Use_one uppercase-[A-Z]" + "\n" + "use_one lowercase-[a-z]" + "\n"
						+ "Special character-[!@#$%]");
				pwd = sc.next();

			}

		}

	}
	}
	public static String phone(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Phone number:");
		String Phone=sc.next();
		if (Phone.matches("^[0-9]{10}$")) {
			return Phone;
		} else {
			System.out.println("Enter the Positive Interger:");
			Phone = sc.next();
		}
		return Phone;
		
	}
}
