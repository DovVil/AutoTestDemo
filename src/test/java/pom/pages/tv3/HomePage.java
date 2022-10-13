package pom.pages.tv3;

import org.openqa.selenium.NoSuchElementException;
import pom.pages.Common;
import pom.pages.Locators;

public class HomePage {
    public static void open(String url) {
        Common.openUrl(url);
    }

    public static void acceptPrivacyConfirmation() {
        Common.waitForElementWithVisibilityChange(Locators.tv3.Home.privacyFormConfirmation);
        Common.clickElement(Locators.tv3.Home.privacyAcceptButton);
        Common.sleep(3000);
    }

    public static void clickOnUzsienis() {
        Common.clickElement(Locators.tv3.Home.clickMenuButtonUzsienis);
    }

    public static void sleep(int millis) {
        Common.sleep(millis);
    }

    public static boolean checkIfElementIsAvailable() {
        try{
            Common.getElement(Locators.tv3.Home.linkHeaderUzsienis);
            return true;
        }catch(NoSuchElementException e){
            return false;
        }
    }
}
