package pom.tests.seleniumEasy;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pom.pages.Common;
import pom.pages.seleniumEasy.RadioButtonDemoPage;
import pom.tests.TestBase;

public class RadioButtonDemoTest extends TestBase {

    @BeforeMethod
    @Override
    public void setUp(){
        super.setUp();
        RadioButtonDemoPage.open("https://demo.seleniumeasy.com/basic-radiobutton-demo.html");
    }

    @DataProvider(name = "DataProviderForGenderSelection")
    public Object[][] provideDataForGenderSelection(){
        return new Object[][]{
                {"Male"},
                {"Female"}
        };
    }
    @Test(dataProvider = "DataProviderForGenderSelection")
    public void testSingleRadioButtonDemo(String expectedGender){
        //String expectedGender = "Male";
        String actualMessage;
        RadioButtonDemoPage.selectGenderButton(expectedGender);
        RadioButtonDemoPage.clickButtonGetCheckedValue();
        actualMessage = RadioButtonDemoPage.readMessage();

        Assert.assertTrue(actualMessage.contains(expectedGender),
                String.format("Actual: [%s] Expected: [%s]", actualMessage, expectedGender));

    }
    @DataProvider(name = "DataProviderForGroupGenderSelection", parallel = true)
    public Object[][] provideDataForGroupGenderSelection(){
        return new Object[][]{
                {"Male", "0 - 5"},
                {"Male", "5 - 15"},
                {"Male", "15 - 50"},
                {"Female", "0 - 5"},
                {"Female", "5 - 15"},
                {"Female", "15 - 50"},
        };
    }
    @Test(dataProvider = "DataProviderForGroupGenderSelection", threadPoolSize = 6)
    public void testGroupRadioButtonDemo(String expectedGroupGender, String expectedAgeGroup){
        String actualGenderMessage;
        String actualAgeGroupMessage;

        RadioButtonDemoPage.selectGroupGenderButton(expectedGroupGender);
        RadioButtonDemoPage.selectRadioButtonAgeGroup(expectedAgeGroup);
        RadioButtonDemoPage.clickButtonGetValues();

        actualGenderMessage = RadioButtonDemoPage.readGroupGenderMessage();
        actualAgeGroupMessage = RadioButtonDemoPage.readGroupAgeMessage();

        Assert.assertTrue(actualGenderMessage.contains(expectedGroupGender),
                String.format("Actual: [%s] Expected: [%s]", actualGenderMessage, expectedGroupGender));
        Assert.assertTrue(actualAgeGroupMessage.contains(expectedAgeGroup),
                String.format("Actual: [%s] Expected: [%s]", actualAgeGroupMessage, expectedAgeGroup));

        //Common.sleep(2000);
    }
}
