package testcases;

import commonTest.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.P05_CartPage;
import pages.P09_Products;


public class TC09_Products extends TestBase {

    String productname = "Men T-shirt";

    @Test(priority = 1, description = " Enter product name in search input ")
    public void searchForProduct()  {

        try {
            new P09_Products(driver).enterProductInSrch(productname).clicksearchBtn();
            Assert.assertEquals(new P09_Products(driver).productsSrchRslt(), "SEARCHED PRODUCTS");
        } catch (Exception e) {
            System.out.println("sss");
        }
    }

    @Test(priority = 2,description = "Hover over first product and click 'Add to cart")
    public void hoverFirstProduct(){

        new P09_Products(driver).selectFirstPrdct();
        Assert.assertEquals(new P09_Products(driver).verifySelectedItemDes(),"Blue Top");
        Assert.assertEquals(new P09_Products(driver).verifySelectedItemQ(),"1");
    }

}
