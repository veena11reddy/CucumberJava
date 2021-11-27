Feature: Register To nop commerce

  Scenario:  verify Register with invalid credentials
    Given i navigate to url "https://demo.nopcommerce.com/"
    Then  i should nagvigate to homepage
    When  i click on register link from navigation bar
    Then  i should navigated to register page
    When  i click on Register button
    Then  it should show error message on mandatoryfield