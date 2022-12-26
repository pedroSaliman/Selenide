package Tests;

import Factory.FrameWorkConfig;
import com.github.javafaker.Faker;
import org.aeonbits.owner.ConfigFactory;
import org.testng.annotations.BeforeSuite;

import java.util.Locale;

import static com.codeborne.selenide.Selenide.open;


public class TestBase {
    Faker faker = new Faker(new Locale("es"));
    String email=faker.internet().safeEmailAddress();
    FrameWorkConfig config;
    @BeforeSuite
    public void setup(){
        config= ConfigFactory.create(FrameWorkConfig.class);
        open(config.url());
    }

}
