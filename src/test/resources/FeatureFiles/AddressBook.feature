Feature: AddressBook feature pages

  Scenario: User is able to login in with Credentials
    Given User is on Sign in on page
    When User Enters Username and Password
    And User is able to click Sign On Button
    And User is able to click New Address Button
    And User is able to enter to address Information
    Then User is able to Click create address button
  
