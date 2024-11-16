package testcases;

import commonTest.TestBase;
import org.testng.annotations.Test;
import pages.P03plus__Account_Created;

public class TC03plus_ContinueButton extends TestBase {

    @Test(priority = 20,description = "Click continue button")
    public void clickContinueBtn(){

        new P03plus__Account_Created(driver).clickContinue();
    }
}
