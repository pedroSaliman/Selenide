package Pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class ComparePage {
    private static final SelenideElement Clear=$x("//a[normalize-space()='Clear list']");
    private static final SelenideElement Message=$x("//div[@class='no-data']");
    public String Text(){
        return Message.shouldBe(Condition.visible).text();
    }

    public void RemoveProduct(){
        Clear.shouldBe(Condition.visible).click();
    }
}
