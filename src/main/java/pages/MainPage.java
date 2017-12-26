package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.WebDriverSingleton;


import java.util.concurrent.TimeUnit;

public class MainPage extends BasePage{
    public MainPage(WebDriver driver){
        super(driver);
    }

    @FindBy(className = "user__name")
    private WebElement userName;

    @FindBy(css = ".popup__content .user__logout")
    private WebElement logout;

    @FindBy(className = "user__first-letter")
    private WebElement userFirstLetter;

    public WebElement getUserFirstLetter() {
        return userFirstLetter;
    }
    public WebElement getUserName(){
        return userName;
    }

    public void clickOnUserName(){
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        userName.click();
    }

    public void clickOnLogout(){ logout.click(); }
}
