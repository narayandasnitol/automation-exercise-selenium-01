package PageObjectModel.locatorUtils;

import org.openqa.selenium.By;

public class LocatorUtils extends PageObjectModel.utility.ProjectSetup{
    /* START - Homepage Locators - START */
    public static By getHomepage() {
        return By.cssSelector("img[alt='Website for automation practice']");
    }
    public static By scrollToItems(){
        return By.xpath("//h2[normalize-space()='Features Items']");
    }
    public static By ClickItemView(){
        return By.xpath("(//a[contains(text(),'View Product')])[2]");
    }
    public static By clickAddCartItem(){
        return By.xpath("//button[normalize-space()='Add to cart']");
    }
    /* END - Homepage Locators - END */

    /* START - Cart Page Locators - START */
    public static  By clickViewCart(){
        return By.xpath("//u[normalize-space()='View Cart']");
    }
    public static By getCartPage(){
        return By.xpath("//a[normalize-space()='Proceed To Checkout']");
    }
    public static By registerLogin(){
        return By.xpath("//u[normalize-space()='Register / Login']");
    }
    /* END - Cart Page Locators - END */

    /* START - Signup Locators - START */
    public static By enterSignupName(){
        return By.xpath("//input[@placeholder='Name']");
    }
    public static By enterSignupEmail(){
        return By.xpath("//input[@data-qa='signup-email']");
    }
    public static By clickSignupBtn(){
        return By.xpath("//button[normalize-space()='Signup']");
    }

    public static By addTitle(){
        return By.xpath("//input[@id='id_gender1']");
    }
    public static By addPassword(){
        return By.xpath("//input[@id='password']");
    }
    public static By clickBirthDays(){
        return By.xpath("//select[@id='days']");
    }
    public static By AddBirthDays(){
        return By.xpath("//option[normalize-space()='1']");
    }
    public static By clickBirthMonths(){
        return By.xpath("//select[@id='months']");
    }
    public static By AddBirthMonths(){
        return By.xpath("//option[normalize-space()='May']");
    }
    public static By clickBirthYears(){
        return By.xpath("//select[@id='years']");
    }
    public static By addBirthYears(){
        return By.xpath("//option[@value='1995']");
    }
    public static By scrollToFullInformation(){
        return By.xpath("//b[normalize-space()='Address Information']");
    }
    public static By addFirstName(){
        return By.xpath("//input[@id='first_name']");
    }
    public static By addLastName(){
        return By.xpath("//input[@id='last_name']");
    }
    public static By addCompanyName(){
        return By.xpath("//input[@id='company']");
    }
    public static By addAddress1(){
        return By.xpath("//input[@id='address1']");
    }
    public static By addState(){
        return By.xpath("//input[@id='state']");
    }
    public static By addCity(){
        return By.xpath("//input[@id='city']");
    }
    public static By scrollToCity(){
        return By.xpath("//input[@id='city']");
    }
    public static By addZip(){
        return By.xpath("//input[@id='zipcode']");
    }
    public static By addPhone(){
        return By.xpath("//input[@id='mobile_number']");
    }
    public static By clickCreateAccountBtn(){
        return By.xpath("//button[normalize-space()='Create Account']");
    }
    public static By clickSignupContinueBtn(){
        return By.xpath("//a[normalize-space()='Continue']");
    }
    public static By verifyAccountCreation(){
        return By.xpath("//b[normalize-space()='Account Created!']");
    }
    public static By verifyLoginAccount(){
        return By.cssSelector("li:nth-child(10) a:nth-child(1)");
    }
    /* END - Signup Locators - END */

    /* START - Checkout Locators - START */

    public static By clickCartBtn(){
        return By.xpath("(//i[@class='fa fa-shopping-cart'])[1]");
    }
    public static By clickProceedToCheckoutBtn(){
        return By.xpath("//a[normalize-space()='Proceed To Checkout']");
    }
    public static By verifyAddressDetails(){
        return By.xpath("//h2[normalize-space()='Address Details']");
    }
    public static By scrollToReviewOrder(){
        return By.xpath("//h2[normalize-space()='Review Your Order']");
    }
    public static By addComment(){
        return By.xpath("//textarea[@name='message']");
    }
    public static By clickPlaceOrderBtn(){
        return By.xpath("//a[normalize-space()='Place Order']");
    }

    /* END - Checkout Locators - END */

    /* START - Payment Locators - START */

    public static By addCardName(){
        return By.xpath("//input[@name='name_on_card']");
    }
    public static By addCardNumber(){
        return By.xpath("//input[@name='card_number']");
    }
    public static By addCVV(){
        return By.xpath("//input[@placeholder='ex. 311']");
    }
    public static By addExpiryMonth(){
        return By.xpath("//input[@placeholder='MM']");
    }
    public static By addExpiryYear(){
        return By.xpath("//input[@placeholder='YYYY']");
    }
    public static By clickOrderConfirmBtn(){
        return By.id("submit");
    }
    public static By VerifyOrderConfirmation(){
        return By.xpath("//p[normalize-space()='Congratulations! Your order has been confirmed!']");
    }
    /* END - Payment Locators - END */

}
