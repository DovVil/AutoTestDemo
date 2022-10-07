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

import java.time.Duration;

public class TestSelenium {
    WebDriver driver;

    @BeforeMethod
    private void setUp() {
        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("window-size=2000,3000");
        options.addArguments("--force-device-scale-factor=0.75");
        //options.addArguments("headless");   //   parametras kuris nerodo vizualiai lango, bet pilnai atlieka testa

        driver = new ChromeDriver(options);  // reikia isidet options kur sukurem 21 eilutej
        driver.get("https://demoqa.com/text-box");
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //  jei norim suletint, del sudinu pc resursu

    }

    @Test
    private void testInputFullName() {
        String expectedFullName = "Dovydas Vilčinskas";
        String actualFullName;

        WebElement inputFullName = driver.findElement(By.xpath("//input[@id='userName']"));
        inputFullName.sendKeys(expectedFullName);

        WebElement buttonSubmit = driver.findElement(By.xpath("//*[@id='submit']"));
        buttonSubmit.click();

        WebElement textName = driver.findElement(By.xpath("//*[@id='name']"));
        actualFullName = textName.getText();

        //Assert.assertEquals(actualFullName , expectedFullName);    netinkamas, nes tekstas visada skirsis
        // actual pradzioj bus "Name:"
        Assert.assertTrue(actualFullName.contains(expectedFullName),
                String.format("Actual: [%s] Expected: [%s]", actualFullName, expectedFullName));

    }

    @Test
    private void testInputEmail() {
        String expectedEmail = "dovydas@gmail.com";
        String actualEmail;

        WebElement inputFullEmail = driver.findElement(By.xpath("//*[@id='userEmail']"));
        inputFullEmail.sendKeys(expectedEmail);

        WebElement buttonSubmit = driver.findElement(By.xpath("//*[@id='submit']"));
        buttonSubmit.click();

        WebElement textEmail = driver.findElement(By.xpath("//*[@id='email']"));
        actualEmail = textEmail.getText();

        //Assert.assertEquals(actualFullName , expectedFullName);    netinkamas, nes tekstas visada skirsis
        // actual pradzioj bus "Name:"
        Assert.assertTrue(actualEmail.contains(expectedEmail),
                String.format("Actual: [%s] Expected: [%s]", actualEmail, expectedEmail));

    }

    @Test
    private void testInputCurrentAddress() {
        String expectedCurrentAddress = "Gedimino prospektas";
        String actualCurrentAddress;

        WebElement inputCurrentAddress = driver.findElement(By.xpath("//*[@placeholder='Current Address']"));
        inputCurrentAddress.sendKeys(expectedCurrentAddress);

        WebElement buttonSubmit = driver.findElement(By.xpath("//*[@id='submit']"));
        buttonSubmit.click();

        WebElement textCurrentAddress = driver.findElement(By.xpath("//*[@class='mb-1']"));
        actualCurrentAddress = textCurrentAddress.getText();

        //Assert.assertEquals(actualFullName , expectedFullName);    netinkamas, nes tekstas visada skirsis
        // actual pradzioj bus "Name:"
        Assert.assertTrue(actualCurrentAddress.contains(expectedCurrentAddress),
                String.format("Actual: [%s] Expected: [%s]", actualCurrentAddress, expectedCurrentAddress));

    }

    //          //*[@id='currentAddress']       vietoj zvaigzdutes galima nurodyt p arba textarea siuo atveju
    //          tarp dvieju variantu, arba dar vienas variantas:
    //          (//*[@id='currentAddress'])[1]    ivilkt viska i skliaustus ir tada lauztiniuose nurodyt kelinta
    //          pasirinkti is visu randamu variantu


    //  dar variantas:   //button[text()='Show Message']
    //  dar variantas:   //*[contains(text(),'Message')]

    @AfterMethod
    private void close() {
        driver.quit();
    }

}
