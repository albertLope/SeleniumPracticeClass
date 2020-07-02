package Day12;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import utils.BaseDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class _01_Intro_ScrolByPixel extends BaseDriver {

    /*
        There are 3 ways for the scrool down

        1) By Pixel
        2) To element
        3) Bottom of the page

     */
    public static void main(String[] args) throws InterruptedException {

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://www.youtube.com/");

        driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Selenium");

        driver.findElement(By.id("search-icon-legacy")).click();

        Thread.sleep(2000);

            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0,5000)");

    }

}
