package pages;

import common.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class P01_HomePage extends PageBase {

    private JavascriptExecutor js;

    public P01_HomePage(WebDriver driver) {
        super(driver);
        this.js = (JavascriptExecutor) driver;
    }


    //TODO: Click on 'Signup / Login' button

    private final By signupLoginBtn = By.xpath("/html/body/header/div/div/div/div[2]/div/ul/li[4]/a");
    private final By contactUsBtn = By.xpath("/html/body/header/div/div/div/div[2]/div/ul/li[8]/a");
    private final By ProductsBtn = By.xpath("/html/body/header/div/div/div/div[2]/div/ul/li[2]/a");
    public static By RecommendedItemsTXT = By.xpath("(//h2)[@class=\"title text-center\"][2]");
    private final By itemInRecommItems = By.xpath("(//a)[@data-product-id=\"5\"][3]");
    private final By scrollupBTN = By.xpath("(//i)[@class=\"fa fa-angle-up\"]");
    private final By cartIcon = By.linkText("/view_cart");
    private final By fullfledgedTXT = By.xpath("//div[@class='item active']//h2[contains(text(),'Full-Fledged practice website for Automation Engin')]");



//    JavascriptExecutor js = (JavascriptExecutor) driver;
//
//    public static WebElement subscriptionTXT;

    private final By subscriptionTXTLocator = By.xpath("//h2[normalize-space()='Subscription']");
    public WebElement subscriptionTXT;





    /*---------------------------------------------------------------------------------*/


    public void clickSignLog (){

        js.executeScript("const elements = document.getElementsByClassName('adsbygoogle adsbygoogle-noablate'); while (elements.length > 0) elements[0].remove()");
        shortWait(driver).until(ExpectedConditions.elementToBeClickable(this.signupLoginBtn));
        driver.findElement(signupLoginBtn).click();

    }

    //TODO: Verify 'New User Signup!' is visible

    public String getNewUserMsg(){


        return driver.findElement(By.xpath("/html/body/section/div/div/div[3]/div/h2")).getText();

    }

    public String getLoggedUserMsg(){

        return driver.findElement(By.xpath("/html/body/section/div/div/div[1]/div/h2")).getText();

    }

    public void clickContactUs(){

        shortWait(driver).until(ExpectedConditions.elementToBeClickable(contactUsBtn));
        driver.findElement(contactUsBtn).click();
    }

    public void clickProductsBtn(){

        shortWait(driver).until(ExpectedConditions.elementToBeClickable(ProductsBtn));
        driver.findElement(ProductsBtn).click();
    }

    public String getAllProductsttl(){

        shortWait(driver).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h2)[@class=\"title text-center\"]")));
        return driver.findElement(By.xpath("(//h2)[@class=\"title text-center\"]")).getText();
    }

    public void initializeElements() {
        subscriptionTXT = driver.findElement(subscriptionTXTLocator);
    }

    public String verifSubscriptionTxt() {
        shortWait(driver).until(ExpectedConditions.visibilityOfElementLocated(subscriptionTXTLocator));
        initializeElements(); // Reinitialize in case of DOM change
        return subscriptionTXT.getText();
    }

    public void scrollToSubscriptionTxt() {
        // Ensure the subscription text is initialized
        initializeElements();
        js.executeScript("arguments[0].scrollIntoView();", subscriptionTXT); // Scroll to the element
    }

    public String verifyRecommItemTXT(){

        shortWait(driver).until(ExpectedConditions.visibilityOfElementLocated(RecommendedItemsTXT));
        return driver.findElement(RecommendedItemsTXT).getText();

    }

    public P01_HomePage clickProductFromRecommended(){

        shortWait(driver).until(ExpectedConditions.visibilityOfElementLocated(itemInRecommItems));
        driver.findElement(itemInRecommItems).click();
        return this;
    }

    public P01_HomePage clickScrollUp(){

        shortWait(driver).until(ExpectedConditions.elementToBeClickable(scrollupBTN));
        driver.findElement(scrollupBTN).click();
        return this;
    }

    public P01_HomePage clickCartIcon(){

        shortWait(driver).until(ExpectedConditions.elementToBeClickable(cartIcon));
        driver.findElement(cartIcon).click();
        return this;
    }

    public String verifyPageIsScrolledUp(){

        shortWait(driver).until(ExpectedConditions.visibilityOfElementLocated(fullfledgedTXT));
        return driver.findElement(fullfledgedTXT).getText();

    }





}
