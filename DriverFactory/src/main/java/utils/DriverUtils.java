package utils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DriverUtils
{
    public static void navigateTourl(String url)
    {
        DriverFactory.driver.navigate().to(url);
    }
    public static String getpageTitle()
    {
        return DriverFactory.driver.getTitle();
    }

    public static void load()
    {
        DriverFactory.driver.navigate().to(DriverFactory.prop.getProperty("url"));
    }
    public static void selectByVisibleText(WebElement ele, String text)
    {
        Select select = new Select(ele);
        select.selectByVisibleText(text);

    }

}
