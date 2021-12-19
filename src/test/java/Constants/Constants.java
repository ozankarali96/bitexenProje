package Constants;

import org.openqa.selenium.By;

public class Constants {
    public static final String URL = "https://www.amazon.com.tr";
    public static final By LOGIN_BUTTON = By.id("nav-link-accountList-nav-line-1");
    public static final By E_MAIL = By.id("ap_email");
    public static final String MY_MAIL_ADRESS = "ozankarali96@gmail.com";
    public static final By CONTINUE_BUTTON = By.id("continue");
    public static final By PASSWORD = By.id("ap_password");
    public static final String MY_PASSWORD = "Ozan1996.";
    public static final By SUBMIT_BUTTON = By.id("signInSubmit");
    public static final By SEARCH_AREA = By.id("twotabsearchtextbox");
    public static final String PRODUCT_NAME = "Bulaşık Tableti";
    public static final By SEARCH_BUTTON = By.id("nav-search-submit-button");
    public static final By PRODUCT_LIST = By.xpath("//span[@class='a-size-base-plus a-color-base a-text-normal']");
    public static final By DETAIL_NAME = By.id("productTitle");
    public static final By PRODUCT_PRICE = By.xpath("//span[@class='a-price a-text-price a-size-medium']//span[@aria-hidden='true']");
    public static final By ADD_TO_CART = By.id("add-to-cart-button");
    public static final By GO_TO_BASKET = By.id("hlb-view-cart-announce");
    public static final By CART_PRICE = By.xpath("//span[@class='a-size-medium a-color-base sc-price sc-white-space-nowrap sc-product-price a-text-bold']");




















}
