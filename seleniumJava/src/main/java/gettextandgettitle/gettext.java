package gettextandgettitle;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gettext
{
    public static void main(String[] args)
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();

        String registerlinktext= driver.findElement(By.linkText("Register")).getText();
        System.out.println(registerlinktext);


       String onlineshopping = driver.findElement(By.xpath("//p[contains(text(),'Online shopping')]")).getText();
        System.out.println(onlineshopping);








       // driver.quit();

    }
}
