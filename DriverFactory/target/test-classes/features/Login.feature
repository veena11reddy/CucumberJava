Feature: Login To nop commerce
@ui @smoke
  Scenario: verify login with valid credentials
    Given    i navigate to url "https://demo.nopcommerce.com/"
    Then      i should nagvigate to homepage
    When      i click on login link from navigation bar
    Then       i should navigated to loginpage
    When     i enter email as "abcd@gmail.com"
    And      i enter password as "testing123"
    And      i click on login button
    Then     i should be logged in successfully

