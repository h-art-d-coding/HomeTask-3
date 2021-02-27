package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class LetterTests extends BaseTests {

    @Test
    public void checkThatUserCanNotWriteEmptuFeedback(){
        getHomePage().clickOnLetteToDirectorButton();
        getHomePage().waitVisibilityOfElement(5, getHomePage().getMessagePopup());
        getHomePage().clickOnDirectorTub();
        getHomePage().clickSubmitButton();
        assertTrue(getHomePage().getResultOfSendingLetter());
        }
}
