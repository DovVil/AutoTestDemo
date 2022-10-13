package pom.pages.demoqa;

import pom.pages.Common;
import pom.pages.Locators;

public class DynamicPropertiesPage {
    public static void open(String url) {
        Common.openUrl(url);
    }

    public static void clickButtonAfterWait() {
        Common.waitForElementToBeClickable(Locators.Demoqa.DynamicProperties.clickButtonAfterWait);
        Common.clickElement(Locators.Demoqa.DynamicProperties.clickButtonAfterWait);
    }

    public static void clickButtonAfterColorChange() {
        String attributeName = "class";
        String attributeValue = "text-danger";
        Common.waitForElementToChangeColor(
                Locators.Demoqa.DynamicProperties.clickButtonColorChange, attributeName, attributeValue);
        Common.clickElement(Locators.Demoqa.DynamicProperties.clickButtonColorChange);
    }

    public static void clickButtonVisibleAfter() {
        Common.clickElement(Locators.Demoqa.DynamicProperties.clickButtonVisibleAfter);
    }
}
