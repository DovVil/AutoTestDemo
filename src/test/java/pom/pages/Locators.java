package pom.pages;

import org.openqa.selenium.By;

public class Locators {

    public static class Demoqa {

        public static class TextBox {
            public static By inputFullName = By.xpath("//input[@id='userName']");
            public static By buttonSubmit = By.xpath("//*[@id='submit']");
            public static By paragraphName = By.xpath("//*[@id='name']");
            public static By inputEmail = By.xpath("//*[@id='userEmail']");
            public static By readEmail = By.xpath("//*[@id='email']");
            public static By inputAddress = By.xpath("//*[@placeholder='Current Address']");
            public static By readAddress = By.xpath("//*[@class='mb-1']");

        }

        public static class Home {
            public static By clickElementsButtonDemoqaHomePage =
                    By.xpath("//h5[text()= 'Elements']");
        }

        public static class Elements {
            public static By menuButtons = By.xpath("(//*[@id='item-4'])[1]");
        }

        public static class ActionButtons {
            public static By doubleClickButton = By.xpath("//button[@id='doubleClickBtn']");
            public static By readDoubleClickMessage = By.xpath("//p[@id='doubleClickMessage']");
            public static By rightClickButton = By.xpath("//button[@id='rightClickBtn']");
            public static By readRightClickMessage = By.xpath("//p[@id='rightClickMessage']");
        }

        public static class DynamicProperties {
            public static By clickButtonAfterWait = By.xpath("//button[@id='enableAfter']");
            public static By clickButtonColorChange = By.xpath("//button[@id='colorChange']");
            public static By clickButtonVisibleAfter = By.xpath("//button[@id='visibleAfter']");
        }

    }

    public static class SeleniumEasy {

        public static class FirstFormDemo {

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

        public static class MultipleCheckBoxDemo {
            public static By buttonGroupCheckBox = By.xpath("//*[@id='check1']");
            public static By inputMultipleCheckBox = By.xpath("//input[@class='cb1-element']");
        }

        public static class SelectDropdownDemo {
            public static By selectDayOfWeek = By.xpath("//select[@id='select-demo']");
            public static By readMessageOfDropdown = By.xpath("//p[@class='selected-value']");
            //                                                              //p[contains(text(), 'Day selected')]

        }

        public static class RadioButtonDemo {
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

            public static By inputByGender(String gender) {
                return By.xpath(String.format("//input[@value='%s' and @name='optradio']", gender));
            }

            public static By inputByGroupGender(String gender) {
                return By.xpath(String.format("//input[@value='%s' and @name='gender']", gender));
            }

            public static By inputByGroupAge(String age) {
                return By.xpath(String.format("//input[@value='%s' and @name='ageGroup']", age));
            }
        }

        public static class AlertBoxDemo {
            public static By buttonDisplayFirstAlertBox = By.xpath("//button[@class='btn btn-default']");
            public static By buttonDisplayConfirmBox = By.xpath("//button[@onclick='myConfirmFunction()']");
            public static By paragraphConfirmBox = By.xpath("//*[@id='confirm-demo']");
            public static By buttonOpenAlertBoxToAddText =
                    By.xpath("//button[@onclick='myPromptFunction()']");
            public static By paragraphAlertBox = By.xpath("//*[@id='prompt-demo']");


        }
    }

    public static class tv3 {
        public static class Home {
            public static By privacyFormConfirmation = By.xpath("//div[@id='qc-cmp2-ui']");
            public static By privacyAcceptButton =
                    By.xpath("//div[@id='qc-cmp2-ui']//button[@mode='primary']");
            public static By clickMenuButtonUzsienis =
                    By.xpath("//div[@class='headerItems']//a[contains(text(),'Užsienis')]");
            public  static By linkHeaderUzsienis =
                    By.xpath("//div[@class='News-list-header']//a[contains(text(),'Užsienis')]");
        }
    }

}
