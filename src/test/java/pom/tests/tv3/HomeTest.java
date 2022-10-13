package pom.tests.tv3;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pom.pages.tv3.HomePage;
import pom.tests.TestBase;

public class HomeTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        super.setUp();
        HomePage.open("https://www.tv3.lt/");
        HomePage.acceptPrivacyConfirmation();
    }

    @Test
    private void testOpenPageUzsienis(){
        boolean elementIsAvailable;

        HomePage.clickOnUzsienis();
        elementIsAvailable = HomePage.checkIfElementIsAvailable();

        Assert.assertTrue(elementIsAvailable);
    }
}
