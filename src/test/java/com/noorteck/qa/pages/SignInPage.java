package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;

public class SignInPage extends CommonUI {

	// inspect elements and store value
	@FindBy(xpath = "//*[@placeholder='Email']")
	WebElement emailField;

	@FindBy(xpath = "//*[@placeholder='Password']")
	WebElement passwordField;

	@FindBy(name = "commit")
	WebElement signInButton;

	// create class constructor
	public SignInPage() {
		PageFactory.initElements(driver, this);
	}

	// creating methods for interacting
	public void enterEmail(String email) {
		enter(emailField, email);
	}

	public void enterPassword(String password) {
		enter(passwordField, password);
	}

	public void clickSignIn() {
		click(signInButton);
	}

}