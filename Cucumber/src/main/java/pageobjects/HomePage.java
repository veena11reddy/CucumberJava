package pageobjects;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage
{
    WebDriver driver;
    //locators
   @FindBy(linkText="Books") public WebElement BookLink;
   @FindBy(linkText ="Register") public WebElement RegisterLink;
    @FindBy(linkText = "Log in") public WebElement LoginLink;
    @FindBy(id="small-searchterms") public WebElement searchTextBox;
    @FindBy(className="search-box-button") public WebElement searchButton;
    @FindBy(id="register-button") public WebElement Registerbtn;





    //Constructor
    public HomePage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);

    }

    //Actions

    public void clickBookLink()
    {
        BookLink.click();
    }





    public void clickRegisterLink()
    {
     RegisterLink.click();
    }




    public void clickLoginLink()
    {
        LoginLink.click();
    }
    public void entersearchText(String search)
    {
        searchTextBox.sendKeys(search);
    }
    public void clicksearchButton()
    {
        searchButton.click();
    }

    public void  clickRegisterbtn()
    {
        Registerbtn.click();
    }

}



