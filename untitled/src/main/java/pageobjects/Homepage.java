package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage
{
    WebDriver driver;
    //locators
    @FindBy(id="small-searchterms") public WebElement searchTextBox;
    @FindBy(className = "search-box-button") public WebElement searchButton;





    //Constructor
    public Homepage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);

    }

    //Actions
    public void entersearchText(String product)
    {
        searchTextBox.sendKeys(product);
    }
    public void clicksearchButton()
    {
        searchButton.click();
    }

    }


