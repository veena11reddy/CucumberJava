package assignment;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class frame
{
    public static void main(String[] args)
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("http://the-internet.herokuapp.com/");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Frames")).click();
        driver.findElement(By.linkText("iFrame")).click();
        int framecount = driver.findElements(By.tagName("iframe")).size();
        System.out.println("Number of frames:" + framecount);
        driver.switchTo().frame("mce_0_ifr");
       String text1 = driver.findElement(By.xpath("//p[contains(text(),'Your content')]")).getText();
        System.out.println("text inside the frame is:" + text1);
        driver.switchTo().defaultContent();
       String text2 = driver.findElement(By.xpath("//h3[contains(text(),'An iFrame')]")).getText();
        System.out.println("text outside the frame:" + text2);




        //driver.quit();

    }
}
