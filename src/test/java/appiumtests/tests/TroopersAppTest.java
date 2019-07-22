package appiumtests.tests;

import appiumtests.pageObjects.DetailsPage;
import appiumtests.pageObjects.HomePage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TroopersAppTest extends BaseTest {



    @Test
    public void testTrooperApp() throws Exception {
        HomePage homePage = new HomePage();
        DetailsPage detailsPage = new DetailsPage();

        for (int i = 0; i < homePage.countTroopersList(); i++) {
            homePage.isHome();
            String trooperName = homePage.getTextTroopersListByIndex(i);
            homePage.clickTrooperByIndex(i);

            Assertions.assertEquals(trooperName, detailsPage.getTextActionBar());
            detailsPage.back();
        }
    }

}
