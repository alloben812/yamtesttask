package pages;

import org.openqa.selenium.support.PageFactory;
import utils.WebDriverSingleton;

public class BasePage {
    protected WebDriverSingleton driver;
    public BasePage(WebDriverSingleton driver){
        this.driver = driver;
        PageFactory.initElements(driver.getWebDriverInstance(), this);
    }

}
