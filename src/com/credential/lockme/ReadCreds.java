package com.credential.lockme;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.LinkedList;
import java.util.List;

import com.test.model.User;

public class ReadCreds {

	public static List<Creds> getCreds(User user) {
		List<Creds> credList = new LinkedList<Creds>();
		try {
			File f = new File(user.getUserName() + "Digi-lock-creds.txt");
			if (f.exists()) {
				FileInputStream file = new FileInputStream(user.getUserName() + "Digi-lock-creds.txt");
				ObjectInputStream input = new ObjectInputStream(file);
				credList = (List<Creds>) input.readObject();
				System.out.println(credList);

				input.close();
				file.close();
			}

		} catch (Exception e) {
			// TODO: handle exception
		}
		return credList;
	}

}
