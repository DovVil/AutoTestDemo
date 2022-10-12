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

        public static class SingleCheckBoxDemo {
            public static By clickCheckBox = By.xpath("//input[@id='isAgeSelected']");
            public static By readSingleCheckBoxText = By.xpath("//div[@id='txtAge']");

        }

        public static class SelectDropdownDemo{
            public static By selectDayOfWeek = By.xpath("//select[@id='select-demo']");
            public static By readMessageOfDropdown = By.xpath("//p[@class='selected-value']");
            //                                                              //p[contains(text(), 'Day selected')]

        }

        public static class RadioButtonDemo{
            public static By clickCheckedValueButton = By.xpath("//button[@id='buttoncheck']");
            public static By clickGetValuesButton =
                    By.xpath("//button[@class='btn btn-default' and @onclick='getValues();']");
                                                       // galima naudoti  (//button)[3]  parenka trecia button
            public static By readGroupRadioButtonGender = By.xpath("//p[@class='groupradiobutton']");
                                                                                 //p[contains(text(), 'Sex :')]
                                                                           //p[@class='groupradiobutton']//text()[1]
            public static By readGroupRadioButtonAge = By.xpath("//p[@class='groupradiobutton']");
                                                                           //p[@class='groupradiobutton']//text()[2]
            public static By paragraphRadioButton = By.xpath("//p[@class='radiobutton']");
            public static By inputByGender(String gender){
                return By.xpath(String.format("//input[@value='%s' and @name='optradio']", gender));
            }
            public static By inputByGroupGender(String gender){
                return By.xpath(String.format("//input[@value='%s' and @name='gender']", gender));
            }
            public static By inputByGroupAge(String age){
                return By.xpath(String.format("//input[@value='%s' and @name='ageGroup']", age));
            }
        }
    }

}
