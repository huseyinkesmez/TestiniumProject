package Test;

import Base.BaseTest;
import Page.LcWaikikiPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestiniumTest extends BaseTest {
    LcWaikikiPage lcWaikikiPage;
    @Before
    public void before(){
        lcWaikikiPage=new LcWaikikiPage(getWebDriver());
    }
    @Test
    public void test(){
        lcWaikikiPage.checkHomePage().openLoginPage().login().checkPageTitle().search().seeMore().checkSeeMore().selectRandomProduct().beforeBasketPrice().randomSize().addBasket().goBasket()/*.checkAmount()*/.addProduct().checkProductCount().deleteProduct().clickPopup().checkBasket();
    }
    @After
    public void after(){
        tearDown();
    }
}
