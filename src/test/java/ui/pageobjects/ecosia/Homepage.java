package ui.pageobjects.ecosia;

public class Homepage extends BasePage {

    private final String fakeSeleniumBySelector = "By.id(...)";

    public boolean isDisplayed() {
        return isElementDisplayed(fakeSeleniumBySelector);
    }

    public void enterSearchTerm() {
        // ...
    }

}
