package testcases;

import commonTest.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.P02_SignUp_SignIn;

import static util.Utility.RandomEmailGenerator.generateRandomEmail;
import static util.Utility.RandomNameGenerator.generateRandomName;

public class TC02_initial_SignUp extends TestBase {

    public String newUserNameTXT = generateRandomName();
    public static String newEmailAddTXT = generateRandomEmail();

    @Test (priority = 1, description = "Enter new sign-up data")
    public void enterNewSignUpCred(){

        new P02_SignUp_SignIn(driver).enterNewUserName(newUserNameTXT).enterNewEmail(newEmailAddTXT).clickSignUpBtn();
        Assert.assertEquals(new P02_SignUp_SignIn(driver).enterAccountInfoVis(),true);
    }


}
