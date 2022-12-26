package Tests;

import Factory.Runner;
import Pages.*;
import com.github.javafaker.Faker;
import org.junit.Assert;
import org.testng.annotations.Test;

import java.util.Locale;

public class TestCases extends TestBase{


    @Test
    public void Register(){
        new Home().regClick().RegisterProcess(config.fname(),config.lname(),  email, config.company(),config.password(),config.confirm());
        Assert.assertTrue(new MyAccountPage().message().contains("complete"));
    }
    ///////////////////////////////////////////////////////////////////
    @Test(dependsOnMethods = {"Register"})
    public void Log(){
        new Home().LoginClick().LogIn(email, config.password());
        Assert.assertEquals(new Home().Text(),"My account");

    }

    ///////////////////////////////////////////////////////////////////////////

    @Test(dependsOnMethods = {"Log"})
    public void changeCurrency(){
        new Home().currencySelect(config.currency());
                new Home().clicksearch(config.product()).clicktoproductpage();
                Assert.assertTrue(new ProductPage().Price().contains("€"));

    }




/////////////////////////////////////////////////

    @Test(dependsOnMethods = {"changeCurrency"})
    public void Search(){
        new Home().clicksearch(config.product()).clicktoproductpage();
        Assert.assertTrue(new ProductPage().message().contains("Apple MacBook"));
    }
    ///////////////////////////////////////////////////////
    @Test(dependsOnMethods = {"Search"})
    public void WishCase(){
        new ProductPage().clicktowish().wishUpdate(config.numberofproduct());
        Assert.assertEquals(new WishListPage().TheTotal(),"€4644.00");
        new WishListPage().remove();
        Assert.assertEquals(new WishListPage().finalMessage(),"The wishlist is empty!");
    }
    //////////////////////////////////////////////////////////
    @Test(dependsOnMethods = {"WishCase"})
    public void CompareCase(){
        new Home().clicksearch(config.product()).clicktoproductpage().CompareProduct();
        new Home().clicksearch(config.anotherproduct()).clickasus().CompareProduct();
        new ComparePage().RemoveProduct();
        Assert.assertTrue(new ComparePage().Text().contains("have no items"));
    }

}
