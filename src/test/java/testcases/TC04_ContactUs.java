package testcases;

import commonTest.TestBase;
import org.testng.annotations.Test;
import pages.P04_ContactUs;


public class TC04_ContactUs extends TestBase {

    String filepath = "C:\\Newfolder\\test.PNG";

    @Test(priority = 1,description = "upload fie")
    public void clickchoosefileBtn(){

        new P04_ContactUs(driver).clickChooseFile(filepath);

    }
}
