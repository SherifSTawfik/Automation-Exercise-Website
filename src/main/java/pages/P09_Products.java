package pages;

import common.PageBase;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class P09_Products extends PageBase {
    public P09_Products(WebDriver driver) {
        super(driver);
    }

    final By searchFieldTxt = By.xpath("/html/body/section[1]/div/input");
    final By searchBtn = By.xpath("(//button)[@class=\"btn btn-default btn-lg\"]");
    WebElement firstproductMainMenu = driver.findElement(By.xpath("(//div)[@class=\"product-overlay\"][1]"));
    WebElement firstproductSubMenuCartBtn = driver.findElement(By.xpath("(//a)[@class=\"btn btn-default add-to-cart\"][1]"));
    Actions action = new Actions(driver);

    final By addToCartBtn = By.xpath("/html/body/section[2]/div[1]/div/div[2]/div/div[2]/div/div[1]/div[1]/a");
    Alert alert = driver.switchTo().alert();

    JavascriptExecutor js = (JavascriptExecutor) driver;

    /*-------------------------------------------------------------*/

    public P09_Products enterProductInSrch(String productname)  {


        shortWait(driver).until(ExpectedConditions.visibilityOfElementLocated(this.searchFieldTxt));
        driver.findElement(searchFieldTxt).sendKeys(productname);
        return this;
    }

    public P09_Products clicksearchBtn() {

        driver.findElement(searchBtn).click();
        return this;
    }

    public String productsSrchRslt() {

        return driver.findElement(By.xpath("(//h2)[@class=\"title text-center\"]")).getText();

    }

    public P09_Products selectFirstPrdct() {

//        action.moveToElement(firstproductMainMenu);
//        action.moveToElement(firstproductSubMenuCartBtn);
//        action.click().build().perform();
        js.executeScript("const elements = document.getElementsByClassName('adsbygoogle adsbygoogle-noablate'); while (elements.length > 0) elements[0].remove()");
        shortWait(driver).until(ExpectedConditions.elementToBeClickable(this.addToCartBtn));
        driver.findElement(addToCartBtn).click();
        return this;

    }

    public P09_Products clickOnContinueShopingAlert(){

        alert.accept();
        return this;
    }

    public String verifySelectedItemDes() {

        String Description = driver.findElement(By.xpath("//a[normalize-space()='Blue Top']")).getText();
        return Description;
    }

    public String verifySelectedItemQ() {

        String Quantity = driver.findElement(By.xpath("//button[@class='disabled']")).getText();
        return Quantity;
    }




}
















