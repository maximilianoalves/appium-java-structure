package appiumtests.pageObjects;

import appiumtests.utils.Env;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.screenrecording.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    static AppiumDriver<MobileElement> _driver = Env.getDriver();
    static WebDriverWait _wait = Env.getDriverWait();

    public void back() {
        _driver.navigate().back();
    }

}
