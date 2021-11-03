package Constants;

import org.openqa.selenium.By;

public class TestConstants {
    public static String link = "https://www.lcwaikiki.com/tr-TR/TR";
    public static final By login =By.xpath("//span[text()='Giriş Yap']");
    public static final By EmailId=By.id("LoginEmail");
    public static final String EmailField="hsynkesmez@outlook.com";
    public static final By PasswordId=By.id("Password");
    public static final String PasswordField="Test1905";
    public static final By LoginId=By.id("loginLink");
    public static final By SearchClick=By.cssSelector("input.search-box__input");
    public static final By SearchId=By.id("search_input");
    public static final String SearchField="pantolon";
    public static final By FindButtonXpath=By.xpath("//button[text()='Ara']");
    public static final By SeeMore=By.xpath("//p[@class='lazy-load-text']");
    public static final By SelectProduct=By.cssSelector("div.picture-box");
    public static final By ProductPrice=By.xpath("/html/body/div[5]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div/div[2]/div/div/div/span[2]");
    public static final By SelectSize=By.xpath("//div[@class='mobile-size-and-cart-container']/div/div/div/div/div[3]/a");
    public static final By AddToBasketId=By.id("pd_add_to_cart");
    public static final By MyBasket=By.id("spanCart");
    public static final By NewProductPrice=By.xpath("//span[@class='rd-cart-item-price mb-15']");
    public static final By NumberOfProduct=By.xpath("//a[@class='oq-up plus']");
    public static final By Number=By.xpath("//*[@id=\"ShoppingCartContent\"]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div/div[1]/div/input");
    public static final By DeleteProduct=By.xpath("//a[@class='cart-square-link']");
    public static final By DeletePopup=By.id("Cart_ProductDelete_696213469");
    public static final By Basket=By.xpath("//p[@class='cart-empty-title']");
    public static final By basketDiscount=By.xpath("//*[@id=\"rightInfoBar\"]/div[1]/div/div[2]/div/div/div[2]/div[2]");

}
