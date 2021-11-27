Feature: Login To nop commerce
@ui,@sanity
  Scenario Outline: verify login with valid credentials
    Given i navigate to url "https://demo.nopcommerce.com/"
    Then  i should nagvigate to homepage
    When  i click on login link from navigation bar
    Then  i should navigated to loginpage
    When  i enter email as "<email>"
    And   i enter password as "<password>"
    And  i click on login button
    Then i should be logged in successfully

    Examples:
      | email          | password   |
      | abcd1@gmail.com | testing123 |
      | abcd2@gmail.com | testing123 |
      | abcd3@gmail.com | testing123 |

