package com.credential.lockme;

import java.util.List;

import com.test.model.User;

public class Fetchcred {

	public static boolean fetchData(User user) {
		List<Creds> credlist = ReadCreds.getCreds(user);
		for (Creds credInfo : credlist) {
			System.out.println(credInfo);
		}
		return false;

	}

}
