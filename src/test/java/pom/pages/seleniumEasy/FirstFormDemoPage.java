package pom.pages.seleniumEasy;

import org.openqa.selenium.By;
import pom.pages.Common;

public class FirstFormDemoPage {

    public static void setUp() {
        Common.setUp();
    }

    public static void open(String url) {
        Common.openUrl(url);
    }

    public static void close() {
        Common.close();
    }

    public static void sleep(int milliseconds) {
        Common.sleep(milliseconds);
    }

    public static void enterFullName(String expectedFullName) {
        Common.sendKeysToElement(
                expectedFullName,
                By.xpath("//input[@id='user-message']")
        );
    }


    public static void clickButtonShowMessage() {
        Common.clickElement(By.xpath("//form[@id='get-input']//button"));
    }

    public static String readMessage() {
        return Common.getElementText(By.xpath("//span[@id='display']"));
    }

    public static void enterFirstInput(String input1) {
        Common.sendKeysToElement(
                input1,
                By.xpath("//input[@id='sum1']"));
    }

    public static void enterSecondInput(String input2) {
        Common.sendKeysToElement(
                input2,
                By.xpath("//input[@id='sum2']"));
    }


    public static void clickButtonGetTotal() {
        Common.clickElement(By.xpath("//*[@id='gettotal']//button"));
    }

    public static String readValue() {
        return Common.getElementText(By.xpath("//*[@id='displayvalue']"));
    }
}
