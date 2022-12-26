package Pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class Home {
    private static final SelenideElement RegisterButton=$x("//a[normalize-space()='Register']");
    private static final SelenideElement Searchbar=$x("//input[@id='small-searchterms']");
    private static final SelenideElement LoginButton=$x("//a[normalize-space()='Log in']");
    private static final SelenideElement LogoutButton=$x("//a[normalize-space()='Log out']");
    private static final SelenideElement acountButtonText=$x("//a[@class='ico-account']");
    private static final SelenideElement Currency=$x("//select[@id='customerCurrency']");
   ///////////////////////////////////////////////////////////////////////////////////////////////////
    public String Text(){
        return acountButtonText.shouldBe(Condition.visible).text();
    }
    ///////////////////////////////////////////////////////////////////////////////////////////////////
public void currencySelect(String paper){
        Currency.shouldBe(Condition.visible).selectOptionContainingText(paper);
}
    /////////////Register Click Button///////////////////
    public RegisterPage regClick(){
        RegisterButton.shouldBe(Condition.visible).click();
        return new RegisterPage();
    }
    //////////////Search///////
    public SearchPage clicksearch(String product){
        Searchbar.shouldBe(Condition.visible).setValue(product).pressEnter();
        return new SearchPage();
    }
    ///////////////////////////////////////////
    public LoginPage LoginClick(){
     //   LogoutButton.shouldBe(Condition.visible).click();
        LoginButton.shouldBe(Condition.visible).click();
        return new LoginPage();
    }

}
