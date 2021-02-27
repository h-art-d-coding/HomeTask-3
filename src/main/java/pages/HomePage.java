package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
    @FindBy(xpath = "//a[contains(@class,'js_addMessage')]")
    private WebElement letterToDirectorButton;
    @FindBy(xpath = "//a[contains(text(),'Директор')]")
    private WebElement directorTub;
    @FindBy(xpath = "//div[@class='tab-content shown']//button[@type='submit']")
    private WebElement submitButton;
    @FindBy(xpath = "//a[contains(@href,'facebook')]")
    private WebElement facebookLink;
    @FindBy(xpath = "//a[contains(@href,'t.me')]")
    private WebElement telegramLink;
    @FindBy(xpath = "//a[contains(@href,'instagram')]")
    private WebElement instagramLink;
    @FindBy(xpath = "//a[contains(@href,'youtube')]")
    private WebElement youtubeLink;
    @FindBy(xpath = "//ul[contains(@class,'sidebar-list')]//a[contains(@href, 'apple-store')]")
    private WebElement appleStoreButton;
    @FindBy(id = "js_addMessage")
    private WebElement messagePopup;
    @FindBy(xpath = "//div[@class='tab-content shown']//div[contains(@class,'error')] [2]")
    private WebElement messageError;



    public HomePage(WebDriver driver){super(driver);}

    public void clickOnLetteToDirectorButton()
    {
       letterToDirectorButton.click();
    }
    public void clickOnDirectorTub(){
       directorTub.click();
    }
    public void clickSubmitButton(){
       submitButton.click();
    }
    public void clickOnFacebookLink(){
        facebookLink.click();
    }
    public void clickOnTelegramLink(){
       telegramLink.click();
    }
    public void clickOnInstagramLink(){
        instagramLink.click();
    }
    public void clickOnYouTubeLink(){
        youtubeLink.click();
    }
    public void clickOnAppleStoreButton(){
        appleStoreButton.click();
    }
    public WebElement getMessagePopup(){
        return messagePopup;
    }
    public boolean getResultOfSendingLetter(){
        return messageError.isDisplayed();
    }
}
