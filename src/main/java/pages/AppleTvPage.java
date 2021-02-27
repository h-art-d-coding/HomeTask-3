package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AppleTvPage extends BasePage{
    @FindBy(xpath = "//div[@data-product='3435']//a[contains(@class,'main-btn')]")
    private WebElement notifyOnAvalability;
    @FindBy(xpath = "//input[@name='email']")
    private WebElement inputEmail;
    @FindBy(xpath = "//div[@id='modalAlert']//div[text()='Успешно!']")
    private WebElement textAlert;
    @FindBy(id ="js_availableProductNotification" )
    private WebElement notifyEmailPopup;
    @FindBy(xpath = "//div[@class='col-xs-12']//button")
    private WebElement sentButton;

    public AppleTvPage(WebDriver driver){super(driver);}

    public void notifyOnAvailabilityButton(){
        notifyOnAvalability.click();
    }
    public void setInEmailInput(final String testEmail){
        inputEmail.sendKeys(testEmail);
    }
    public String getAlertOfNotifyRequest(){ return textAlert.getText();}
    public WebElement getNotifyEmailPopup()
    {
        return  notifyEmailPopup;
    }
    public void clickSentButton()
    {
        sentButton.click();
    }


}
