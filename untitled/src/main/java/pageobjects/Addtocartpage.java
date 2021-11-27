package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Addtocartpage
{
    WebDriver driver;
    //locators
    @FindBy(id="small-searchterms") public WebElement searchTextBox;
    @FindBy(className = "search-box-button") public WebElement searchButton;

    @FindBy(linkText="Computers ") public WebElement computersLink;
    @FindBy(linkText="Desktops ") public WebElement desktopsLink;

    @FindBy(className="Add to cart") public WebElement addtocartButton;



    //Constructor
    public Addtocartpage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);

    }

    public void entersearchText(String product)
    {
        searchTextBox.sendKeys(product);
    }
    public void clicksearchButton()
    {
        searchButton.click();
    }



    public void clickdestopsLink()
    {
        desktopsLink.click();
    }



    public void addtocartButton()
    {
        addtocartButton.click();
    }


}
