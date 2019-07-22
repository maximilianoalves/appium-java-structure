package appiumtests.utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Env {

    public static AppiumDriver<MobileElement> driver;
    public static WebDriverWait wait;

    public static void open() throws Exception {
        DesiredCapabilities caps = new DesiredCapabilities();

        caps.setCapability("deviceName", "Galaxy J5 Prime");
        caps.setCapability("platformName", "Android");
        caps.setCapability("platformVersion", "8.0.0");
        caps.setCapability("appPackage", "com.hedo.troopersapp");
        caps.setCapability("appActivity", ".MainActivity");
        caps.setCapability("app",  System.getProperty("user.dir") + "/src/test/resources/app.apk");

        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AppiumDriver<MobileElement>(url, caps);
        wait = new WebDriverWait(driver, 6000);
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }

    public static WebDriverWait getDriverWait() {
        return wait;
    }

    public static AppiumDriver<MobileElement> getDriver() {
        return driver;
    }

    public static void close() {
        driver.quit();
    }
}
