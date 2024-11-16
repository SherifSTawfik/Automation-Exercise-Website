package pages;

import common.PageBase;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P05_CartPage extends PageBase {
    public P05_CartPage(WebDriver driver) {
        super(driver);
    }

        final private By proceedToCheckout = By.xpath("//a[@class=\"btn btn-default check_out\"]");

        Alert alert = driver.switchTo().alert();



    public P05_CartPage clickProceed(){

            driver.findElement(proceedToCheckout).click();
            return this;
        }

    public P05_CartPage clickOnContinueOnCartAlert(){

        alert.accept();
        return this;
    }

}
