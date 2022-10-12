package pom.pages.seleniumEasy;
import com.beust.jcommander.JCommander;
import pom.pages.Common;
import pom.pages.Locators;


public class AlertBoxDemoPage {

    public static void open(String url) {
        Common.openUrl(url);
    }

    public static void clickButtonToOpenAlertBox() {
        Common.clickElement(Locators.SeleniumEasy.AlertBoxDemo.buttonDisplayFirstAlertBox);
    }

    public static void clickCloseAlertBox() {
        Common.acceptAlert();
    }

    public static void clickButtonToOpenConfirmBox() {
        Common.clickElement(Locators.SeleniumEasy.AlertBoxDemo.buttonDisplayConfirmBox);
    }

    public static void clickAcceptConfirmBox() {
        Common.acceptAlert();
    }

    public static String readMessageFromConfirmBox() {
        return Common.getElementText(Locators.SeleniumEasy.AlertBoxDemo.paragraphConfirmBox);
    }

    public static void clickCancelConfirmBox() {
        Common.cancelAlert();
    }

    public static void clickButtonToOpenSecondAlertBoxToAddText() {
        Common.clickElement(Locators.SeleniumEasy.AlertBoxDemo.buttonOpenAlertBoxToAddText);
    }

    public static void sendMessageToAlertBox(String expectedMessage) {
        Common.sendKeysToAlert(expectedMessage);
    }

    public static void clickToAcceptAlertBox() {
        Common.acceptAlert();
    }

    public static String readMessageFromAlertBoxWeSentText() {
        return Common.getElementText(Locators.SeleniumEasy.AlertBoxDemo.paragraphAlertBox);
    }
}
