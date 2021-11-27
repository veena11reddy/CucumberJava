Feature: Register new user


    Background: navigate to url and click on register link
    Given  i am on nopCommerce home page and verify page title and get page title
    When   i click on register link from navigation bar and get page title
  @regression
  Scenario: verify user registeration by entering data in all Mandatory field
    And    i select gender as female
    And    i enter firstname lastname email password confpasswod
      | firstname |  | lastname |  | email          |  | password   |  | confpassword |
      | Rose      |  | Mary     |  | abcd@gmail.com |  | 123testing |  | 123testing   |
    And    i enter date of birth
    And    i click on Register button
    Then   i should registered successfully
   @sanity
    Scenario: verify user registeration by not entering data in all Mandatory field
      And  i click on Register button
      Then  it should see  error messages for all mandatory field