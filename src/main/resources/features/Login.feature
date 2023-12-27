Feature: Admin Login
#scenario = test case
  Scenario: Admin Login Valid
    Given Admin enter url web SwagLabs
    When Admin enter username
    And Admin enter password
    And Admin click login button
    Then Admin login successful redirect page product

  Scenario: Admin Login Invalid with Wrong username
    Given Admin enter url web SwagLabs or Admin logout
    When Admin enter wrong username
    And Admin enter password
    And Admin click login button
    Then Admin invalid login
    