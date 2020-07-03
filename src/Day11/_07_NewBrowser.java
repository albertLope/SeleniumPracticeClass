package Day11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseDriver;

public class _07_NewBrowser extends BaseDriver {

    public static void main(String[] args) {

        driver.get("https://demoqa.com/browser-windows");

        WebElement newTab = driver.findElement(By.id("windowButton"));

        newTab.click();

        String winHandleBefore = driver.getWindowHandle();

        // Perform the click operation that opens new window
        // Switch to new window opened
        for(String winHandle : driver.getWindowHandles()){
            driver.switchTo().window(winHandle);
        }

        System.out.println(driver.getCurrentUrl());
        // Perform the actions on new window

        // Close the new window, if that window no more required
        driver.close();

        // Switch back to original browser (first window)
        driver.switchTo().window(winHandleBefore);

    }

}
