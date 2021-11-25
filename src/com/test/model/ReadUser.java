package com.test.model;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.LinkedList;
import java.util.List;

public class ReadUser {

	public static List<User> getUser() {
		List<User> userList = new LinkedList<User>();

		try {
			File f = new File("Digi-lock-user.txt");
			if (f.exists()) {
				FileInputStream file = new FileInputStream("Digi-lock-user.txt");
				ObjectInputStream input = new ObjectInputStream(file);
				userList = (List<User>) input.readObject();
				input.close();
				file.close();

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return userList;
	}
}
