package com.test.lockme;

import java.util.List;
import java.util.Scanner;

import com.credential.lockme.Creds;
import com.credential.lockme.FetchBySite;
import com.credential.lockme.ReadCreds;
import com.credential.lockme.StoreCreds;
import com.test.model.Login;
import com.test.model.Registration;
import com.test.model.User;

public class Main {

	public static void main(String[] args) {
		System.out.println("==========================================");
		System.out.println("*					*");
		System.out.println("*   WELCOME TO LOCKME DIGITAL LOCKER	*");
		System.out.println("*					*");
		System.out.println("==========================================");

		System.out.println("--Please select your option--");
		System.out.println("==========================================");
		System.out.println("  --1) Register           2) Login --");
		Scanner scanner = new Scanner(System.in);
		int option = scanner.nextInt();
		switch (option) {
		case 1:
			User userReg = registerData();
			Registration.register(userReg);
			break;

		case 2:
			User userLog = loginData();
			boolean response = Login.loginUser(userLog);
			if (response)

				afterLogin(userLog);
			break;

		default:
			throw new IllegalArgumentException("Unexpected value: " + option);
		}

	}

	private static void afterLogin(User userLog) {

		System.out.println("==========================================");
		System.out.println("--Please select your option--");
		System.out.println("==========================================");
		System.out.println("  -- 1) Store Creds     2)  Fetch Creds --");
		Scanner sc = new Scanner(System.in);
		int option3 = sc.nextInt();
		switch (option3) {
		case 1:
			Creds userCred = storeCredData();
			StoreCreds.storeCreds(userCred, userLog);

			break;
		case 2:
			afterFechting(userLog);

			break;

		default:
			throw new IllegalArgumentException("Unexpected value: " + option3);
		}

	}

	private static void afterFechting(User userLog) {
		System.out.println("==========================================");
		System.out.println("--Please select your option--");
		System.out.println("==========================================");
		System.out.println("--1)  Fetch All    2)Fetch By SiteName--");
		Scanner scanner1 = new Scanner(System.in);
		int option3 = scanner1.nextInt();
		switch (option3) {
		case 1: {
			ReadCreds.getCreds(userLog);
			break;
		}
		case 2: {
			String siteName = FetchBySite();
			List<Creds> credList = ReadCreds.getCreds(userLog);
			FetchBySite.fetchbySite(credList, siteName);
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + option3);
		}
	}

	private static String FetchBySite() {
		Scanner scs = new Scanner(System.in);
		System.out.println("Enter siteName : ");
		return scs.nextLine();
	}

	private static Creds storeCredData() {
		Creds cred = new Creds();
		Scanner scanner = new Scanner(System.in);
		System.out.println("==========================================");
		System.out.println("*					*");
		System.out.println("*   WELCOME TO STORE CREDS PAGE	*");
		System.out.println("*					*");
		System.out.println("==========================================");
		System.out.println("Enter Id : ");
		cred.setId(scanner.nextLine());
		System.out.println("Enter UserName : ");
		cred.setUserName(scanner.nextLine());
		System.out.println("Enter siteName : ");
		cred.setSiteName(scanner.nextLine());
		System.out.println("Enter password : ");
		cred.setPassword(scanner.nextLine());

		return cred;
	}

	private static User loginData() {
		User user = new User();
		Scanner keyboard = new Scanner(System.in);
		System.out.println("==========================================");
		System.out.println("*					*");
		System.out.println("*   WELCOME TO LOGIN PAGE	 *");
		System.out.println("*					*");
		System.out.println("==========================================");

		System.out.println("Enter UserName : ");
		user.setUserName(keyboard.nextLine());
		System.out.println("Enter password : ");
		user.setPassword(keyboard.nextLine());

		return user;
	}

	private static User registerData() {
		User user = new User();
		Scanner sc = new Scanner(System.in);
		System.out.println("==========================================");
		System.out.println("*					*");
		System.out.println("*   WELCOME TO REGISTRATION PAGE	*");
		System.out.println("*					*");
		System.out.println("==========================================");
		System.out.println("Enter UserName : ");
		user.setUserName(sc.nextLine());
		System.out.println("Enter Your Email : ");
		user.setEmail(sc.nextLine());
		System.out.println("Enter password : ");
		user.setPassword(sc.nextLine());
		System.out.println("Enter Confirm Password : ");
		user.setCnfPassword(sc.nextLine());
		return user;
	}

}
