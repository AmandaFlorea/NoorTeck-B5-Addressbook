package com.noorteck.qa.test;

import com.noorteck.qa.utils.CommonUI;
import com.noorteck.qa.utils.ObjInitialize;

public class AddressBookTest extends ObjInitialize {
	
	static String url = "";

	public static void main(String[] args) {
		
		
		CommonUI.openBrowser("chrome");
		CommonUI.navigate(url);
		initializeClassObj();
		
		
		//testCase1();
		testCase2();
		
		
		
		
		CommonUI.quitBrowser();
		
	}
	
	public static void testCase1() {
		
		url = "http://a.testaddressbook.com/sign_up";
		driver.get(url);
		
		signUpObj.enterEmail("chickenNoodle7@gmail.com");
		signUpObj.enterPassword("why1234");
		signUpObj.clickSignUp();
		signUpObj.verifyWelcomeMessage();
	}
	
	public static void testCase2() {
		url = "http://a.testaddressbook.com/sign_in";
		driver.get(url);
		
		signInObj.enterEmail("chickenNoodle7@gmail.com");
		signInObj.enterPassword("why1234");
		signInObj.clickSignIn();
		homePageObj.clickAddressesButton();
		addressesObj.clickNewAddress();
		addressesObj.enterFirstName("Jane");
		addressesObj.enterLastName("Doe");
		addressesObj.enterAddress1Field("1234 derry lane");
		addressesObj.enterCityField("woodbrdige");
		addressesObj.selectState("value","VA");
		addressesObj.clickCountry();
		addressesObj.enterAge("22");
		addressesObj.enterPhoneNumber("123-234-3434");
		addressesObj.clickCommonInterest();
		addressesObj.enterNotes("Automation is fun");
		addressesObj.clickCreateAddress();
		addressesObj.clickListButton();
		
		String expectedFN = "Jane";
		String actualFN = addressesObj.verifyFirstNameField();
		if(actualFN.equals(expectedFN)) {
			System.out.println("First Name verified");
		}else {
			System.out.println("Not Verfified");
		}
		
		String expectedLN = "Doe";
		String actualLN = addressesObj.verifyLastNameField();
		if(actualLN.equals(expectedLN)) {
			System.out.println("Last Name verified");
		}else {
			System.out.println("Not Verfified");
		}
		
		String expectedCity = "woodbridge";
		String actualCity = addressesObj.verifyCityField();
		if(actualCity.equals(expectedCity)) {
			System.out.println("City verified");
		}else {
			System.out.println("Not Verfified");
		}
				
		String expectedState = "VA";
		String actualState = addressesObj.verifyStateField();
		if(actualState.equals(expectedState)) {
			System.out.println("State verified");
		}else {
			System.out.println("Not Verfified");
		}
	}
	
} 


/**
		--------------------------------------	INSTRUCTIONS --------------------------------------------
			
			---> Create JAVA CLASS for each page of the application
			---> Inspect the elements and store the values 
			---> Create the class constructor
			---> Create the methods
		
			---> DONT FORGET ***** 	EACH PAGE CLASS SHOULD INHERIT CommonUI Class 				*******************
			---> DONT FORGET ***** 	DECLARE PAGE CLASS OBJECT in CONSTANTS CLASS 				*******************
			---> DONT FOGET  ***** 	INITIALIZE PAGE CLASS OBJECTS IN ObjInitialize JAVA ClASS 	*******************
			---> DONT FOGET  ***** 	CHANGE JAVA VERSION TO 1.8 									*******************
			
			
			
			---> For each test case create a method then call those methods from main method. 
			---> DONT FORGET *****	Refer to the INSTRUCTION PDF file for the test cases to automate **************
			
			---> ONCE FINISHED AUTOMATING Create Repository in GitHub and push to GitHub
			---> Once pushed add US to the project then send picture in MENTORS GROUP CHAT
						 Crystal: 		--> Koritzerc23@gmail.com
						 Helen: 		--> Hnbehining@gmail.com
						 Ahmad: 		--> a.stanikzai77@gmail.com
						 Fahim: 		--> NTKBatch5


*/

