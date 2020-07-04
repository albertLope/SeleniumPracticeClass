package Day11;


import org.openqa.selenium.By;
import utils.BaseDriver;
import java.util.concurrent.TimeUnit;

public class _01_IFrame_SwitchByNameID extends BaseDriver {

    public static void main(String[] args) {

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://chercher.tech/practice/frames");

//        Switching to frame
        driver.switchTo().frame("frame1");//switch by the id

        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Hello World");

        driver.switchTo().defaultContent();

    }
}

