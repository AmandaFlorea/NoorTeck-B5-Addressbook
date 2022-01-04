package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;

public class SignUpPage extends CommonUI {

	// inspect elements and store value
	@FindBy(xpath = "//*[@placeholder='Email']")
	WebElement emailField;

	@FindBy(xpath = "//*[@placeholder='Password']")
	WebElement passwordField;

	@FindBy(name = "commit")
	WebElement signUpButton;
	
	@FindBy(xpath = "//*[text()='Welcome to Address Book']")
	WebElement welcomeMessage;

	// class constructor
	public SignUpPage() {
		PageFactory.initElements(driver, this);
	}

	// creating methods to interact
	public void enterEmail(String email) {
		enter(emailField, email);
	}

	public void enterPassword(String password) {
		enter(passwordField, password);
	}

	public void clickSignUp() {
		click(signUpButton);
	}
	
	public void verifyWelcomeMessage() {
		getText(welcomeMessage);
	}
}
