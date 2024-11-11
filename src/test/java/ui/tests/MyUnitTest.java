package ui.tests;

import org.junit.jupiter.api.Test;
import ui.pageobjects.Homepage;

import static org.junit.jupiter.api.Assertions.assertTrue;

class MyUnitTest {

    @Test
    void isElementDisplayed() {
        assertTrue(new Homepage().isDisplayed(), "MyUnitTest failed");
    }

}
