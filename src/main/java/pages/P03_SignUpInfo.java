package pages;

import common.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Random;

public class P03_SignUpInfo extends PageBase {
    public P03_SignUpInfo(WebDriver driver) {
        super(driver);
    }

    final By selectMrRdio = By.id("id_gender1");

    final By newName = By.id("name");
    final By newEmail = By.id("email");
    final By newPass = By.id("password");

    WebElement dropdownElement = driver.findElement(By.id("days"));
    Select dropdown = new Select(dropdownElement);
    List<WebElement> options = dropdown.getOptions();
    Random random = new Random();
    int randomIndex = random.nextInt(options.size());

    WebElement dropdownElementMnth = driver.findElement(By.id("months"));
    Select dropdownMnth = new Select(dropdownElementMnth);
    List<WebElement> optionsMnths = dropdownMnth.getOptions();
    Random randomMnths = new Random();
    int randomIndexMnths = randomMnths.nextInt(optionsMnths.size());

    WebElement dropdownElementYrs = driver.findElement(By.id("years"));
    Select dropdownYrs = new Select(dropdownElementYrs);
    List<WebElement> optionsYrs = dropdownYrs.getOptions();
    Random randomYrs = new Random();
    int randomIndexYrs = randomYrs.nextInt(optionsYrs.size());

    final By newsletterChkBx = By.id("newsletter");
    final By specOffersChkBx = By.id("optin");

    final By firstName = By.id("first_name");
    final By lastName = By.id("last_name");
    final By address = By.id("address1");

    WebElement countrysDropDown = driver.findElement(By.id("country"));
    Select countryDrpDwn = new Select(countrysDropDown);
    List<WebElement> cntryDrpDwn = countryDrpDwn.getOptions();
    Random randomcntrys = new Random();
    int randomIndexcntrys = randomcntrys.nextInt(cntryDrpDwn.size());

    final By state = By.id("state");
    final By city = By.id("city");
    final By zip = By.id("zipcode");
    final By mobile = By.id("mobile_number");
    final By createAccount = By.xpath("(//button)[@class=\"btn btn-default\"][1]");

    JavascriptExecutor js = (JavascriptExecutor) driver;


                    /*------------------------------------------------------------*/

    public P03_SignUpInfo selectnewUserTitl(){

        shortWait(driver).until(ExpectedConditions.elementToBeClickable(selectMrRdio));
        driver.findElement(selectMrRdio).click();
        return this;
    }
    public P03_SignUpInfo addNewUserName(String newUserNameTXT){

        shortWait(driver).until(ExpectedConditions.visibilityOfElementLocated(newName));
        driver.findElement(newName).clear();
        driver.findElement(newName).sendKeys(newUserNameTXT);
        return this;
    }
    public P03_SignUpInfo addNewUserMail(String newusermail){

        shortWait(driver).until(ExpectedConditions.visibilityOfElementLocated(newEmail));
        driver.findElement(newEmail).clear();
        driver.findElement(newEmail).sendKeys(newusermail);
        return this;
    }
    public P03_SignUpInfo addNewUserPass(String newuserpass){

        shortWait(driver).until(ExpectedConditions.visibilityOfElementLocated(newPass));
        driver.findElement(newPass).sendKeys(newuserpass);
        return this;
    }

    public P03_SignUpInfo selectRndmDay(){

        longWait(driver).until(ExpectedConditions.elementToBeClickable(dropdownElement));
        dropdown.selectByIndex(randomIndex);
        return this;
    }

    public P03_SignUpInfo selectRndmMnths(){

        longWait(driver).until(ExpectedConditions.elementToBeClickable(dropdownElementMnth));
        dropdownMnth.selectByIndex(randomIndexMnths);
        return this;
    }
    public P03_SignUpInfo dropdownElementYears(){

        longWait(driver).until(ExpectedConditions.elementToBeClickable(dropdownElementYrs));
        dropdownYrs.selectByIndex(randomIndexYrs);
        return this;
    }

    public P03_SignUpInfo selectNewsltroptn(){

        shortWait(driver).until(ExpectedConditions.elementToBeClickable(newsletterChkBx));
        driver.findElement(newsletterChkBx).click();
        return this;
    }

    public P03_SignUpInfo selectSpclOfrOptn(){

        shortWait(driver).until(ExpectedConditions.elementToBeClickable(specOffersChkBx));
        driver.findElement(specOffersChkBx).click();
        return this;
    }

    public P03_SignUpInfo enterFirstName(String firstname){

        shortWait(driver).until(ExpectedConditions.elementToBeClickable(firstName));
        driver.findElement(firstName).sendKeys(firstname);
        return this;
    }
    public P03_SignUpInfo enterLastName(String lastname){

        shortWait(driver).until(ExpectedConditions.elementToBeClickable(lastName));
        driver.findElement(lastName).sendKeys(lastname);
        return this;
    }
    public P03_SignUpInfo enteraddress(String addresss){

        shortWait(driver).until(ExpectedConditions.elementToBeClickable(address));
        driver.findElement(address).sendKeys(addresss);
        return this;
    }
    public P03_SignUpInfo selectRndmCntry(){

        longWait(driver).until(ExpectedConditions.elementToBeClickable(countrysDropDown));
        countryDrpDwn.selectByIndex(randomIndexcntrys);
        return this;
    }
    public P03_SignUpInfo selectState(String statename){

        shortWait(driver).until(ExpectedConditions.elementToBeClickable(state));
        driver.findElement(state).sendKeys(statename);
        return this;
    }
    public P03_SignUpInfo selectCity(String cityname){

        shortWait(driver).until(ExpectedConditions.elementToBeClickable(city));
        driver.findElement(city).sendKeys(cityname);
        return this;
    }
    public P03_SignUpInfo enterZipCode(String zipnumber){

        shortWait(driver).until(ExpectedConditions.elementToBeClickable(zip));
        driver.findElement(zip).sendKeys(zipnumber);
        return this;
    }
    public P03_SignUpInfo enterMobileNm(String mobilenumber){

        js.executeScript("const elements = document.getElementsByClassName('adsbygoogle adsbygoogle-noablate'); while (elements.length > 0) elements[0].remove()");
        shortWait(driver).until(ExpectedConditions.elementToBeClickable(mobile));
        driver.findElement(mobile).sendKeys(mobilenumber);
        return this;
    }
    public P03_SignUpInfo clickCreateAccount(){

        shortWait(driver).until(ExpectedConditions.elementToBeClickable(createAccount));
        driver.findElement(createAccount).click();
        return this;
    }

    public String checkConfMsg(){

        shortWait(driver).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//b[1]")));
        String AccountcreatedMsg = driver.findElement(By.xpath("//b[1]")).getText();
        return AccountcreatedMsg;
    }


}
