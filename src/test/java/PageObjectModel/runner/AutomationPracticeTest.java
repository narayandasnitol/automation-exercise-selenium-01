package PageObjectModel.runner;

import PageObjectModel.pages.*;
import PageObjectModel.utility.EnvironmentSetup;
import PageObjectModel.utility.ProjectData;
import PageObjectModel.utility.ProjectSetup;
import io.qameta.allure.Allure;
import io.qameta.allure.Attachment;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;

public class AutomationPracticeTest extends ProjectSetup {
    static Homepage homepage = new Homepage();
    static Cart cart = new Cart();
    static Signup signup = new Signup();
    static Checkout checkout = new Checkout();
    static Payment payment = new Payment();
    ProjectSetup projectSetup = new ProjectSetup();

    @BeforeTest
    public void ProjectSetup() throws InterruptedException {
        projectSetup.projectSetup();
    }

    @Test(priority = 1, description = "Homepage Visit Test")
    public void HomepageVisit() throws IOException, InterruptedException {
        System.out.println("Going to homepage..!!!");
        driver.get(EnvironmentSetup.baseURL);
        Thread.sleep(1000);

        String expectedText = "Website for automation practice";
        String actualText = homepage.visitHomepage();
        Assert.assertEquals(actualText, expectedText);

        if(actualText.equals(expectedText)){
            System.out.println("1. Homepage is visited successfully..!!!");
        }
        else{
            System.out.println("1. Homepage isn't visited successfully..!!!");
        }

        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("Screenshots\\AP-001-HomepageVisitTest"+".jpg"));
        Allure.addAttachment("HomepageVisitTest", new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)));
        Thread.sleep(1000);
    }

    @Test(priority = 2, description = "Cart Item Test")
    public static void AddToCart() throws InterruptedException, IOException {
        System.out.println("Adding product to cart..!!!");

        homepage.scrollToItems();
        Thread.sleep(1000);
        homepage.clickItemView();
        Thread.sleep(1000);
        homepage.addToCart();
        Thread.sleep(1000);

        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("Screenshots\\AP-002-AddToCartTest"+".jpg"));
        Allure.addAttachment("AddToCartTest", new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)));
        Thread.sleep(1000);

        homepage.gotoCartItems();
        Thread.sleep(2000);

        File scrFile2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile2, new File("Screenshots\\AP-003-CartItemsTest"+".jpg"));
        Allure.addAttachment("CartItemsTest", new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)));
        Thread.sleep(1000);

        String expectedText = "Proceed To Checkout";
        String actualText = cart.getCartPage();
        Assert.assertEquals(actualText, expectedText);

        if(actualText.equals(expectedText)){
            System.out.println("2. Cart page is displayed successfully..!!!");
            cart.clickCheckoutBtn();
            Thread.sleep(1000);
            cart.registerLoginBtn();
            Thread.sleep(1000);
        }
        else{
            System.out.println("2. Cart page isn't displayed successfully..!!!");
        }
    }

    @Test(priority = 3, description = "Signup Test")
    public static void Signup() throws InterruptedException, IOException {
        System.out.println("Trying to signup..!!!");

        signup.addSignupName();
        Thread.sleep(1000);
        signup.addSignupEmail();
        Thread.sleep(1000);

        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("Screenshots\\AP-004-SignupTest"+".jpg"));
        Allure.addAttachment("SignupTest", new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)));
        Thread.sleep(1000);

        signup.clickSignupBtn();
        Thread.sleep(1000);

        signup.addTitle();
        Thread.sleep(1000);
        signup.addPassword();
        Thread.sleep(1000);
        signup.clickBirthDay();
        Thread.sleep(1000);
        signup.addBirthDay();
        Thread.sleep(1000);
        signup.clickBirthMonth();
        Thread.sleep(1000);
        signup.addBirthMonth();
        Thread.sleep(1000);
        signup.clickBirthYear();
        Thread.sleep(1000);
        signup.addBirthYear();
        Thread.sleep(1000);

        signup.scrollToFullInformation();
        Thread.sleep(1000);
        signup.addFirstName();
        Thread.sleep(1000);
        signup.addLastName();
        Thread.sleep(1000);
        signup.addCompanyName();
        Thread.sleep(1000);
        signup.addAddress1();
        Thread.sleep(1000);
        signup.addState();
        Thread.sleep(1000);
        signup.addCity();
        Thread.sleep(1000);

        File scrFile2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile2, new File("Screenshots\\AP-005-SignupInformation1"+".jpg"));
        Allure.addAttachment("SignupInformation1", new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)));
        Thread.sleep(1000);

        signup.scrollToCity();
        Thread.sleep(1000);
        signup.addZip();
        Thread.sleep(1000);
        signup.addMobileNumber();
        Thread.sleep(1000);

        File scrFile3 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile3, new File("Screenshots\\AP-005-SignupInformation2"+".jpg"));
        Allure.addAttachment("SignupInformation2", new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)));
        Thread.sleep(1000);

        signup.clickCreateAccountBtn();
        Thread.sleep(1000);

        String expectedDetailsText = "ACCOUNT CREATED!";
        String actualDetailsText = signup.verifyAccountCreation();
        Assert.assertEquals(actualDetailsText, expectedDetailsText);
        if(expectedDetailsText.equals(actualDetailsText)){
            System.out.println("3. Account details verified..!!!");

            File scrFile4 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile4, new File("Screenshots\\AP-006-AccountSuccessfullyCreation"+".jpg"));
            Allure.addAttachment("AccountSuccessfullyCreation", new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)));
            Thread.sleep(1000);

            signup.clickSignupContinueBtn();
            Thread.sleep(1000);

            String actualUserNameText = "Logged in as "+signup.userName();
            String expectedUserNameText = signup.verifyLoginAccount();
            Assert.assertEquals(actualUserNameText, expectedUserNameText);
            if(actualUserNameText.equals(expectedUserNameText)){
                System.out.println("4. Logged in user verified..!!!");
            } else {
                System.out.println("4. Logged in user not verified..!!!");
            }

        } else{
            System.out.println("3. Account details not verified..!!!");
        }
    }

    @Test(priority = 4, description = "Checkout Test")
    public void Checkout() throws IOException, InterruptedException {
        System.out.println("Going to checkout..!!!");

        checkout.clickCartBtn();
        Thread.sleep(1000);
        checkout.clickProceedToCheckoutBtn();
        Thread.sleep(1000);

        String expectedText = "Address Details";
        String actualText = checkout.verifyAddressDetails();
        Assert.assertEquals(actualText, expectedText);

        if(expectedText.equals(actualText)){
            System.out.println("5. Address details verified..!!!");

            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("Screenshots\\AP-007-AccountDetailsVerify"+".jpg"));
            Allure.addAttachment("AccountDetailsVerify", new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)));
            Thread.sleep(1000);

            checkout.scrollToReviewOrder();
            Thread.sleep(1000);
            checkout.addComment();
            Thread.sleep(1000);
            checkout.clickPlaceOrderBtn();
            Thread.sleep(1000);

        } else{
            System.out.println("5. Address details not verified..!!!");
        }
    }

    @Test(priority = 5, description = "Payment Test")
    public void PaymentOrder() throws IOException, InterruptedException {
        System.out.println("Going to payment..!!!");

       payment.addCardName();
        Thread.sleep(1000);
       payment.addCardNumber();
        Thread.sleep(1000);
       payment.addCvv();
        Thread.sleep(1000);
       payment.addExpiryMonth();
        Thread.sleep(1000);
       payment.addExpiryYear();
       Thread.sleep(1000);

        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("Screenshots\\AP-008-PaymentConfirmation"+".jpg"));
        Allure.addAttachment("PaymentConfirmation", new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)));
        Thread.sleep(1000);

       payment.clickPlaceOrderBtn();
       Thread.sleep(1000);

       String expectedPaymentVerifyText = "Congratulations! Your order has been confirmed!";
       String actualPaymentVerifyText = payment.verifyOrderConfirmation();
       Assert.assertEquals(actualPaymentVerifyText, expectedPaymentVerifyText);
       if(actualPaymentVerifyText.equals(expectedPaymentVerifyText)){
           System.out.println("6. Order placed successfully..!!!");

           File scrFile2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
           FileUtils.copyFile(scrFile2, new File("Screenshots\\AP-009-OrderPlacement"+".jpg"));
           Allure.addAttachment("OrderPlacement", new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)));
           Thread.sleep(1000);

       } else{
           System.out.println("6. Order doesn't place successfully..!!!");
       }
    }

    @Attachment(value = "Screenshot", type = "image/png")
    public byte[] screenshot() {
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }
    @AfterTest
    public void ProjectTearDown() {
        System.out.println("\n** Automation Test has been closed..!!! **");

        try {
            File script3 = new File("Scripts/run_allure.bat");
            ProcessBuilder processBuilder3 = new ProcessBuilder("cmd.exe", "/c", script3.getAbsolutePath());
            Process process3 = processBuilder3.start();
        } catch (IOException var4) {
            var4.printStackTrace();
        }
        driver.quit();
    }
}
