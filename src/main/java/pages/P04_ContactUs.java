package pages;

import common.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class P04_ContactUs extends PageBase {
    public P04_ContactUs(WebDriver driver) {
        super(driver);
    }

    private final By uploadfileBtn = By.xpath("(//input)[@type=\"file\"]");



    public P04_ContactUs clickChooseFile(String filepath){

        shortWait(driver).until(ExpectedConditions.elementToBeClickable(uploadfileBtn));
        driver.findElement(uploadfileBtn).sendKeys(filepath);
        return this;
    }
}
