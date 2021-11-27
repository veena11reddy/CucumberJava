package gettextandgettitle;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gettitle
{
    public static void main(String[] args)
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();

        String homepagetilte = driver.getTitle();
        System.out.println(homepagetilte);

        driver.findElement(By.linkText("Log in")).click();

        String loginpagettitle = driver.getTitle();
        System.out.println("loginpagettitle");

    }
}
