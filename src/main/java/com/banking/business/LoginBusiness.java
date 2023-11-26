package com.banking.business;

import com.banking.DAO.LoginDAO;

public class LoginBusiness {

	public boolean validateLoginBusiness(String usr, String pass) {
		return new LoginDAO().validateUserLoginCreds(usr, pass); 
	}
}
