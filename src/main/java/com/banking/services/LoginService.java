package com.banking.services;

import com.banking.business.LoginBusiness;

public class LoginService {
	public boolean validateLoginService(String usr, String pass) {
		return new LoginBusiness().validateLoginBusiness(usr, pass);
	}

}
