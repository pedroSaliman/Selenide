package Pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class SearchPage {
    private static final SelenideElement productlink=$x("//h2[@class='product-title']//a[contains(text(),'Apple MacBook Pro 13-inch')]");
    private static final SelenideElement asusproductlink=$x("//h2[@class='product-title']//a[contains(text(),'Asus N551JK-XO076H Laptop')]");
    public ProductPage clicktoproductpage(){
        productlink.shouldBe(Condition.visible).click();
        return new ProductPage();
    }
    public ProductPage clickasus(){
        asusproductlink.shouldBe(Condition.visible).click();
        return new ProductPage();
    }
}
