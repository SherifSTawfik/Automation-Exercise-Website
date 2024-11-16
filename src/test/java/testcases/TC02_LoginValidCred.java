package testcases;

import commonTest.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.P02_SignUp_SignIn;

import static testcases.TC02_initial_SignUp.newEmailAddTXT;
import static testcases.TC03_Registration.newuseremail;
import static testcases.TC03_Registration.newuserpass;

public class TC02_LoginValidCred extends TestBase {


    String partialtext = "Logged in as";


    @Test(priority = 1, description = "Enter valid login credentials")
    public void enterValidLoginCredentials(){

        new P02_SignUp_SignIn(driver).enterValidLoggedUserMail(newEmailAddTXT).enterValidLoggedUserPass(newuserpass).clickLoginBtn();
        //Assert.assertTrue(new P02_SignUp_SignIn(driver).loggedinasMsg().contains(partialtext));

    }

    @Test(priority = 2, description = "Click 'Logout' button")
    public void clickLogout(){

        new P02_SignUp_SignIn(driver).clickLogoutBtn();
    }


}
