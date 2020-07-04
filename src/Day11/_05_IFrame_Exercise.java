package Day11;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseDriver;

import java.util.concurrent.TimeUnit;


public class _05_IFrame_Exercise extends BaseDriver {

    public static void main(String[] args) {

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://www.123formbuilder.com/free-form-templates/");

        driver.findElement(By.xpath("//a[text()='OK']")).click();

        WebElement EventRegistration = driver.findElement(By.xpath("//a[text()='Online Event Registration Form']"));

        EventRegistration.click();

//        Switching to frame
        WebElement frame = driver.findElement(By.xpath("//div[@class='template_box__inner']//iframe"));
        driver.switchTo().frame(frame);//switch by the webElement

        driver.findElement(By.xpath("//input[@placeholder='First']")).sendKeys("Hello");

        driver.switchTo().parentFrame();

        driver.findElement(By.linkText("Continue with template")).click();

    }

}

