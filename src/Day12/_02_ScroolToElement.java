package Day12;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import utils.BaseDriver;

import java.util.concurrent.TimeUnit;

public class _02_ScroolToElement extends BaseDriver {

    public static void main(String[] args) throws InterruptedException {

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://triplebyte.com/?ref=yt_20190826_t1_blade_skippable_2_animation&gclid=Cj0KCQiAvc_xBRCYARIsAC5QT9lHGgKp8Pta1S7Q8JRv42jozGtchlQfMpmfMQSqP5zXLWMngA-xK_caAhtlEALw_wcB");

        Thread.sleep(2000);

        WebElement text = driver.findElement(By.xpath("//h4[text()='Top engineering roles come to you']"));

        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("arguments[0].scrollIntoView();", text);

    }


}
