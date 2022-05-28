Feature: As a valid user I should be able to open google

  Scenario: Open google and search item
  	Given I am on the Login page URL "https://www.google.co.in/"
    Then I enter search item as "facebook"
   