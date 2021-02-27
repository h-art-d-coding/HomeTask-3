package tests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class PresenceNotifiesTests extends BaseTests{
    private static final String TEST_EMAIL = "test@test.com";
    private static final String ALERT_TEXT = "Успешно!";

    @Test
    public void checkInStockAvailable(){
        getHomePage().clickOnAppleStoreButton();
        getAppleStorePage().waitForPageLoadComplete(5);
        getAppleStorePage().clickOnAppleTvButton();
        getAppleTvPage().waitForPageLoadComplete(5);
        getAppleTvPage().notifyOnAvailabilityButton();
        getAppleTvPage().waitVisibilityOfElement(30,getAppleTvPage().getNotifyEmailPopup());
        getAppleTvPage().setInEmailInput(TEST_EMAIL);
        getAppleTvPage().clickSentButton();
        assertEquals(getAppleTvPage().getAlertOfNotifyRequest(),ALERT_TEXT);
    }
}
