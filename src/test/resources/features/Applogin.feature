
Feature: Testing  App Login End Point

  Scenario Outline: Happy Path App "Login" end point and validate response
    Then User validate the '<message>' from login end-point response
    Examples:
      | message                |
      | Logged in successfully |

  Scenario Outline: Negative "Login" end point and validate responses
    Then User validates '<email>','<password>' and '<message>' from end point response
    Examples:
      | email                          | password  | message                    |
      | dev_techtorial@example.com     | 12345678  | Wrong credentials provided |
      | dev_techtorddial@example.com   | 12345678  | Wrong credentials provided |
      | dev_techtsdsdorial@example.com | 123456789 | Wrong credentials provided |
