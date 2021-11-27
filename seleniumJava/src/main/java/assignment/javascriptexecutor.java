package assignment;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascriptexecutor
{
    public static void main(String[] args)
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();

        String homepagetitle = driver.getTitle();
        System.out.println(homepagetitle);

       // driver.findElement(By.linkText("Log in")).click();

       // String loginpagetitle = driver.getTitle();
        //System.out.println(loginpagetitle);

        JavascriptExecutor js = (JavascriptExecutor)driver;

        //js.executeScript("document.getElementById('Email').setAttribute('value','abcd@gmail.com')");
       // js.executeScript("document.getElementById('Password').setAttribute('value','asdfgh')");
        //js.executeScript("arguments[0].click();",driver.findElement(By.className("login-button")));
        //String errormsg = driver.findElement(By.className("validation-summary-errors")).getText();
        //System.out.println(errormsg);

       js.executeScript("document.getElementById('small-searchterms').setAttribute('value','Desktop')");
       js.executeScript("arguments[0].click();",driver.findElement(By.className("search-box-button")));


       //driver.quit();

    }
}
