package Day12;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import utils.BaseDriver;

import java.util.concurrent.TimeUnit;

public class _04_ScroolToElementPractice extends BaseDriver {

    public static void main(String[] args) throws InterruptedException {

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://www.etsy.com/");

        Thread.sleep(2000);

        WebElement whatIsEtsy = driver.findElement(By.xpath("//h2[text()=' What is Etsy? ']"));

        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("arguments[0].scrollIntoView();", whatIsEtsy);

    }

}
