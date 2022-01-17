package com.noorteck.qa.steps;

import com.noorteck.qa.utils.CommonUI;
import com.noorteck.qa.utils.ObjInitialize;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddressBookStepDef extends ObjInitialize {
	
	String url = "http://a.testaddressbook.com/sign_in";
	
	@Given("User is on Sign in on page")
	public void user_is_on_sign_in_on_page() {
		CommonUI.openBrowser("chrome");
		CommonUI.navigate(url);
		initializeClassObj();
 
		 
	}

	@When("User Enters Username and Password")
	public void user_enters_username_and_password() {
		signInObj.enterEmail("chickenNoodle7@gmail.com");
		signInObj.enterPassword("why1234");
		
	     
	}

	@When("User is able to click Sign On Button")
	public void user_is_able_to_click_sign_on_button() {
		signInObj.clickSignIn();
	     
	}

	@When("User is able to click New Address Button")
	public void user_is_able_to_click_new_address_button() {
		homePageObj.clickAddressesButton();
		addressesObj.clickNewAddress();
	     
	}

	@When("User is able to enter to address Information")
	public void user_is_able_to_enter_to_address_information() {
	    
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
	}

	@Then("User is able to Click create address button")
	public void user_is_able_to_click_create_address_button() {
		addressesObj.clickCreateAddress();
		CommonUI.quitBrowser();
	}

}
