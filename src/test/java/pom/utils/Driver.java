package pom.utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class Driver {

    //private static WebDriver driver;
    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();   // kai testng.xml nurodom kiek paraleliai threads naudoti

    public static void setDriver() {
        WebDriverManager.chromedriver().setup();
        //driver = new ChromeDriver(setUpOptions());
        driver.set(new ChromeDriver(setUpOptions()));
        driver.get().manage().deleteAllCookies();  //     dadejom .get()
        //driver.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    public static WebDriver getDriver() {
        return driver.get();  //      dadejom .get()
    }

    public static void close() {
        driver.get().quit();    //    dadejom .get()
    }

    private static ChromeOptions setUpOptions(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("window-size=2000,3000");
        options.addArguments("--force-device-scale-factor=0.75");
        //options.addArguments("headless");
        return options;
    }
}
