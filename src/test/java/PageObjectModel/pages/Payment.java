package PageObjectModel.pages;

import PageObjectModel.locatorUtils.LocatorUtils;
import PageObjectModel.utility.ProjectSetup;

public class Payment extends ProjectSetup {

    String cardNumber = "4444444444444444";
    String CVV = "311";
    String expiryMonth = "11";
    String expiryYear = "2029";

    Signup signup = new Signup();
    public void addCardName(){
        driver.findElement(LocatorUtils.addCardName()).sendKeys(signup.fullName);
    }
    public void addCardNumber(){
        driver.findElement(LocatorUtils.addCardNumber()).sendKeys(cardNumber);
    }
    public void addCvv(){
        driver.findElement(LocatorUtils.addCVV()).sendKeys(CVV);
    }
    public void addExpiryMonth(){
        driver.findElement(LocatorUtils.addExpiryMonth()).sendKeys(expiryMonth);
    }
    public void addExpiryYear(){
        driver.findElement(LocatorUtils.addExpiryYear()).sendKeys(expiryYear);
    }
    public  void clickPlaceOrderBtn(){
        driver.findElement(LocatorUtils.clickOrderConfirmBtn()).click();
    }
    public String verifyOrderConfirmation(){
        return driver.findElement(LocatorUtils.VerifyOrderConfirmation()).getText();
    }
}
