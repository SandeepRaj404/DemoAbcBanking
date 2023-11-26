package com.banking.DAO;

public class LoginDAO {
	public boolean validateUserLoginCreds(String usr, String pass) {
		//DB opration hua 
		System.out.println(pass);
		if (usr.equalsIgnoreCase("S101") && pass.equals("SSS")) {
			return true;
		}
		return false;
		
	}

}
