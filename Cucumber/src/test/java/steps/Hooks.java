package steps;

import base.BasePage;
import io.cucumber.java.After;
import io.cucumber.java.Before;

import java.net.MalformedURLException;


public class Hooks
{
    @Before
    public void driverSetUp() throws MalformedURLException {
        BasePage.SetUp();
    }

    @After
    public void closeDriver()
    {
        BasePage.tearDown();
    }
}
