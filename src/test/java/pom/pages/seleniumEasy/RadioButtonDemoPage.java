package pom.pages.seleniumEasy;

import pom.pages.Common;
import pom.pages.Locators;

public class RadioButtonDemoPage {
    public static void open(String url) {
        Common.openUrl(url);
    }

    public static void selectGenderButton(String gender) {
        Common.clickElement(Locators.SeleniumEasy.RadioButtonDemo.inputByGender(gender));
    }

    public static void clickButtonGetCheckedValue() {
        Common.clickElement(Locators.SeleniumEasy.RadioButtonDemo.clickCheckedValueButton);
    }

    public static String readMessage() {
        return Common.getElementText(Locators.SeleniumEasy.RadioButtonDemo.paragraphRadioButton);
    }

    public static void selectGroupGenderButton(String gender) {
        Common.clickElement(Locators.SeleniumEasy.RadioButtonDemo.inputByGroupGender(gender));
    }

    public static void selectRadioButtonAgeGroup(String age) {
        Common.clickElement(Locators.SeleniumEasy.RadioButtonDemo.inputByGroupAge(age));
    }

    public static void clickButtonGetValues() {
        Common.clickElement(Locators.SeleniumEasy.RadioButtonDemo.clickGetValuesButton);
    }

    public static String readGroupGenderMessage() {
        return Common.getElementText(Locators.SeleniumEasy.RadioButtonDemo.readGroupRadioButtonGender);
    }

    public static String readGroupAgeMessage() {
        return Common.getElementText(Locators.SeleniumEasy.RadioButtonDemo.readGroupRadioButtonAge);
    }
}
