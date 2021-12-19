package Pages;

import Base.BasePage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;

import static Constants.Constants.*;

public class homepage extends BasePage {
    public homepage(WebDriver driver) {
        super(driver);
    }

    public homepage goToAmazon() {
        goUrl(URL);
        return this;
    }

    public homepage login() {
        click(LOGIN_BUTTON);
        sendKeys(E_MAIL, MY_MAIL_ADRESS);
        click(CONTINUE_BUTTON);
        sendKeys(PASSWORD, MY_PASSWORD);
        click(SUBMIT_BUTTON);
        return this;
    }

    public homepage searchProduct() {
        sendKeys(SEARCH_AREA, PRODUCT_NAME);
        click(SEARCH_BUTTON);
        return this;
    }

    public homepage randomProductSelect() {
        List<WebElement> links = listElements(PRODUCT_LIST);
        int number = new Random().nextInt(links.size());
        String productName = links.get(number).getText();
        links.get(number).click();
        String productDetailName = findElement(DETAIL_NAME).getText();
        Assert.assertEquals(productName, productDetailName);
        return this;
    }
    public homepage goToBasket() {
        String productPrice = findElement(PRODUCT_PRICE).getText();
        click(ADD_TO_CART);
        click(GO_TO_BASKET);
        String cartPrice =findElement(CART_PRICE).getText();
        Assert.assertEquals(productPrice, cartPrice.replace(" ",""));
        return this;
    }

}