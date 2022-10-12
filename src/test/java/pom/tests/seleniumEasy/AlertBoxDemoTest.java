package pom.tests.seleniumEasy;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pom.pages.Common;
import pom.pages.seleniumEasy.AlertBoxDemoPage;
import pom.tests.TestBase;

public class AlertBoxDemoTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        super.setUp();
        AlertBoxDemoPage.open("https://demo.seleniumeasy.com/javascript-alert-box-demo.html");
    }

    @Test
    public void testToCloseAlertBox(){
        AlertBoxDemoPage.clickButtonToOpenAlertBox();
        Common.sleep(2500);
        AlertBoxDemoPage.clickCloseAlertBox();
        Common.sleep(2500);
    }

    @Test
    private void testToAcceptConfirmBox(){
        String expectedMessage = "OK";
        String actualMessage;
        AlertBoxDemoPage.clickButtonToOpenConfirmBox();
        Common.sleep(1500);
        AlertBoxDemoPage.clickAcceptConfirmBox();
        actualMessage = AlertBoxDemoPage.readMessageFromConfirmBox();

        Assert.assertTrue(actualMessage.contains(expectedMessage));
        Common.sleep(2000);
    }
    @Test
    private void testToCancelConfirmBox(){
        String expectedMessage = "Cancel";
        String actualMessage;

        AlertBoxDemoPage.clickButtonToOpenConfirmBox();
        Common.sleep(1500);
        AlertBoxDemoPage.clickCancelConfirmBox();
        actualMessage = AlertBoxDemoPage.readMessageFromConfirmBox();

        Assert.assertTrue(actualMessage.contains(expectedMessage));
        Common.sleep(2000);
    }
    @Test
    private void testSendKeysToAlertBox(){
        String expectedMessage = "Dovydas";
        String actualMessage = "";

        AlertBoxDemoPage.clickButtonToOpenSecondAlertBoxToAddText();
        AlertBoxDemoPage.sendMessageToAlertBox(expectedMessage);
        AlertBoxDemoPage.clickToAcceptAlertBox();

        actualMessage = AlertBoxDemoPage.readMessageFromAlertBoxWeSentText();
        Assert.assertTrue(actualMessage.contains(expectedMessage));
    }
}
