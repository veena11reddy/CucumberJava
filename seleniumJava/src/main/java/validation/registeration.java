package validation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class registeration
{
    public static void main(String[] args)
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();

        String homepagetitle = driver.getTitle();
        System.out.println(homepagetitle);

        driver.findElement(By.linkText("Register")).click();
        String registerpagetitle = driver.getTitle();
        System.out.println(registerpagetitle);

        driver.findElement(By.id("gender-female")).click();
        boolean femaleradiobutn = driver.findElement(By.id("gender-female")).isSelected();
        System.out.println("female radiobutton is selected:" + femaleradiobutn);

       driver.findElement(By.id("FirstName")).sendKeys("Rose");

        driver.findElement(By.id("LastName")).sendKeys("Mary");


        Select day = new Select(driver.findElement(By.name("DateOfBirthDay")));
        day.selectByVisibleText("4");
        boolean day4 = driver.findElement(By.xpath("//option[@value='4']")).isSelected();
         System.out.println("day 4 is selected:" + day4);

        Select month = new Select(driver.findElement(By.name("DateOfBirthMonth")));
        month.selectByVisibleText("January");
        //String month1 = driver.findElement(By.name("DateOfBirthMonth")).isSelected();
        //System.out.println("month 1 is selected:" + month1);
       //boolean monthselected = driver.findElement(By.xpath("//option[@value='1'])[2]")).isSelected();
       //System.out.println("monthselected is January:" + monthselected);

        Select year = new Select(driver.findElement(By.name("DateOfBirthYear")));
        year.selectByVisibleText("1985");
        boolean year85 = driver.findElement(By.xpath("//option[@value='1985']")).isSelected();
        System.out.println("year1985 is selected:" + year85);

       driver.findElement(By.id("Email")).sendKeys("abcde@gmail.com");
        System.out.println("abcde@gmail.com");
        driver.findElement(By.id("Company")).sendKeys("MNS IT solutions");
        System.out.println("MNS IT solutions");

        boolean newsletterbox = driver.findElement(By.id("Newsletter")).isSelected();
        System.out.println("newsletterbox is selected:" + newsletterbox);

        driver.findElement(By.id("Password")).sendKeys("abcdeg");
        System.out.println("abcdeg");
        driver.findElement(By.id("ConfirmPassword")).sendKeys("abcdeg");
        System.out.println("abcdeg");
        driver.findElement(By.id("register-button")).click();

         //String attr = driver.findElement(By.id("register-button")).getAttribute("id");
        //System.out.println(attr);
       String regcomplete = driver.findElement(By.className("result")).getText();
        System.out.println("regcompleted");













    }
}
