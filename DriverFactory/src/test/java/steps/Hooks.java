package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utils.DriverFactory;

public class Hooks
{
    @Before
    public void setUp()
    {
        DriverFactory.getDriver();
    }
     @After
    public void tearDown(Scenario scenario)
    {
        if(scenario.isFailed())
        {
            final byte[] screenshot = ((TakesScreenshot)DriverFactory.driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png","screenshot");
        }
       DriverFactory.closeDriver();
    }

}
