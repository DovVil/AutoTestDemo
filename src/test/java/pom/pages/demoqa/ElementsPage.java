package pom.pages.demoqa;

import pom.pages.Common;
import pom.pages.Locators;

public class ElementsPage {
    public static void clickToOpenButtonsPage() {
        //Common.clickElement(Locators.Demoqa.Elements.menuButtons);
        Common.clickElementByAction(Locators.Demoqa.Elements.menuButtons);
    }

    public static void clickDoubleClick() {
        Common.doubleClickElementByAction(Locators.Demoqa.ActionButtons.doubleClickButton);
    }

    public static void clickRightClick() {
        Common.rightClickElementByAction(Locators.Demoqa.ActionButtons.rightClickButton);
    }

    public static String readDoubleClickMessage() {
        return Common.getElementText(Locators.Demoqa.ActionButtons.readDoubleClickMessage);
    }

    public static String readRightClickMessage() {
        return Common.getElementText(Locators.Demoqa.ActionButtons.readRightClickMessage);
    }
}
