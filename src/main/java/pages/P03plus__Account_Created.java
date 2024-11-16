package pages;

import common.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P03plus__Account_Created extends PageBase {
    public P03plus__Account_Created(WebDriver driver) {
        super(driver);
    }

    private final By continueBtn = By.xpath("//a[@class=\"btn btn-primary\"]");


    public P03plus__Account_Created clickContinue() {

        driver.findElement(continueBtn).click();
        return this;
    }



}
