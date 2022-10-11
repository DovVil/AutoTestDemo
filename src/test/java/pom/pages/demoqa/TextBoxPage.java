package pom.pages.demoqa;

import org.openqa.selenium.By;
import pom.pages.Common;

public class TextBoxPage {
    public static void open(String url) {
        Common.openUrl(url);
    }

    public static void enterFullName(String expectedFullName) {
        Common.sendKeysToElement(
                expectedFullName,
                By.xpath("//input[@id='userName']"));
    }

    public static void clickButtonSubmit() {
        Common.clickElement(By.xpath("//*[@id='submit']"));
    }

    public static String readMessage() {
        return Common.getElementText(By.xpath("//*[@id='name']"));
    }

    public static void enterEmail(String expectedEmail) {
        Common.sendKeysToElement(
                expectedEmail,
                By.xpath("//*[@id='userEmail']"));
    }

    public static String readEmail() {
        return Common.getElementText(By.xpath("//*[@id='email']"));
    }

    public static void enterCurrentAddress(String expectedCurrentAddress) {
        Common.sendKeysToElement(
                expectedCurrentAddress,
                By.xpath("//*[@placeholder='Current Address']"));
    }

    public static String readCurrentAddress() {
        return Common.getElementText(By.xpath("//*[@class='mb-1']"));
    }
}
