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

    @AfterMethod
    private void close() {
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();
    }

}
