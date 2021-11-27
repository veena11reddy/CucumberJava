package assignment;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class searchbuttonalert
{
    public static void main(String[] args)
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        driver.findElement(By.className("search-box-button")).click();


        WebDriverWait wait = new WebDriverWait(driver,30);
       wait.until(ExpectedConditions.elementToBeClickable(By.className("search-box-button")));
        String search = driver.switchTo().alert().getText();
        System.out.println("search button:" + search);
        driver.switchTo().alert().accept();







        //driver.quit();
    }
}
