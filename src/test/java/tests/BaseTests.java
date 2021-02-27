package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import pages.AppleStorePage;
import pages.AppleTvPage;
import pages.HomePage;

import static io.github.bonigarcia.wdm.WebDriverManager.chromedriver;

public class BaseTests {

    private WebDriver driver;
    private static final String AVIC_URL = "https://avic.ua/";

    @BeforeTest
    public void profileSetUp() {
        chromedriver().setup();
    }

    @BeforeMethod
    public void testsSetUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(AVIC_URL);
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

    public WebDriver getDriver()
    {
        return driver;
    }
    public HomePage getHomePage(){
        return new HomePage(getDriver());
    }
    public AppleTvPage getAppleTvPage(){
        return new AppleTvPage(getDriver());
    }
    public AppleStorePage getAppleStorePage(){
        return new AppleStorePage(getDriver());
    }


}
