package Day11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseDriver;

import java.util.Set;

public class _06_Window extends BaseDriver {

    public static void main(String[] args) throws InterruptedException {

        driver.get("https://demoqa.com/browser-windows");

        WebElement newTab = driver.findElement(By.id("tabButton"));

        newTab.click();

        Set<String> handles = driver.getWindowHandles();

        String parentWindow =  driver.getWindowHandle();

        // Pass a window handle to the other window
        for (String handle1 : handles) {

            System.out.println(handle1);

            driver.switchTo().window(handle1);

        }

        System.out.println(driver.getCurrentUrl());

        driver.close();

//      This line is failing because of the driver.close we need to switch back to parent window. Command out the line 38
        System.out.println(driver.getCurrentUrl());

    }
}
