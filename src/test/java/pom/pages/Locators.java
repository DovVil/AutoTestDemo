package pom.pages;

import org.openqa.selenium.By;

public class Locators {

    public static class Demoqa{

        public static class TextBox{
            public static By inputFullName = By.xpath("//input[@id='userName']");
            public static By buttonSubmit = By.xpath("//*[@id='submit']");
            public static By paragraphName = By.xpath("//*[@id='name']");
            public static By inputEmail = By.xpath("//*[@id='userEmail']");
            public static By readEmail = By.xpath("//*[@id='email']");
            public static By inputAddress = By.xpath("//*[@placeholder='Current Address']");
            public static By readAddress = By.xpath("//*[@class='mb-1']");

        }
    }

    public static class SeleniumEasy{

        public static class FirstFormDemo{

            public static By inputFullName = By.xpath("//input[@id='user-message']");
            public static By buttonShowMessageClick = By.xpath("//form[@id='get-input']//button");
            public static By readMessage = By.xpath("//span[@id='display']");
            public static By inputFirstValue = By.xpath("//input[@id='sum1']");
            public static By inputSecondValue = By.xpath("//input[@id='sum2']");
            public static By buttonGetTotalClick = By.xpath("//*[@id='gettotal']//button");
            public static By readTotalValue = By.xpath("//*[@id='displayvalue']");

        }

        public static class singleCheckBoxDemo {
            public static By clickCheckBox = By.xpath("//input[@id='isAgeSelected']");
            public static By readSingleCheckBoxText = By.xpath("//div[@id='txtAge']");

        }

        public static class SelectDropdownDemo{
            public static By selectDayOfWeek = By.xpath("//select[@id='select-demo']");
            public static By readMessageOfDropdown = By.xpath("//p[@class='selected-value']");
            //                                                              //p[contains(text(), 'Day selected')]

        }
    }

}
