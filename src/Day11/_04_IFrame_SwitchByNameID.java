package Day11;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseDriver;

import java.util.concurrent.TimeUnit;


public class _04_IFrame_SwitchByNameID extends BaseDriver {

    public static void main(String[] args) {

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://chercher.tech/practice/frames");

//        Switching to frame
//        driver.switchTo().frame("frame1");//switch by the id
        driver.switchTo().frame(0);// switch by index

        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Hello World");

        driver.switchTo().defaultContent();


    }
}

