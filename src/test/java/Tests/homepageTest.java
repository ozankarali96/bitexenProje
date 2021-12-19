package Tests;

import Base.BaseTest;
import Pages.homepage;
import org.junit.Before;
import org.junit.Test;

public class homepageTest extends BaseTest{
    Pages.homepage homepage;
    @Before
    public void beforeTest() { homepage = new homepage(getDriver());
    }
    @Test
    public void amazonTest(){
        homepage.goToAmazon().login().searchProduct().randomProductSelect().goToBasket();
    }
}