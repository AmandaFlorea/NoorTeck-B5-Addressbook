package com.noorteck.qa.utils;

import com.noorteck.qa.pages.AddressesPage;
import com.noorteck.qa.pages.HomePage;
import com.noorteck.qa.pages.SignInPage;
import com.noorteck.qa.pages.SignUpPage;

public class ObjInitialize extends Constants {
	
	 
	
	public static void initializeClassObj() {
		//initialize each page class objects here..
		
		addressesObj = new AddressesPage();
		homePageObj = new HomePage();
		signInObj = new SignInPage();
		signUpObj = new SignUpPage();
	}

}
