package pom.tests.demoqa;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pom.pages.demoqa.ButtonsPage;
import pom.pages.demoqa.ElementsPage;
import pom.pages.demoqa.HomePage;
import pom.tests.TestBase;

public class ButtonsTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        super.setUp();
        HomePage.open();
        HomePage.clickOpenElementsPage();
        ElementsPage.clickToOpenButtonsPage();
    }
    @Test
    private void testDoubleClick(){
        String expectedMessage = "double click";
        String actualMessage = "";

        ElementsPage.clickDoubleClick();
        actualMessage = ElementsPage.readDoubleClickMessage();
        Assert.assertTrue(actualMessage.contains(expectedMessage));
        ButtonsPage.sleep(3000);
    }
    @Test
    private void testRightClick(){
        String expectedMessage = "right click";
        String actualMessage = "";

        ElementsPage.clickRightClick();
        actualMessage = ElementsPage.readRightClickMessage();
        Assert.assertTrue(actualMessage.contains(expectedMessage));
        ButtonsPage.sleep(3000);
    }
}
