package PageObjectModel.pages;

import PageObjectModel.locatorUtils.LocatorUtils;
import PageObjectModel.utility.ProjectData;
import PageObjectModel.utility.ProjectSetup;
import org.openqa.selenium.WebElement;

public class Signup extends ProjectSetup {

    String password = "123456Test@";
    static ProjectData projectData = new ProjectData();

    String[] fullNameAndEmail = projectData.randomInfo();
    String  fullName = fullNameAndEmail[0];
    String firstName = fullNameAndEmail[1];
    String lastName = fullNameAndEmail[2];
    String userEmailAddress = fullNameAndEmail[3];
    String companyName = fullNameAndEmail[4];
    String fullAddress = fullNameAndEmail[5];
    String stateName = fullNameAndEmail[6];
    String cityName = fullNameAndEmail[7];
    String zipCode = fullNameAndEmail[8];
    String mobileNumber = fullNameAndEmail[9];

    public void addSignupName(){
        driver.findElement(LocatorUtils.enterSignupName()).sendKeys(fullName);
    }
    public void addSignupEmail(){
        driver.findElement(LocatorUtils.enterSignupEmail()).sendKeys(userEmailAddress);
    }
    public void clickSignupBtn(){
        driver.findElement(LocatorUtils.clickSignupBtn()).click();
    }
    public void addTitle(){
        driver.findElement(LocatorUtils.addTitle()).click();
    }
    public void addPassword(){
        driver.findElement(LocatorUtils.addPassword()).sendKeys(password);
    }
    public void clickBirthDay(){
        driver.findElement(LocatorUtils.clickBirthDays()).click();
    }
    public void addBirthDay(){
        driver.findElement(LocatorUtils.AddBirthDays()).click();
    }
    public void clickBirthMonth(){
        driver.findElement(LocatorUtils.clickBirthMonths()).click();
    }
    public void addBirthMonth(){
        driver.findElement(LocatorUtils.AddBirthMonths()).click();
    }
    public void clickBirthYear(){
        driver.findElement(LocatorUtils.clickBirthYears()).click();
    }
    public void addBirthYear(){
        driver.findElement(LocatorUtils.addBirthYears()).click();
    }

    public void scrollToFullInformation(){
        WebElement scrollItems = driver.findElement(LocatorUtils.scrollToFullInformation());
        jse.executeScript("arguments[0].scrollIntoView(true);", scrollItems);
    }
    public void addFirstName(){
        driver.findElement(LocatorUtils.addFirstName()).sendKeys(firstName);
    }
    public void addLastName(){
        driver.findElement(LocatorUtils.addLastName()).sendKeys(lastName);
    }
    public void addCompanyName(){
        driver.findElement(LocatorUtils.addCompanyName()).sendKeys(companyName);
    }
    public void addAddress1(){
        driver.findElement(LocatorUtils.addAddress1()).sendKeys(fullAddress);
    }
    public void addState(){
        driver.findElement(LocatorUtils.addState()).sendKeys(stateName);
    }
    public void addCity(){
        driver.findElement(LocatorUtils.addCity()).sendKeys(cityName);
    }
    public void scrollToCity(){
        WebElement scrollItems = driver.findElement(LocatorUtils.scrollToCity());
        jse.executeScript("arguments[0].scrollIntoView(true);", scrollItems);
    }
    public void addZip(){
        driver.findElement(LocatorUtils.addZip()).sendKeys(zipCode);
    }
    public void addMobileNumber(){
        driver.findElement(LocatorUtils.addPhone()).sendKeys(mobileNumber);
    }
    public void clickCreateAccountBtn(){
        driver.findElement(LocatorUtils.clickCreateAccountBtn()).click();
    }
    public void clickSignupContinueBtn(){
        driver.findElement(LocatorUtils.clickSignupContinueBtn()).click();
    }
    public String verifyAccountCreation(){
        return driver.findElement(LocatorUtils.verifyAccountCreation()).getText();
    }
    public String verifyLoginAccount(){
        return driver.findElement(LocatorUtils.verifyLoginAccount()).getText();
    }
    public String userName(){
        return fullName;
    }
}
