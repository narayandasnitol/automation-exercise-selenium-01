package PageObjectModel.pages;

import PageObjectModel.locatorUtils.LocatorUtils;
import PageObjectModel.utility.ProjectSetup;
import org.openqa.selenium.WebElement;

public class Checkout extends ProjectSetup {

    String comment = "All good..!!!";

    public void clickCartBtn(){
        driver.findElement(LocatorUtils.clickCartBtn()).click();
    }
    public void clickProceedToCheckoutBtn(){
        driver.findElement(LocatorUtils.clickProceedToCheckoutBtn()).click();
    }
    public String verifyAddressDetails(){
        return driver.findElement(LocatorUtils.verifyAddressDetails()).getText();
    }
    public void scrollToReviewOrder(){
        WebElement scrollItems = driver.findElement(LocatorUtils.scrollToReviewOrder());
        jse.executeScript("arguments[0].scrollIntoView(true);", scrollItems);
    }
    public void addComment(){
        driver.findElement(LocatorUtils.addComment()).sendKeys(comment);
    }
    public void clickPlaceOrderBtn(){
        driver.findElement(LocatorUtils.clickPlaceOrderBtn()).click();
    }
}
