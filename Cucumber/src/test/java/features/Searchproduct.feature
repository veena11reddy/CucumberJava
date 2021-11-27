Feature: Searchproduct To nop commerce
  @ui,@regression
  Scenario: verify Searchproduct with valid credentials
    Given i navigate to url "https://demo.nopcommerce.com/"
    Then  i should nagvigate to homepage
    When  i enter in searchtextbox as "Desktops"
    And   i click on search button
    Then  the page should open successfully