package ui.pageobjects;

public class BasePage {

    protected boolean isElementDisplayed(String bySelector) {
        // selenium fake
//        return driver.findElement(bySelector).isDisplayed();
        return true;
    }

}
