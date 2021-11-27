package basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath
{
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();


        driver.navigate().to("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();

        //driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("desktops");
        //driver.findElement(By.cssSelector("button.search-box-button")).click();
        //driver.findElement(By.cssSelector("input[name='q']")).sendKeys("notebooks");

        //driver.findElement(By.cssSelector(".answer:first-of-type")).click();
        driver.findElement(By.cssSelector(".answer:last-of-type")).click();
        driver.findElement(By.cssSelector(".answer:nth-of-type(3)")).click();

        //driver.findElement(By.xpath("//a[@class='ico-register']")).click();
        //driver.findElement(By.xpath("//input[@id='FirstName']")).click();

        driver.findElement(By.xpath("//h2[text()='Welcome to our store']")).click();

       // driver.findElement(By.xpath("//h2[contains(text(),'Welcome')]")).click();
       // driver.findElement(By.xpath("//input[contains(@id,'small-searchterms')]")).click();
        driver.findElement(By.xpath("(//button[text()='Add to cart'])[2]")).click();




//driver.quit();
    }


}
