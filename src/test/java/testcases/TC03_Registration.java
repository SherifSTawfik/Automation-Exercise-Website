package testcases;

import commonTest.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.P03_SignUpInfo;

import static common.PageBase.AddressGenerator.generateRandomAddress;
import static common.PageBase.AddressGenerator.generateRandomPostalCode;
import static common.PageBase.MobileNumberGenerator.generateRandomMobileNumber;
import static util.Utility.RandomEmailGenerator.generateRandomEmail;
import static util.Utility.RandomNameGenerator.generateRandomName;

public class TC03_Registration extends TestBase {


    public static String newusername = generateRandomName();
    public static String newuseremail = generateRandomEmail();
    public static String newuserpass = "123456";
    String firstname = generateRandomName();
    String lastname = generateRandomName();
    String address = generateRandomAddress();
    String State = "cmppdi";
    String City = faker.address().city();
    String ZipCode = generateRandomPostalCode();
    String Mobile = generateRandomMobileNumber();



    @Test(priority = 1, description = "Fill registration details")
    public void enterRegisterCred(){

        new P03_SignUpInfo(driver).selectnewUserTitl().addNewUserPass(newuserpass)
                .selectRndmDay().selectRndmMnths().dropdownElementYears().selectNewsltroptn().selectSpclOfrOptn().enterFirstName(firstname)
                .enterLastName(lastname).enteraddress(address).selectRndmCntry().selectState(State).selectCity(City).enterZipCode(ZipCode)
                .enterMobileNm(Mobile).clickCreateAccount();
        Assert.assertEquals(new P03_SignUpInfo(driver).checkConfMsg(),"Account Created!");
    }

}
