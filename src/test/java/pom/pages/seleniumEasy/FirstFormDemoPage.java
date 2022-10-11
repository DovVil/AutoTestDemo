package pom.pages.seleniumEasy;

import org.openqa.selenium.By;
import pom.pages.Common;
import pom.pages.Locators;

public class FirstFormDemoPage {

    public static void open(String url) {
        Common.openUrl(url);
    }

    public static void sleep(int milliseconds) {
        Common.sleep(milliseconds);
    }

    public static void enterFullName(String expectedFullName) {
        Common.sendKeysToElement(
                expectedFullName,
                Locators.SeleniumEasy.FirstFormDemo.inputFullName);
    }


    public static void clickButtonShowMessage() {
        Common.clickElement(Locators.SeleniumEasy.FirstFormDemo.buttonShowMessageClick);
    }

    public static String readMessage() {
        return Common.getElementText(Locators.SeleniumEasy.FirstFormDemo.readMessage);
    }

    public static void enterFirstInput(String input1) {
        Common.sendKeysToElement(
                input1,
                Locators.SeleniumEasy.FirstFormDemo.inputFirstValue);
    }

    public static void enterSecondInput(String input2) {
        Common.sendKeysToElement(
                input2,
                Locators.SeleniumEasy.FirstFormDemo.inputSecondValue);
    }


    public static void clickButtonGetTotal() {
        Common.clickElement(Locators.SeleniumEasy.FirstFormDemo.buttonGetTotalClick);
    }

    public static String readValue() {
        return Common.getElementText(Locators.SeleniumEasy.FirstFormDemo.readTotalValue);
    }
}
