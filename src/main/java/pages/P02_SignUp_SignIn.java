package pages;

import common.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class P02_SignUp_SignIn extends PageBase {
    public P02_SignUp_SignIn(WebDriver driver) {
        super(driver);
    }

    private final By newUserName = By.xpath("(//input)[@data-qa=\"signup-name\"]");
    private final By newEmail = By.xpath("(//input)[@data-qa=\"signup-email\"]");
    private final By signUpBtn = By.xpath("(//button)[@data-qa=\"signup-button\"]");


    private final By loggedUserEmail = By.xpath("(//input)[@data-qa=\"login-email\"]");
    private final By loggedUserPass = By.xpath("(//input)[@data-qa=\"login-password\"]");
    private final By LoginBtn = By.xpath("(//button)[@data-qa=\"login-button\"]");
    private final By logoutBtn = By.xpath("(//a)[@style=\"color:brown;\"][1]");


       /*------------------------------------------------------------------------*/

    //TODO: Enter name and email address
    public P02_SignUp_SignIn enterNewUserName(String newUserNameTXT) {

        shortWait(driver).until(ExpectedConditions.presenceOfElementLocated(newUserName));
        driver.findElement(newUserName).sendKeys(newUserNameTXT);
        return this;
    }
    public P02_SignUp_SignIn enterNewEmail(String email) {

        shortWait(driver).until(ExpectedConditions.presenceOfElementLocated(newEmail));
        driver.findElement(newEmail).sendKeys(email);
        return this;
    }
    public P02_SignUp_SignIn clickSignUpBtn() {

        shortWait(driver).until(ExpectedConditions.elementToBeClickable(signUpBtn));
        driver.findElement(signUpBtn).click();
        return this;
    }

    //TODO: Verify that 'ENTER ACCOUNT INFORMATION' is visible
    public boolean enterAccountInfoVis(){

        shortWait(driver).until(ExpectedConditions.presenceOfElementLocated
                (By.xpath("(//h2)[@class=\"title text-center\"][1]")));

        return driver.findElement(By.xpath("(//h2)[@class=\"title text-center\"][1]")).isDisplayed();

    }

    public P02_SignUp_SignIn enterValidLoggedUserMail(String loggedUserMail) {

        shortWait(driver).until(ExpectedConditions.presenceOfElementLocated(loggedUserEmail));
        driver.findElement(loggedUserEmail).sendKeys(loggedUserMail);
        return this;
    }
    public P02_SignUp_SignIn enterValidLoggedUserPass(String loggedUserPassword) {

        shortWait(driver).until(ExpectedConditions.presenceOfElementLocated(loggedUserPass));
        driver.findElement(loggedUserPass).sendKeys(loggedUserPassword);
        return this;
    }

    public P02_SignUp_SignIn clickLoginBtn() {

        shortWait(driver).until(ExpectedConditions.presenceOfElementLocated(LoginBtn));
        driver.findElement(LoginBtn).click();
        return this;
    }

    public String loggedinasMsg(){

        String elementtext = driver.findElement(By.xpath("/html/body/header/div/div/div/div[2]/div/ul/li[10]/a")).getText();
        return elementtext;
    }
    public P02_SignUp_SignIn clickLogoutBtn() {

        shortWait(driver).until(ExpectedConditions.elementToBeClickable(logoutBtn));
        driver.findElement(logoutBtn).click();
        return this;
    }



}
