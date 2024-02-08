package PageObjectModel.pages;

import PageObjectModel.locatorUtils.LocatorUtils;
import PageObjectModel.utility.ProjectSetup;

public class Cart extends ProjectSetup{
    public String getCartPage(){
        return driver.findElement(LocatorUtils.getCartPage()).getText();
    }
    public void clickCheckoutBtn(){
        driver.findElement(LocatorUtils.getCartPage()).click();
    }
    public void registerLoginBtn(){
        driver.findElement(LocatorUtils.registerLogin()).click();
    }
}
