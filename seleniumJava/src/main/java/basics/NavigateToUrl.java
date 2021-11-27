package basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateToUrl
{
    public static void main(String[] args)
        {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();


        driver.navigate().to("https://demo.nopcommerce.com/");
        //driver.navigate().refresh();
            driver.manage().window().maximize();



            driver.quit();

    }
}
