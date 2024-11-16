package testcases;

import commonTest.TestBase;
import org.testng.annotations.Test;
import pages.P05_CartPage;

public class TC05_CartPage extends TestBase {

    @Test(priority = 1,description = "click on proceed to checkout")
    public void clickOnProceedBTN(){

        new P05_CartPage(driver).clickProceed();
    }



}
