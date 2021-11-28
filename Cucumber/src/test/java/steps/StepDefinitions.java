package steps;

import base.BasePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageobjects.HomePage;

public class StepDefinitions {
    String homePageExpectedTitle = "nopCommerce demo store";
    String homePageActualTitle;

    String homepageExpectedTitle = "nopCommerce demo store. Search";
    String homepageActualTitle;

    String loginPageExpectedTitle = "nopCommerce demo store. Login";
    String loginPageActualTitle;

    String registerPageExpectedTitle = "nopCommerce demo store. Register";
    String registerPageActualTitle;

    String registerCnfMsgExpectedTitle = "Your registration completed";
    String registerCnfMsgActualTitle;

    String AddtocartpageExpectedTitle = "nopCommerce demo store. Books";
    String AddtocartpageActualTitle;



    String FirstnameExperrormsg = "First name is required.";
    String FistnameActerrormsg;
    String LastnameExperrormsg = "Last name is required.";
    String Lastnameacterrormsg;
    String EmailExperrormsg = "Email is required.";
    String EmailActerrormsg;
    String PasswordExperrormsg = "Password is required.";
    String PasswordActerrormsg;
    String ConfPasswordExperrormsg = "Password is required.";
    String ConPasswordActerrormsg;


    @Given("i navigate to url {string}")
    public void i_navigate_to_url(String url) {
        BasePage.navigateTourl(url);

    }

    @Then("i should nagvigate to homepage")
    public void i_should_nagvigate_to_homepage() {
        homePageActualTitle = BasePage.getageTitle();
        Assertions.assertEquals(homePageExpectedTitle,homePageActualTitle);
    }

    @When("i click on login link from navigation bar")
    public void i_click_on_login_link_from_navigation_bar() {
        BasePage.homepage.clickLoginLink();


    }

    @Then("i should navigated to loginpage")
    public void i_should_navigated_to_loginpage() {
        loginPageActualTitle = BasePage.getageTitle();
        Assertions.assertEquals(loginPageExpectedTitle, loginPageActualTitle);

    }

    @When("i enter email as {string}")
    public void i_enter_email_as(String email) {
        BasePage.loginpage.enteremailText(email);

    }

    @When("i enter password as {string}")
    public void i_enter_password_as(String password) {
        BasePage.loginpage.passwordTextBox(password);

    }

    @When("i click on login button")
    public void i_click_on_login_button() {
        BasePage.loginpage.clicklogin();

    }

    @Then("i should be logged in successfully")
    public void i_should_be_logged_in_successfully() {

    }

    @When("i click on register link from navigation bar")
    public void i_click_on_register_link_from_navigation_bar() {
        BasePage.homepage.clickRegisterLink();
    }

    @Then("i should navigated to register page")
    public void i_should_navigated_to_register_page() {
        registerPageActualTitle = BasePage.registerPage.getPageTitle();
        Assertions.assertEquals(registerPageExpectedTitle, registerPageActualTitle);
    }

    @When("i click on Register button")
    public void i_click_on_register_button() {
        BasePage.homepage.clickRegisterbtn();

    }

    @Then("it should show error message on mandatoryfield")
    public void it_should_show_error_message_on_mandatoryfield() {
        FistnameActerrormsg = BasePage.registerPage.getFirstnameerrormsg();
        Assertions.assertEquals(FirstnameExperrormsg, FistnameActerrormsg);
        Lastnameacterrormsg = BasePage.registerPage.getLastnameerrormsg();
        Assertions.assertEquals(LastnameExperrormsg, Lastnameacterrormsg);
        PasswordActerrormsg = BasePage.registerPage.getPassworderrormsg();
        Assertions.assertEquals(PasswordExperrormsg, PasswordActerrormsg);
        ConPasswordActerrormsg = BasePage.registerPage.getCnfPasswordmsg();
        Assertions.assertEquals(ConfPasswordExperrormsg, ConPasswordActerrormsg);
    }


    @When("i enter in searchtextbox as {string}")
    public void i_enter_in_searchtextbox_as(String search)
    {
      BasePage.homepage.entersearchText(search);
    }

    @When("i click on search button")
    public void i_click_on_search_button()
    {
     BasePage.homepage.clicksearchButton();
    }

    @Then("the page should open successfully")
    public void the_page_should_open_successfully()
    {
      homePageActualTitle   = BasePage.getageTitle();
      Assertions.assertEquals(homePageExpectedTitle,homePageActualTitle);

    }


    @When("i search for Books")
    public void i_search_for_books()
    {
     BasePage.homepage.clickBookLink();

    }

    //@When("i open book {string}")
    //public void i_open_book()
    //{
     //BasePage.addtocartPage.clickproducttitle();
    //}

    @When("i add the book to AddToCart")
    public void i_add_the_book_to_add_to_cart()
    {
     BasePage.addtocartPage.clickaddtocartbtn();
    }

    @Then("i should see the book in shopping cart")
    public void i_should_see_the_book_in_shopping_cart()
    {
     AddtocartpageActualTitle = BasePage.addtocartPage.shoppingcartpagetitle();
     Assertions.assertEquals(AddtocartpageExpectedTitle,AddtocartpageActualTitle);
    }

    @And("i click on book as {string}")
    public void iClickOnBookAs()
    {
        BasePage.addtocartPage.clickbookb();
    }



    @Given("i am on nopCommerce home page and verify page title and get page title")
    public void i_am_on_nop_commerce_home_page_and_verify_page_title_and_get_page_title()
    {
        BasePage.load();

        homePageActualTitle   = BasePage.getageTitle();
        Assertions.assertEquals(homePageExpectedTitle,homePageActualTitle);

    }
    @When("i click on register link from navigation bar and get page title")
    public void i_click_on_register_link_from_navigation_bar_and_get_page_title()
    {
     BasePage.homepage.clickRegisterLink();
     registerPageActualTitle = BasePage.registerPage.getPageTitle();
     Assertions.assertEquals(registerPageExpectedTitle,registerPageActualTitle);
    }
    @When("i select gender as female")
    public void i_select_gender_as_female()
    {
      BasePage.registernewuserPage.femaleRadioBtn();
    }
    @When("i enter firstname lastname email password confpasswod")
    public void i_enter_firstname_lastname_email_password_confpasswod(io.cucumber.datatable.DataTable dataTable)
    {
     BasePage.registernewuserPage.enterfirstname(dataTable.cell(1,0));
     BasePage.registernewuserPage.enterlastname(dataTable.cell(1,1));
     BasePage.registernewuserPage.enteremail(dataTable.cell(1,2));
     BasePage.registernewuserPage.enterpassword(dataTable.cell(1,3));
     BasePage.registernewuserPage.enterCnfpassword(dataTable.cell(1,4));

    }
    @When("i enter date of birth")
    public void iEnterDateOfBirth()
    {
        BasePage.registernewuserPage.selectDay();
        BasePage.registernewuserPage.selectMonth();
        BasePage.registernewuserPage.selectYear();
    }


   //  BasePage.registernewuserPage.clickRegisterBtn();
        @Then("i should registered successfully")
    public void i_should_registered_successfully()
    {
        registerCnfMsgActualTitle = BasePage.registernewuserPage.getRegistrationText();
        Assertions.assertEquals(registerCnfMsgExpectedTitle,registerCnfMsgActualTitle);
    }

    @Then("it should see  error messages for all mandatory field")
    public void itShouldSeeErrorMessagesForAllMandatoryField()
    {

   }
}




