package testcases;

import base.Basepage;
import org.junit.jupiter.api.Test;
import pageobjects.Homepage;

public class Searchproduct extends Basepage
{

    @Test
    public void searchproduct()
    {
        homepage.entersearchText(prop.getProperty("product1"));
        homepage.clicksearchButton();
    }

    }


