package Pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class MyAccountPage {
    private static final SelenideElement Result=$x("//div[@class='result']");
    public String message(){
        return Result.shouldBe(Condition.visible).text();
    }
}
