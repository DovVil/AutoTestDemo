package introduction;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumDemo {

    @Test
    public void testDemoWebDriver(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.vilniuscoding.lt");    // atidaro psl.


        try {
            driver.manage().window().fullscreen();
            Thread.sleep(4000);
            driver.manage().window().maximize();
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();     //   uzdaro psl.
    }

    @Test
    public void testClickKontaktaiAtVCSpage(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.vilniuscoding.lt");
        driver.manage().window().maximize();
        WebElement kontaktaiVcs = driver.findElement(By.id("menu-item-3969"));

        kontaktaiVcs.click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();





    }

}
