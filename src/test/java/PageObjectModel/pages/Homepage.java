package PageObjectModel.pages;

import PageObjectModel.locatorUtils.LocatorUtils;
import PageObjectModel.utility.ProjectSetup;
import org.openqa.selenium.WebElement;

public class Homepage extends ProjectSetup{
    public String visitHomepage(){
        return driver.findElement(LocatorUtils.getHomepage()).getAttribute("alt");
    }
    public void scrollToItems(){
        WebElement scrollItems = driver.findElement(LocatorUtils.scrollToItems());
        jse.executeScript("arguments[0].scrollIntoView(true);", scrollItems);
    }
    public void clickItemView(){
        driver.findElement(LocatorUtils.ClickItemView()).click();
    }
    public void addToCart(){
        driver.findElement(LocatorUtils.clickAddCartItem()).click();
    }
    public void gotoCartItems(){
        driver.findElement(LocatorUtils.clickViewCart()).click();
    }
}
