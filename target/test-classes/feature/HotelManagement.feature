@hotelManagementTest
Feature: As an admin User I want to create a single and Multiple Entry and delete all entry test

  Background:
    Given I am on the Homepage
    When I log in to the platform


  @createSingleEntry
  Scenario Outline: I want to create and delete entries
    And I enter "<hotelName>" in the hotel name field
    And I enter  "<address>" in the address field
    And I enter "<owner>" in the owners field
    And I enter "<phoneNo>" in the phone number field
    And I enter "<email>" in the email field
    And I click create button
    And I log out successfully

    Examples:
      | hotelName    | address   | owner  | phoneNo     | email          |
      | Hilton Hotel | London UK | George | 07909000943 | test@email.com |


  @createMultipleEntries
  Scenario Outline: I want to create and delete entries
    And I enter "<hotelName>" in the hotel name field
    And I enter  "<address>" in the address field
    And I enter "<owner>" in the owners field
    And I enter "<phoneNo>" in the phone number field
    And I enter "<email>" in the email field
    And I click create button
    And I log out successfully

    Examples:
      | hotelName       | address   | owner  | phoneNo     | email           |
      | Hilton Hotel2   | London UK | George | 07909000943 | test@email.com  |
      | Sheraton Hotel  | Kent UK   | Tester | 07909090009 | ester@email.com |
      | Sheraton Hotel2 | Kent UK   | Tester | 07909090009 | ester@email.com |
      | Sheraton Hotel3 | Kent UK   | Tester | 07909090009 | ester@email.com |


  @deleteEntries
  Scenario: I should be able o delete existing entries
    And click should be able to delete multiple entrie