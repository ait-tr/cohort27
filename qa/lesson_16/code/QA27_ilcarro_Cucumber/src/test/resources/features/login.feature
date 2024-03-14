Feature: Login

  @validData
  Scenario: User can log in with valid data
    Given User launches Chrome Browser
    When User opens ilcarro Home Page
    And User clicks on the Log in Link
    And User enter valid data
    And User clicks on the Yalla button
    Then User verifies Success message is displayed
    And User quites browser

  @invalidPassword
  Scenario Outline: User can't log in with valid email and invalid password
    Given User launches Chrome Browser
    When User opens ilcarro Home Page
    And User clicks on the Log in Link
    And User enter valid email and invalid password
      | email   | password   |
      | <email> | <password> |
    And User clicks on the Yalla button
    Then User verifies Error message is displayed
    And User quites browser
    Examples:
      | email           | password    |
      | neuer@gmail.com | Neuer123455 |
      | neuer@gmail.com | neuer12345$ |
      | neuer@gmail.com | NEUER12345$ |
      | neuer@gmail.com | NEUERneuer$ |
      | neuer@gmail.com | 1234567899$ |
      | neuer@gmail.com | @#$$$$$$$$$ |
