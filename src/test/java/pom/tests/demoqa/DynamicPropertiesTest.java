package pom.tests.demoqa;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pom.pages.demoqa.DynamicPropertiesPage;
import pom.tests.TestBase;

public class DynamicPropertiesTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        super.setUp();
        DynamicPropertiesPage.open("https://demoqa.com/dynamic-properties");
    }

    @Test
    private void testButtonWithWait(){
//        DynamicPropertiesPage.clickButtonAfterWait();
//
//        DynamicPropertiesPage.clickButtonAfterColorChange();

        DynamicPropertiesPage.clickButtonAfterVisibilityChange();
    }
}
