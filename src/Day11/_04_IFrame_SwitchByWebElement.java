package Day11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseDriver;

public class _04_IFrame_SwitchByWebElement extends BaseDriver {

    public static void main(String[] args) {

        driver.get("https://chercher.tech/practice/frames");

        WebElement frameElement = driver.findElement(By.xpath("//iframe[@name='iamframe']"));

        driver.switchTo().frame(frameElement);

        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Hello World");

    }

}
