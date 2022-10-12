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

    //        PVZ kai reikia tikrinti elemento atributa(pvz value)
    @Test
    private void testMultipleCheckBoxStatusCheckedAll(){
        String expectedButtonText = "Uncheck All";
        String actualButtonText = "";
        boolean expectedCheckBoxStatus = true;
        boolean actualCheckBoxStatus;

        CheckBoxDemoPage.clickCheckAll();
        actualButtonText = CheckBoxDemoPage.readButtonIfItsUncheckAll();

        Assert.assertEquals(actualButtonText, expectedButtonText);

        actualCheckBoxStatus = CheckBoxDemoPage.checkStatusesOfCheckBoxes(expectedCheckBoxStatus);

        Assert.assertEquals(actualCheckBoxStatus, expectedCheckBoxStatus);
    }

    @Test
    private void testMultipleCheckBoxStatusUncheckedAll(){
        String expectedButtonText = "Check All";
        String actualButtonText;
        boolean expectedCheckBoxStatus = false;
        boolean actualCheckBoxStatus;

        CheckBoxDemoPage.clickCheckAll();
        CheckBoxDemoPage.clickCheckAll();

        actualButtonText = CheckBoxDemoPage.readButtonIfItsUncheckAll();

        Assert.assertEquals(actualButtonText, expectedButtonText);

        actualCheckBoxStatus = CheckBoxDemoPage.checkStatusesOfCheckBoxes(expectedCheckBoxStatus);


        //  >>>>>>>>>>>>>>>>>>>>>>DAUG ATIDUMO SU TRUE FALSe<<<<<<<<<<<<<<<<<<<<<<<<

        //Assert.assertEquals(!actualCheckBoxStatus, expectedCheckBoxStatus);
        //   actualCheckBoxStatus visada grazins true jeigu veikia taip kaip reikia
        //   kadangi expectedCheckBoxStatus yra false tai reikia sauktuko paskutiniame asserte
        //   nes darom assertEquals
        //   todel geresnis avriantas:
        Assert.assertTrue(actualCheckBoxStatus);
    }

}
