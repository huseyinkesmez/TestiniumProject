package Page;

import Base.BasePage;
import Constants.TestConstants;
import io.cucumber.core.gherkin.Example;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import static org.junit.Assert.assertEquals;

public class LcWaikikiPage extends BasePage {
    JavascriptExecutor jse = (JavascriptExecutor)webDriver;
    String productPrice;
    static Logger log = Logger.getLogger(Example.class.getName());

    public LcWaikikiPage(WebDriver webDriver) {
        super(webDriver);
    }

    public LcWaikikiPage checkHomePage(){
        //Opening the home page
        assertEquals(TestConstants.link, "https://www.lcwaikiki.com/tr-TR/TR");
        return this;
    }
    public LcWaikikiPage openLoginPage(){
        //For go to the login page
        click(TestConstants.login);
        return this;
    }
    public LcWaikikiPage login(){
        //For the login account
        findElementWithWait(TestConstants.EmailId,20).sendKeys(TestConstants.EmailField);
        findElementWithWait(TestConstants.PasswordId,20).sendKeys(TestConstants.PasswordField);
        findElementWithWait(TestConstants.LoginId,20).click();
        return this;
    }
    public LcWaikikiPage checkPageTitle(){
        //For check that  is logged in
        boolean result = webDriver.getTitle().contains("LC Waikiki");
        Assert.assertTrue(result);
        return this;
    }
    public LcWaikikiPage search(){
        //That's for search to "pantolon" keyword in search bar
        click(TestConstants.SearchId);
        findElement(TestConstants.SearchId).sendKeys(TestConstants.SearchField);
        click(TestConstants.FindButtonXpath);
        return this;
    }
    public LcWaikikiPage seeMore(){
        //For the click the see more button on the search results page.

        jse.executeScript("window.scrollBy(0,7000)");
        findElement(TestConstants.SeeMore);
        return this;
    }
    public LcWaikikiPage checkSeeMore(){
        // Check if it has loaded the next page
        boolean result =webDriver.getTitle().contains("Pantolon");
        Assert.assertTrue(result);
        return this;
    }
    public LcWaikikiPage selectRandomProduct(){
        //Random Item is selected.
        List<WebElement> allProducts = findElements(TestConstants.SelectProduct);
        Random rand = new Random();
        int randomProduct = rand.nextInt(allProducts.size());
        allProducts.get(randomProduct).click();
        return this;
    }
    public LcWaikikiPage beforeBasketPrice(){
        //Amount before adding to basket
        productPrice =  getText(TestConstants.ProductPrice);
        return this;
    }
    public LcWaikikiPage randomSize(){
        //Choosing randomly size
        List<WebElement> allSize = findElements(TestConstants.SelectSize);
        Random random = new Random();
        int randomSize = random.nextInt(allSize.size());
        jse.executeScript("window.scroll(0,150)");
        allSize.get(randomSize).click();
        return this;
    }
    public LcWaikikiPage addBasket(){
        //Adding item to basket
        jse.executeScript("window.scroll(0,250)");
        click(TestConstants.AddToBasketId);
        return this;
    }
    public LcWaikikiPage goBasket(){
        //Go to basket cart
        click(TestConstants.MyBasket);
        return this;
    }
    /*public LcWaikikiPage checkAmount(){
        String newPrice= getText(TestConstants.NewProductPrice);
        log.info("Ürün fiyatı:"+productPrice);
        log.info("Sepet fiyatı:"+newPrice);
        assertEquals(productPrice, newPrice);
        return this;
    }*/
    public LcWaikikiPage addProduct(){
        //Increasing the number of items
        click(TestConstants.NumberOfProduct);
        return this;
    }
    public LcWaikikiPage checkProductCount(){
        //for the check if there are two item in the basket cart
        String number = getAttribute(TestConstants.Number,"value");
        assertEquals("2",number);
        return this;
    }

    public LcWaikikiPage deleteProduct(){
        //For the remove all items from cart
        //webDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        click(TestConstants.DeleteProduct);
        return this;
    }
    public LcWaikikiPage clickPopup() {
        //For delete the pop up
        webDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        click(TestConstants.DeletePopup);
        return this;
    }
    public LcWaikikiPage checkBasket() {
        //Check if the basket is empty
        webDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        String basket= getText(TestConstants.Basket);
        log.info(basket);
        return this;
    }
}
