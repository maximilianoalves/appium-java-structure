package appiumtests.pageObjects;

import io.appium.java_client.MobileElement;
import lombok.Data;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;


public @Data class HomePage extends BasePage {


    private WebElement actionBarTitle = _driver.findElementByXPath("//android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.TextView");
    private List<MobileElement> troopersList = _driver.findElementsById("com.hedo.troopersapp:id/list_item");
    private List<MobileElement> troopersListName = _driver.findElementsById("com.hedo.troopersapp:id/trooper_name_tv");

    public String getTextActionBar() {
        return this.getActionBarTitle().getText();
    }

    public void isHome() {
        Assertions.assertEquals(this.getTextActionBar(), "TroopersApp");
    }

    public String getTextTroopersListByIndex(int index) {
        return this.getTroopersListName().get(index).getText();
    }

    public int countTroopersList() {
        return this.getTroopersListName().size();
    }

    public void clickTrooperByIndex(int index) {
       this.getTroopersList().get(index).click();
    }

}
