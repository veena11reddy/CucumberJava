package assignment;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login
{
    public static void main(String[] args)
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Log in")).click();
       String loginpagetitle = driver.getTitle();
        System.out.println("login pagetitle");
        driver.findElement(By.id("Email")).sendKeys("sam123@gmail.com");
        System.out.println("sam123@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("abc123");
        System.out.println("abc123");
       boolean checkbox = driver.findElement(By.id("RememberMe")).isSelected();
        System.out.println("checkbox is selected:" + checkbox);

    }

}
