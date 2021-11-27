package steps;

import base.BasePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class StepDefinitions
{
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

    //String AddtocartpageExpectedTitle = "nopCommerce demo store. Books";
    //String AddtocartpageActualTitle;



    //String FirstnameExperrormsg = "First name is required.";
    //String FistnameActerrormsg;
    //String LastnameExperrormsg = "Last name is required.";
    //String Lastnameacterrormsg;
    //String EmailExperrormsg = "Email is required.";
   // String EmailActerrormsg;
    //String PasswordExperrormsg = "Password is required.";
    //String PasswordActerrormsg;
   // String ConfPasswordExperrormsg = "Password is required.";
    //String ConPasswordActerrormsg;


    @Given("i navigate to url {string}")
    public void i_navigate_to_url(String url) {
        BasePage.driverUtils.navigateTourl(url);

    }

    @Then("i should nagvigate to homepage")
    public void i_should_nagvigate_to_homepage() {
        homePageActualTitle = BasePage.driverUtils.getpageTitle();
                Assertions.assertEquals(homePageExpectedTitle, homePageActualTitle);
    }

    @When("i click on login link from navigation bar")
    public void i_click_on_login_link_from_navigation_bar() {
        BasePage.homepage.clickLoginLink();


    }

    @Then("i should navigated to loginpage")
    public void i_should_navigated_to_loginpage() {
        loginPageActualTitle = BasePage.driverUtils.getpageTitle();
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


    @Given("i am on nopCommerce home page and verify page title and get page title")
    public void i_am_on_nop_commerce_home_page_and_verify_page_title_and_get_page_title()
    {
        BasePage.driverUtils.load();
        homePageActualTitle = BasePage.driverUtils.getpageTitle();
        Assertions.assertEquals(homePageExpectedTitle,homePageActualTitle);

    }
    @When("i click on register link from navigation bar and get page title")
    public void i_click_on_register_link_from_navigation_bar_and_get_page_title()
    {
        BasePage.homepage.clickRegisterLink();
        registerPageActualTitle = BasePage.driverUtils.getpageTitle();
        Assertions.assertEquals(registerPageExpectedTitle,registerPageActualTitle);
    }
    @When("i select gender as female")
    public void i_select_gender_as_female()
    {
        BasePage.registerPage.femaleRadioBtn();
    }
    @When("i enter firstname lastname email password confpasswod")
    public void i_enter_firstname_lastname_email_password_confpasswod(io.cucumber.datatable.DataTable dataTable)
    {
        BasePage.registerPage.enterfirstname(dataTable.cell(1,0));
        BasePage.registerPage.enterlastname(dataTable.cell(1,1));
        BasePage.registerPage.enteremail(dataTable.cell(1,2));
        BasePage.registerPage.enterpassword(dataTable.cell(1,3));
        BasePage.registerPage.enterCnfpassword(dataTable.cell(1,4));

    }
    @When("i enter date of birth")
    public void iEnterDateOfBirth()
    {
        BasePage.registerPage.selectDay();
        BasePage.registerPage.selectMonth();
        BasePage.registerPage.selectYear();
    }



    @Then("i should registered successfully")
    public void i_should_registered_successfully()
    {
        registerCnfMsgActualTitle = BasePage.registerPage.getRegistrationText();
        Assertions.assertEquals(registerCnfMsgExpectedTitle,registerCnfMsgActualTitle);
    }

    @Then("it should see  error messages for all mandatory field")
    public void itShouldSeeErrorMessagesForAllMandatoryField()
    {

    }

    @And("i click on Register button")
    public void iClickOnRegisterButton()
    {
        BasePage.registerPage.clickRegisterBtn();
    }
}
