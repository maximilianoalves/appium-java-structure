package appiumtests.pageObjects;

import lombok.Data;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public @Data class DetailsPage extends BasePage {

    private WebElement actionBarTitle = _driver.findElementByXPath("//android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.TextView");

    public String getTextActionBar() {
        _wait.until(ExpectedConditions.visibilityOf(actionBarTitle));
        return this.getActionBarTitle().getText();
    }

}
