package Day12;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import utils.BaseDriver;

public class _03_ScrollToBottomOfThePage extends BaseDriver {

    public static void main(String[] args) {

        driver.get("https://triplebyte.com/?ref=yt_20190826_t1_blade_skippable_2_animation&gclid=Cj0KCQiAvc_xBRCYARIsAC5QT9lHGgKp8Pta1S7Q8JRv42jozGtchlQfMpmfMQSqP5zXLWMngA-xK_caAhtlEALw_wcB");

        driver.manage().window().maximize();

        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");

        driver.switchTo().defaultContent();

        driver.switchTo().frame("do-it-iframe");

        driver.findElement(By.xpath("//input[@placeholder='Search …']")).sendKeys("asd");

        driver.findElement(By.xpath("//input[@value='Search']")).click();

        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");

    }

}
