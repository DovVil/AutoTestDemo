package pom.pages.seleniumEasy;

import pom.pages.Common;
import pom.pages.Locators;

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
}
