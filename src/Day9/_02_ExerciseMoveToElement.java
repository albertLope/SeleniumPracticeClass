package Day9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utils.BaseDriver;

public class _02_ExerciseMoveToElement extends BaseDriver {

    public static void main(String[] args) {

        driver.get("https://www.python.org/community/irc/");

        WebElement Downloads = driver.findElement(By.linkText("Downloads"));

        Actions action = new Actions(driver);

        action.moveToElement(Downloads).perform();

        driver.findElement(By.linkText("All releases")).click();

        System.out.println(driver.getCurrentUrl());

        WebElement Success_Stories = driver.findElement(By.linkText("Success Stories"));

        action.moveToElement(Success_Stories).perform();

        driver.findElement(By.linkText("Arts")).click();

        System.out.println(driver.getCurrentUrl());

    }

}
