package com.test.model;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedList;
import java.util.List;

public class Registration {

	public static boolean register(User user) {

		List<User> userList = ReadUser.getUser();
		if (!userList.isEmpty()) {
			userList = ReadUser.getUser();
		} else {
			userList = new LinkedList<User>();
			System.out.println("First Registration !");
		}
		userList.add(user);
		try {
			FileOutputStream file = new FileOutputStream("Digi-lock-user.txt");
			ObjectOutputStream out = new ObjectOutputStream(file);
			out.writeObject(userList);
			out.close();
			file.close();
			System.out.println("Registration Successfulll !");
		} catch (Exception e) {
			System.out.println("Registration Failed  try Again !");
		}
		return true;

	}

}
