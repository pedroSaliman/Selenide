package Pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class RegisterPage {
    private static final SelenideElement Gender=$x("//input[@id='gender-male']");
    private static final SelenideElement fName=$x("//input[@id='FirstName']");
    private static final SelenideElement lName=$x("//input[@id='LastName']");
    private static final SelenideElement Email=$x("//input[@id='Email']");
    private static final SelenideElement Company=$x("//input[@id='Company']");
    private static final SelenideElement Password=$x("//input[@id='Password']");
    private static final SelenideElement ConfirmPassword=$x("//input[@id='ConfirmPassword']");
    private static final SelenideElement Submit=$x("//button[@id='register-button']");

    public MyAccountPage RegisterProcess(String firstname,String lastname,String email,String company,String password,String confirmpassword){
        Gender.shouldBe(Condition.visible).click();
        fName.shouldBe(Condition.visible).setValue(firstname);
        lName.shouldBe(Condition.visible).setValue(lastname);
        Email.shouldBe(Condition.visible).setValue(email);
        Company.shouldBe(Condition.visible).setValue(company);
        Password.shouldBe(Condition.visible).setValue(password);
        ConfirmPassword.shouldBe(Condition.visible).setValue(confirmpassword);
        Submit.shouldBe(Condition.visible).click();
        return new MyAccountPage();
    }
}
