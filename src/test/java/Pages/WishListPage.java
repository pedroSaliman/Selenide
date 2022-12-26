package Pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class WishListPage {
    private static final SelenideElement Quantity=$x("//input[@class='qty-input']");
    private static final SelenideElement Total=$x("//span[@class='product-subtotal']");
    private static final SelenideElement removeButton=$x("//button[@class='remove-btn']");
    private static final SelenideElement Message=$x("//div[@class='no-data']");
    private static final SelenideElement UpButton=$x("//button[@id='updatecart']");
    ///////////////////////////////////////
    public String TheTotal(){
        return Total.shouldBe(Condition.visible).text();
    }
    /////////////////////////////////
    public String finalMessage(){
        return Message.shouldBe(Condition.visible).text();
    }








    //////////////////

    public void wishUpdate(String NumberOfQuantity){
        Quantity.shouldBe(Condition.visible).clear();
        Quantity.shouldBe(Condition.visible).setValue(NumberOfQuantity);
        UpButton.shouldBe(Condition.visible).click();



    }
    ///////////////////////////////
    public void remove(){
        removeButton.shouldBe(Condition.visible).click();
    }
}
