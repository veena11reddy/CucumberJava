package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddtocartPage
{
    WebDriver driver;
    //locators
   // @FindBy(linkText="Books ") public WebElement BookLink;
    @FindBy(xpath="//h1[text()='First Prize Pies']") public WebElement booktitle;
    @FindBy(className="add-to-cart-button") public WebElement addtocartbtn;
    @FindBy(className="Shopping cart") public WebElement shoppingcart;


    //Constructor
    public AddtocartPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);

    }

    //Actions
   //public void clickBookLink()
    //{
    //    BookLink.click();
   // }

    public void clickbookb()
    {
        clickbookb();
    }

    public void clickaddtocartbtn()
    {
        addtocartbtn.click();
    }
    public void shoppingcart()
    {
        shoppingcart.getText();
    }
    public String shoppingcartpagetitle()
    {
       return shoppingcartpagetitle();
    }

}
