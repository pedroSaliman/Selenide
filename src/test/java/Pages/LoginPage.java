package Pages;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;
public class LoginPage {
    private static final SelenideElement Email=$x("//input[@id='Email']");
    private static final SelenideElement password=$x("//input[@id='Password']");
    private static final SelenideElement button=$x("//button[normalize-space()='Log in']");

    public Home LogIn(String email,String thpass){

        Email.shouldBe(Condition.visible).setValue(email);
        password.shouldBe(Condition.visible).setValue(thpass);
        button.shouldBe(Condition.visible).click();
        return new Home();
    }


}
