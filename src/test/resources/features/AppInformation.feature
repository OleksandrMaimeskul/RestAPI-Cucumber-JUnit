@regression
Feature: Testing general App Information

  Scenario Outline: Happy Path "App" End Point and Validate Response
    Then User validates '<message>', '<companyName>','<companyEmail>', and '<companyWebsite>' from App response Payload

    Examples:
      | message                               | companyName | companyEmail      | companyWebsite                 |
      | Application data fetched successfully | techtorial  | company@email.com | https://techtorialacademy.com |