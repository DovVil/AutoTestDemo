package pom.tests.seleniumEasy;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pom.pages.seleniumEasy.SelectDropdownDemoPage;
import pom.tests.TestBase;

public class SelectDropdownDemoTest extends TestBase {

    @BeforeMethod
    @Override
    public void setUp() {
        super.setUp();
        SelectDropdownDemoPage.open("https://demo.seleniumeasy.com/basic-select-dropdown-demo.html");
    }

    @Test
    public void testSelectListDemo() {
        String expectedWeekDay = "Tuesday";
        String actualMessage = "";

        SelectDropdownDemoPage.clickDayFromDropdown(expectedWeekDay);
        actualMessage = SelectDropdownDemoPage.readMessage();

        Assert.assertTrue(actualMessage.contains(expectedWeekDay),
                String.format("Actual: [%s] Expected: [%s]", actualMessage, expectedWeekDay));

    }

}
