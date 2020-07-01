package Day8;

import org.openqa.selenium.By;
import utils.BaseDriver;

import java.util.concurrent.TimeUnit;

public class _06_Wait extends BaseDriver {

    public static void main(String[] args) {

        driver.get("https://www.seleniumeasy.com/test/jquery-download-progress-bar-demo.html");

        driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);

        driver.findElement(By.id("downloadButton")).click();

        System.out.println(driver.findElement(By.xpath("//div[text()='Complete!']")).getText());

    }



}
