package pom.tests.seleniumEasy;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pom.pages.Common;
import pom.pages.Locators;
import pom.pages.seleniumEasy.CheckBoxDemoPage;
import pom.tests.TestBase;

public class CheckBoxDemoTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        super.setUp();
        CheckBoxDemoPage.open("https://demo.seleniumeasy.com/basic-checkbox-demo.html");
    }
    @Test
    private void testSingleCheckBoxDemo(){
        String expectedMessage = "Success - Check box is checked";
        String actualMessage;

        CheckBoxDemoPage.clickCheckBox();
        actualMessage = CheckBoxDemoPage.readMessage();

        Assert.assertEquals(actualMessage, expectedMessage);

        //Common.sleep(4000);
    }

}
