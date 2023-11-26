package com.banking.controller;

import com.banking.services.LoginService;

public class LoginController {
	public String validateLogin(String usrId, String pass) {
		if(new LoginService().validateLoginService(usrId, pass)) {
			return "Success";
		}
		return "False";
	}

}
