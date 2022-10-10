package introduction;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SeleniumEasy {

    WebDriver driver;

    @BeforeMethod
    private void setUp() {
        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("window-size=2000,3000");
        options.addArguments("--force-device-scale-factor=0.75");
        //options.addArguments("headless");   //   parametras kuris nerodo vizualiai lango, bet pilnai atlieka testa

        driver = new ChromeDriver(options);  // reikia isidet options kur sukurem 21 eilutej
        driver.manage().deleteAllCookies();
        driver.get("https://demo.seleniumeasy.com/basic-first-form-demo.html");
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //  jei norim suletint, del pc resursu

    }

    @Test
    private void testInputFieldSeleniumEasy(){

        String expectedFullName = "Dailius";
        String actualFullName;

        WebElement singleInputField = driver.findElement(By.xpath("//input[@id='user-message']"));
        singleInputField.sendKeys(expectedFullName);

        WebElement buttonShowMessage = driver.findElement(By.xpath("//form[@id='get-input']//button"));
        buttonShowMessage.click();

        actualFullName = driver.findElement(By.xpath("//span[@id='display']")).getText();

        Assert.assertEquals(actualFullName, expectedFullName);
    }

    @Test
    private void testTwoInputFieldsAdd5and5Values(){
        int input1 = 5;
        int input2 = 5;
        int expectedSumTotal = 10;
        String actualSumTotal;

        WebElement inputField1 = driver.findElement(By.xpath("//input[@id='sum1']"));
        inputField1.sendKeys(String.valueOf(input1));

        WebElement inputField2 = driver.findElement(By.xpath("//input[@id='sum2']"));
        inputField2.sendKeys(String.valueOf(input2));

        WebElement buttonGetTotal = driver.findElement(By.xpath("//*[@id='gettotal']//button"));
        buttonGetTotal.click();

        WebElement elementTotal = driver.findElement(By.xpath("//*[@id='displayvalue']"));
        actualSumTotal = elementTotal.getText();

        Assert.assertEquals(actualSumTotal, String.valueOf(expectedSumTotal));
    }

    @Test
    private void test1(){

    }


    @AfterMethod
    private void close() {
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
        driver.quit();
    }
}
