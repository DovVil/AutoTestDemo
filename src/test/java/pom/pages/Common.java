package pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pom.utils.Driver;

public class Common {
    public static void setUpDriver() {
        Driver.setDriver();
    }

    public static void openUrl(String url) {
        Driver.openUrl(url);
    }

    public static void closeDriver() {
        Driver.close();
    }

    public static void sleep(int milliseconds){
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static WebElement getElement(By locator){
        return Driver.getDriver().findElement(locator);
    }

    public static void sendKeysToElement(String keys, By locator) {
        getElement(locator).sendKeys(keys);
    }

    public static void clickElement(By locator) {
        getElement(locator).click();
    }


    public static String getElementText(By locator) {
        return getElement(locator).getText();
    }

    public static void selectOptionByValue(By locator, String value) {
        WebElement webelement = getElement(locator);
        Select selectElement = new Select(webelement);
        selectElement.selectByValue(value);
    }
}
