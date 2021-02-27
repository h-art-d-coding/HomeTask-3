package tests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class ValidLinksTests extends BaseTests{
    private final String FACEBOOK_URL = "https://www.facebook.com/avicshop/";
    private final String TELEGRAM_URL = "https://t.me/OnlineShopAvicUa";
    private final String INSTAGRAM_URL = "https://www.instagram.com/avicshop/";
    private final String YOUTUBE_URL = "https://www.youtube.com/channel/UCeDZJkBQu8KMn3OPoU71HvA/featured";

    @Test(priority = 1)
    public void checkFacebookLinkWork(){
        getHomePage().clickOnFacebookLink();
        getHomePage().implicitWait(30);
        getHomePage().switchToOpenPage();
        assertTrue(getDriver().getCurrentUrl().contains(FACEBOOK_URL));
    }
    @Test(priority = 2)
    public void checkTelegramLinkWork(){
        getHomePage().clickOnTelegramLink();
        getHomePage().implicitWait(30);
        getHomePage().switchToOpenPage();
        assertTrue(getDriver().getCurrentUrl().contains(TELEGRAM_URL));
    }
    @Test(priority = 3)
    public void checkInstagramLinkWork(){
        getHomePage().clickOnInstagramLink();
        getHomePage().implicitWait(30);
        getHomePage().switchToOpenPage();
        assertTrue(getDriver().getCurrentUrl().contains(INSTAGRAM_URL));
    }
    @Test(priority = 4)
    public void checkYoutubeLinkWork(){
        getHomePage().clickOnYouTubeLink();
        getHomePage().implicitWait(30);
        getHomePage().switchToOpenPage();
        assertTrue(getDriver().getCurrentUrl().contains(YOUTUBE_URL));
    }
}
