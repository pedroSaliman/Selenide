package Pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class ProductPage {
    private static final SelenideElement Result=$x("//h1[normalize-space()='Apple MacBook Pro 13-inch']");
    private static final SelenideElement AddToWish=$x("//button[text()='Add to wishlist' and @data-productid ='4']");
    private static final SelenideElement alertwish=$x("//a[normalize-space()='wishlist']");
    private static final SelenideElement TextOfCurrency=$x("//span[text()=' €1548.00 ']");
    private static final SelenideElement compareLink=$("div[class='compare-products'] button[type='button']");
    private static final SelenideElement AlertCompare=$x("//a[normalize-space()='product comparison']");

    public ComparePage CompareProduct(){
        compareLink.shouldBe(Condition.visible).click();
        AlertCompare.shouldBe(Condition.visible).click();
        return new ComparePage();
    }


    public String Price(){
        return TextOfCurrency.shouldBe(Condition.visible).text();
    }


    public String message(){
    return Result.shouldBe(Condition.visible).text();
}
public WishListPage clicktowish(){
        AddToWish.shouldBe(Condition.visible).click();
        alertwish.shouldBe(Condition.visible).click();
        return new WishListPage();
}

}
