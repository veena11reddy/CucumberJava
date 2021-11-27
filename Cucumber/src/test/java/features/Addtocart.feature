Feature: AddToCart To nop commerce
  
  Scenario: verify Addtocart with valid credentials
    Given i navigate to url "https://demo.nopcommerce.com/"
    Then  i should nagvigate to homepage
    When  i search for Books
    And   i click on book as First Prize Pies
    And   i add the book to AddToCart
    Then  i should see the book in shopping cart