package com.chainsys.test;

import java.util.InputMismatchException;
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

		while (true) {

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

	public static void validage(int age) throws AgeBelowEighteenException {

		if (age < 8) {

			throw new AgeBelowEighteenException();

		}

	}

	public static int getage() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Age");
		int age;
		while (true) {
			try {
				age = sc.nextInt();
				validage(age);
				return age;
			} catch (AgeBelowEighteenException ex) {
				System.out.println("Caught the exception");
				System.out.println("Exception occured: " + ex);
				System.out.println("enter age greater 8:");
				age = sc.nextInt();

			} catch (InputMismatchException ex) {
				System.out.println("Exception occured: " + ex);
				System.out.println("enter age greater 8:");
				age = sc.nextInt();
			}
		}

	}

	public static String phone() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Phone number:");
		String Phone = sc.next();
		while (true) {
			if (!Phone.matches("[6789]{1}[0-9]{9}")) {
				System.out.println("Enter the Positive Interger:");
				Phone = sc.next();
			} else {
				return Phone;
			}

		}
	}
}
