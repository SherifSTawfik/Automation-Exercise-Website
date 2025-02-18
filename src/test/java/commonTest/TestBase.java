package commonTest;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import static common.PageBase.quitBrowser;
import static drivers.DriverFactory.getNewInstance;
import static drivers.DriverHolder.getDriver;
import static drivers.DriverHolder.setDriver;

public class TestBase {

    public static WebDriver driver;
    protected Faker faker=new Faker();


    @BeforeTest
    public void setupdriver() {

        //TODO: Launch browser
        setDriver(getNewInstance(""));

        driver = getDriver();
        //TODO:Navigate to url 'http://automationexercise.com'
        driver.get("https://automationexercise.com/");

    }

    @AfterTest
    public void teardown(){

        quitBrowser(driver);
    }


}
