package ui.pageobjects.ecosia;

public class SearchResultsPage extends BasePage {

    private final String fakeSeleniumBySelector = "By.id(...)";

    public boolean isDisplayed() {
        return isElementDisplayed(fakeSeleniumBySelector);
    }

}
