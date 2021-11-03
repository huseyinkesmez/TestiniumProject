package Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;


public class BasePage {
    public WebDriver webDriver=null;

    public BasePage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }
    public WebElement findElement(By by){
        return webDriver.findElement(by);
    }
    public List<WebElement> findElements(By by){
        return webDriver.findElements(by);
    }
    public void sendKeys(By by,String text){
        findElement(by).sendKeys(text);
    }
    public void click(By by){
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        findElement(by).click();
    }
    public String getText(By by){
        return findElement(by).getText();
    }
    public String getAttribute(By by,String value){
        return findElement(by).getAttribute(value);
    }
    public WebElement findElementWithWait(By by, int second){
        webDriver.manage().timeouts().implicitlyWait(second, TimeUnit.SECONDS);
        return webDriver.findElement(by);
    }
}
