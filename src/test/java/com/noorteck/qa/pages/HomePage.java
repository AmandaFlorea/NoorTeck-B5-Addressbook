package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;

public class HomePage extends CommonUI {
	
	@FindBy(xpath = "//*[@data-test='home']")
	WebElement homeButton;
	
	@FindBy(xpath = "//*[@data-test='addresses']")
	WebElement addressesButton;
	
	@FindBy(xpath = "//*[@data-test='sign-out']")
	WebElement signOutButton;

	@FindBy(xpath = "//h1[text()='Welcome to Address Book']")
	WebElement welcomeMessage;
	
	
	public HomePage(){
		PageFactory.initElements(driver, this);
	}
	
	public void clickHomeButton() {
		click(homeButton);
	}
	
	public void clickSignOut() {
		click(signOutButton);
	}
	
	public void clickAddressesButton() {
		click(addressesButton);
	}
	
	public void welcomMessage() {
		isDisplayed(welcomeMessage);
	}
}
