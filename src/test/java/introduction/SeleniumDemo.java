package introduction;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SeleniumDemo {

    WebDriver driver;
    @BeforeMethod
    private void setUp(){
        // pirmas metodas kuris vykdomas, keliam atsikartojancias setup'o eilutes
    }

    @AfterMethod
    private void closeUp(){
        // paskutinis metodas, irgi atsikartojancia info jei reik gale
    }


    @Test
    public void testDemoWebDriver(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

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
        driver = new ChromeDriver();
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

    @Test
    public void testClickKontaktaiAtVCSpageWithSmallWindow() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.vilniuscoding.lt");
        //driver.manage().window().maximize();

//        WebElement buttonBurger = driver.findElement(By.id("burger"));
//        buttonBurger.click();
//
//        WebElement kontaktaiVcs = driver.findElement(By.id("menu-item-3969"));
//        kontaktaiVcs.click();
        try {
            WebElement buttonBurger = driver.findElement(By.id("burger"));
            buttonBurger.click();
            Thread.sleep(3500);

            WebElement kontaktaiVcs = driver.findElement(By.id("menu-item-3969"));
            kontaktaiVcs.click();
            Thread.sleep(3500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();
    }
}
