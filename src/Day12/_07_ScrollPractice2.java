package Day12;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.BaseDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class _07_ScrollPractice2 extends BaseDriver {

    public static void main(String[] args) throws InterruptedException {

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://www.youtube.com/");

        driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Selenium");

        driver.findElement(By.id("search-icon-legacy")).click();

        Thread.sleep(2000);

        List<WebElement> l1 = driver.findElements(By.xpath("//a[@class='yt-simple-endpoint style-scope ytd-video-renderer']"));

        while(l1.size()<100){
            System.out.println(l1.size());

            JavascriptExecutor js = (JavascriptExecutor) driver;

            js.executeScript("arguments[0].scrollIntoView();", l1.get(l1.size()-1));

            l1 = driver.findElements(By.xpath("//a[@class='yt-simple-endpoint style-scope ytd-video-renderer']"));
            System.out.println(l1.size());

        }

        System.out.println(l1.get(l1.size()-1).getText());

    }

}
