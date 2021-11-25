package com.test.model;

import java.util.LinkedList;
import java.util.List;

public class Login {

	public static boolean loginUser(User user) {

		List<User> userlist = ReadUser.getUser();
		int match = 0;
		for (User userInfo : userlist) {
			if (user.getUserName().equals(userInfo.getUserName())
					&& user.getPassword().equals(userInfo.getPassword())) {
				System.out.println("Login is Successfull ! ");
				match++;
				return true;
			}

		}
		if (match == 0) {
			System.out.println("Login Failed try again ! ");
		}
		return false;

	}

}
