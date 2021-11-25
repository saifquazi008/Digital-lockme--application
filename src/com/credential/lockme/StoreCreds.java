package com.credential.lockme;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedList;
import java.util.List;

import com.test.model.User;

public class StoreCreds {
	public static boolean storeCreds(Creds cred, User user) {
		List<Creds> credList = ReadCreds.getCreds(user);
		if (credList.isEmpty()) {
			credList = ReadCreds.getCreds(user);
		} else {
			credList = new LinkedList<Creds>();
			System.out.println("First Creds stored ! ");
		}
		credList.add(cred);
		try {
			FileOutputStream file = new FileOutputStream(user.getUserName() + "Digi-lock-creds.txt");
			ObjectOutputStream out = new ObjectOutputStream(file);
			out.writeObject(credList);
			out.close();
			file.close();
			System.out.println("Creds stored successfully !");

		} catch (Exception e) {
			System.out.println("Failed for store Creds ! ");
		}
		return true;

	}

}
