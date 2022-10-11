package pom.tests.demoqa;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pom.pages.demoqa.TextBoxPage;
import pom.tests.TestBase;

public class TextBoxTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        super.setUp();
        TextBoxPage.open("https://demoqa.com/text-box");
    }

    @Test
    private void testInputFullName() {
        String expectedFullName = "Dovydas Vilčinskas";
        String actualFullName;
        TextBoxPage.enterFullName(expectedFullName);
        TextBoxPage.clickButtonSubmit();
        actualFullName = TextBoxPage.readMessage();

        Assert.assertTrue(actualFullName.contains(expectedFullName),
                String.format("Actual: [%s] Expected: [%s]", actualFullName, expectedFullName));
    }

    @Test
    private void testInputEmail() {
        String expectedEmail = "dovydas@gmail.com";
        String actualEmail;
        TextBoxPage.enterEmail(expectedEmail);
        TextBoxPage.clickButtonSubmit();
        actualEmail = TextBoxPage.readEmail();

        Assert.assertTrue(actualEmail.contains(expectedEmail),
                String.format("Actual: [%s] Expected: [%s]", actualEmail, expectedEmail));
    }

    @Test
    private void testInputCurrentAddress() {
        String expectedCurrentAddress = "Gedimino prospektas";
        String actualCurrentAddress;
        TextBoxPage.enterCurrentAddress(expectedCurrentAddress);
        TextBoxPage.clickButtonSubmit();
        actualCurrentAddress = TextBoxPage.readCurrentAddress();

        Assert.assertTrue(actualCurrentAddress.contains(expectedCurrentAddress),
                String.format("Actual: [%s] Expected: [%s]", actualCurrentAddress, expectedCurrentAddress));
    }
}
