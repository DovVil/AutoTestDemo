package pom.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pom.utils.Driver;

import java.util.ArrayList;
import java.util.List;

public class Common {
    public static void setUpDriver() {
        Driver.setDriver();
    }

    public static void openUrl(String url) {
        Driver.getDriver().get(url);
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
    public static List<WebElement> getElements(By locator){
        return Driver.getDriver().findElements(locator);
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

    public static String getElementAttributeValue(By locator, String attributeName) {
        return getElement(locator).getAttribute(attributeName);

    }

    public static List<Boolean> getStatusOfCheckBoxes(By locator) {
        List<WebElement> elements = Common.getElements(locator);
        List<Boolean> statuses = new ArrayList<>();

        for(WebElement element : elements){
            statuses.add(element.isSelected());
        }
        return statuses;
    }

    public static Alert getAlert(){
        return Driver.getDriver().switchTo().alert();
    }
    public static void acceptAlert() {
        getAlert().accept();
    }
    public static void cancelAlert() {
        getAlert().dismiss();
    }

    public static void sendKeysToAlert(String sendKeys) {
        getAlert().sendKeys(sendKeys);

    }

    public static void clickElementByAction(By locator) {
        WebElement element = getElement(locator);
        Actions action = new Actions(Driver.getDriver());
        action.moveToElement(element);
        action.click();
        action.perform();
    }

    public static void doubleClickElementByAction(By locator) {
        WebElement element = getElement(locator);
        Actions action = new Actions(Driver.getDriver());
        action.moveToElement(element);
        action.doubleClick();
        action.perform();
    }

    public static void rightClickElementByAction(By locator) {
        WebElement element = getElement(locator);
        Actions action = new Actions(Driver.getDriver());
        action.moveToElement(element);
        action.contextClick();
        action.perform();
    }
}
