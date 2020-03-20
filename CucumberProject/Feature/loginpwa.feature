#Author: your.email@your.domain.com
#Keywords Summary :

@tag
Feature: Login Test for PWA "m.communitymatrimony.com"
 

  @tag1
  Scenario: Login PWA in Chrome mobile browser
    Given Setup the capabilities for chrome browser
    And User entet the URL "m.communitymatrimony.com"
    When User enter the Matri Id and Password and click login
    And Verifying the user was successully logged in
    And User handles the intermediate pages if present
    Then User logging out of the website
    And User successfully logged out
