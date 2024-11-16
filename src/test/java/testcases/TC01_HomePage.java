package testcases;

import commonTest.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.P01_HomePage;

import static pages.P01_HomePage.*;

public class TC01_HomePage extends TestBase {

    JavascriptExecutor js = (JavascriptExecutor) driver;

    @Test (priority = 1,description = "Click on 'Signup button")
    public void clickSignupLoginBtn (){

        new P01_HomePage(driver).clickSignLog();
       // Assert.assertEquals(new P01_HomePage(driver).getNewUserMsg(),"New User Signup!");
    }

    @Test(priority = 2,description = "Click on 'Login' button")
    public void clickLoginBtn (){

        new P01_HomePage(driver).clickSignLog();
        Assert.assertEquals(new P01_HomePage(driver).getLoggedUserMsg(),"Login to your account");
    }

    @Test(priority = 3, description = "Click on 'Contact Us' button")
    public void clickContactUs(){

        new P01_HomePage(driver).clickContactUs();
    }

    @Test(priority = 4, description = "Click on 'Products' button")
    public void clickOnProducts(){

        new P01_HomePage(driver).clickProductsBtn();
        //  Assert.assertEquals(new P01_HomePage(driver).getAllProductsttl(),"ALL PRODUCTS");
    }

    @Test(priority = 5, description = "Scroll down and verify Subscription text")
    public void scrollToSubscriptionTxt() {
        new P01_HomePage(driver).scrollToSubscriptionTxt();
        Assert.assertEquals(new P01_HomePage(driver).verifSubscriptionTxt(),"SUBSCRIPTION");
    }

    @Test(priority = 6,description = "Scroll down and verify Recommended items text")
    public void recommendedTXT(){


        js.executeScript("arguments[0].scrollIntoView();", RecommendedItemsTXT);
        Assert.assertEquals(new P01_HomePage(driver).verifyRecommItemTXT(), "recommended items");
    }

    @Test(priority = 7,description = "Select a product from recommended")
    public void selectFromRecommended(){

        new P01_HomePage(driver).clickProductFromRecommended();
    }

    @Test (priority = 8,description = "Click scroll-up arrow")
    public void clickScrollUp(){

        new P01_HomePage(driver).clickScrollUp();

    }

    @Test (priority = 9,description = "Click cart icon")
    public void clickCartIcon(){

        new P01_HomePage(driver).clickCartIcon();

    }

    @Test(priority = 10,description = "click Scroll up arrow")
    public void clickUpArrow(){

        new P01_HomePage(driver).clickScrollUp();
    }

    @Test(priority = 10,description = "verify Page Scrolled Up")
    public void verifyPageScrolledUp(){

        Assert.assertEquals(new P01_HomePage(driver).verifyPageIsScrolledUp(),"Full-Fledged practice website for Automation Engineers");

    }







}
