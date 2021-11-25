package com.credential.lockme;

import java.util.List;

public class FetchBySite {

	public static void fetchbySite(List<Creds> credList, String siteName) {
		try {
			int match = 0;
			for (Creds userCreds : credList) {
				if (userCreds.getSiteName().equals(siteName)) {
					System.out.println("Site Name : " + userCreds.getSiteName());
					System.out.println("Site UserName : " + userCreds.getUserName());
					System.out.println("Site Password : " + userCreds.getPassword());
					match++;
				}
				if (match == 0) {
					System.out.println("Site name does not match please try again !");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
