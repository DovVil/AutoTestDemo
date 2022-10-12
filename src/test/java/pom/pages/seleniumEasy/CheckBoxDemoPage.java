package pom.pages.seleniumEasy;

import pom.pages.Common;
import pom.pages.Locators;

import java.util.List;

public class CheckBoxDemoPage {

    public static void open(String url) {
        Common.openUrl(url);
    }

    public static void clickCheckBox() {
        Common.clickElement(Locators.SeleniumEasy.SingleCheckBoxDemo.clickCheckBox);
    }

    public static String readMessage() {
        return Common.getElementText(Locators.SeleniumEasy.SingleCheckBoxDemo.readSingleCheckBoxText);
    }

    public static void clickCheckAll() {
        Common.clickElement(Locators.SeleniumEasy.MultipleCheckBoxDemo.buttonGroupCheckBox);
    }

    public static String readButtonIfItsUncheckAll() {
        return Common.getElementAttributeValue(
                Locators.SeleniumEasy.MultipleCheckBoxDemo.buttonGroupCheckBox, "value");
    }


    public static boolean checkStatusesOfCheckBoxes(boolean expectedCheckBoxStatus) {
        List<Boolean> statusList = Common.getStatusOfCheckBoxes(
                Locators.SeleniumEasy.MultipleCheckBoxDemo.inputMultipleCheckBox);

        for(boolean status : statusList){
            if(expectedCheckBoxStatus != status){
                return false;
            }
        }
        return true;
    }
}
