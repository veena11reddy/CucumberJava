package gettextandgettitle;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gettext1
{
    public static void main(String[] args)
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();

        String homepagetitle= driver.getTitle();
        System.out.println(homepagetitle);

        driver.findElement(By.linkText("Register")).click();

        String registerpagetitle = driver.getTitle();
        System.out.println(registerpagetitle);

        driver.findElement(By.name("register-button")).click();

        String firstnamerequired = driver.findElement(By.id("FirstName-error")).getText();
        System.out.println(firstnamerequired);
        String lastnameisrequried = driver.findElement(By.id("LastName-error")).getText();
        System.out.println(lastnameisrequried);
        String emailisrequried = driver.findElement(By.id("Email-error")).getText();
        System.out.println(emailisrequried);
        String passwordisrequired = driver.findElement(By.id("Password-error")).getText();
        System.out.println(passwordisrequired);
        String confirmpasswordisrequired = driver.findElement(By.id("ConfirmPassword-error")).getText();
        System.out.println(confirmpasswordisrequired);









       // driver.quit();

    }
}
