package testcases;

import base.Basepage;
import org.junit.jupiter.api.Test;

public class Addtocart extends Basepage
{
    @Test

    public void addtocart()
    {
        addtocart.entersearchText(prop.getProperty("product1"));
        addtocart.clicksearchButton();

        addtocart.clickdestopsLink();
        addtocart.addtocartButton();
    }
}
