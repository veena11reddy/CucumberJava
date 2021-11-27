package basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class csselector
    {
        public static void main(String[] args)
        {
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();

            driver.navigate().to("https://demo.nopcommerce.com/");
            driver.manage().window().maximize();
           //driver.findElement(By.id("small-searchterms")).sendKeys("windows");
            //driver.findElement(By.className("html-login-page")).click();
            driver.findElement(By.linkText("Register")).click();
           //driver.findElement(By.partialLinkText("Digital")).click();

           // driver.findElement(By.name("Email")).sendKeys("abc@gmail.com");

           // driver.quit();
        }

}
