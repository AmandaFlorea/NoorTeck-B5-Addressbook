package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;

public class AddressesPage extends CommonUI{
	
	@FindBy(linkText = "New Address")
	WebElement newAddressButton;
	
	@FindBy(id = "address_first_name")
	WebElement firstNameField;
	
	@FindBy(id = "address_last_name")
	WebElement lastNameField; 

	@FindBy(name = "address[address1]")
	WebElement address1Field; 
	
	@FindBy(name = "address[address2]")
	WebElement address2Field; 
	
	@FindBy(id = "address_city")
	WebElement cityField;
	
	@FindBy(name = "address[state]")
	WebElement stateDropDown; 
	
	@FindBy(name = "address[zip_code]")
	WebElement zipcodeField;
	
	@FindBy(xpath = "//*[@value='us']")
	WebElement usCountryRadio; 
	
	@FindBy(xpath = "//*[@type='number']")
	WebElement ageField; 
	
	@FindBy(id = "address_website")
	WebElement webSiteField; 
	
	@FindBy(id = "address_phone")
	WebElement  phoneNumberField; 
	
	@FindBy(id = "address_interest_dance")
	WebElement danceCheckBox;
	
	@FindBy(name = "address[note]")
	WebElement noteField; 
	
	@FindBy(css = ".btn.btn-primary")
	WebElement createAddressButton; 
	
	@FindBy(css = ".alert.alert-notice")
	WebElement addressCreatedMessage; 
	
	@FindBy(xpath = "//*[@data-test='edit']")
	WebElement editButton; 
	
	@FindBy(xpath = "//*[@data-test='list']")
	WebElement listButton;
	
	@FindBy(xpath = "//td[text()='Jane']")
	WebElement verifyFirstName;
	
	@FindBy(xpath = "//td[text()='Doe']")
	WebElement verifyLastName;
	
	@FindBy(xpath = "//td[text()='woodbridge']")
	WebElement verifyCity;
	
	@FindBy(xpath = "//td[text()='VA']")
	WebElement verifyState;
	
	public AddressesPage(){
		PageFactory.initElements(driver, this);
	}
	
	public void clickNewAddress() {
		click(newAddressButton);
	}
	
	public void enterFirstName(String firstName) {
		enter(firstNameField, firstName);
		
	}
	
	public void enterLastName(String lastname) {
		enter(lastNameField, lastname);
	}
	
	public void enterAddress1Field(String address1) {
		enter(address1Field, address1);
	}
	
	public void enterAddress2Field(String address2) {
		enter(address2Field, address2);
	}
	
	public void enterCityField(String city) {
		enter(cityField, city);
	}
	
	public void selectState(String methodName, String indexValueText) {
		selectFromDropdown(stateDropDown, methodName, indexValueText);
	}
	
	public void enterZipCode(String zipcode) {
		enter(zipcodeField, zipcode);
	}
	public void clickCountry() {
		click(usCountryRadio);
	}
	public void enterAge(String age) {
		enter(ageField, age);
	}
	public void enterWebsite(String webSite) {
		enter(webSiteField, webSite);
	}
	public void enterPhoneNumber(String phoneNumber) {
		enter(phoneNumberField, phoneNumber);
	}
	public void clickCommonInterest() {
		click(danceCheckBox);
	}
	 public void enterNotes(String note) {
		 enter(noteField, note);
	 }
	 public void clickCreateAddress() {
		 click(createAddressButton);
	 }
	 
	 public void clickEditButton() {
		 click(editButton);
	 }
	 
	 public void clickListButton() {
		 click(listButton);
	
	 }
	 
	 public String verifyFirstNameField() {
		 return getText(verifyFirstName);
	 }
	 
	 public String verifyLastNameField() {
		 return getText(verifyLastName);
	 }
	 
	 public String verifyCityField() {
		 return getText(verifyCity);
	 }
	 
	 public String verifyStateField() {
		 return getText(verifyState);
	 }
	
}
