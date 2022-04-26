package homepage;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class TopMenuTest extends Utility {
    String baseUrl = "https://mobile.x-cart.com/";

    @Before
    public void SetUp() {
        openBrowser(baseUrl);
    }
    @Test
    public void verifyShouldNavigateToShippingPageSuccsessfully(){
        clickOnElement(By.xpath("//ul[@class='nav navbar-nav top-main-menu']/li[3]/a"));
        verifyText("Shipping",By.xpath("//h1[@id='page-title']"),"Shipping");
    }
    @Test
    public void verifyUserShouldNavigateToNewPageSuccessfully(){
        clickOnElement(By.xpath("//ul[@class='nav navbar-nav top-main-menu']/li[4]/a"));
        verifyText("New arrivals",By.xpath("//h1[@id='page-title']"),"New arrivals");
    }
    @Test
    public void verifyUserShouldNavigateToComingsoonPageSuccessfully(){
        clickOnElement(By.xpath("//ul[@class='nav navbar-nav top-main-menu']/li[5]/a"));
        verifyText("Coming soon",By.xpath("//h1[@id='page-title']"),"Coming soon");
    }
    @Test
    public void verifyUserShouldNavigateToContactUsPageSuccessfully(){
        clickOnElement(By.xpath("//ul[@class='nav navbar-nav top-main-menu']/li[6]/a"));
        verifyText("Contact us", By.xpath("//div[@class='list-container']/h1"), "Contact us text");
    }
    @After
    public void close(){
       driver.close();
    }
}
