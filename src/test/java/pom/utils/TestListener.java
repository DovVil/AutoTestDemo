package pom.utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

public class TestListener implements ITestListener {
    // ctrl + i
    @Override
    public void onTestFailure(ITestResult result) {
        takeScreenshot();
    }

    private void takeScreenshot() {
                // galima castinti siuo atveju
        TakesScreenshot takesScreenshot = (TakesScreenshot) Driver.getDriver();
        File screenshotRaw = takesScreenshot.getScreenshotAs(OutputType.FILE);
        //String directory = ".";     taskas butu root directory, galima vieta pc nurodyti stringe
        String directory = "./screenshots";              //  root direktorijoj sukuria screenshots folderi

        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd__HH_mm_ss_SSS");
        String dateTime = localDateTime.format(formatter);

        File screenshotFile = new File(directory + "/screenshot_" + dateTime + "_" + UUID.randomUUID() + ".png");
                                                       //    UUID.randomUUID()     atsitiktinis skaicius, galima nedet
        try {
            FileUtils.copyFile(screenshotRaw, screenshotFile);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
