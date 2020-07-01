package Day9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utils.BaseDriver;

public class _10_ExtraExampleMoveToElement extends BaseDriver {

    public static void main(String[] args) throws InterruptedException {

        driver.get("https://www.etsy.com/");

        WebElement homeAndLiving = driver.findElement(By.xpath("//span[contains(text(),'Clothing & Shoes')]"));

        Actions actions = new Actions(driver);

        actions.moveToElement(homeAndLiving).perform();

        Thread.sleep(3000);

        WebElement men = driver.findElement(By.xpath("//span[contains(text(),'Men')]"));

        actions.moveToElement(men).perform();

        WebElement shirts = driver.findElement(By.xpath("//a[contains(text(),'Shirts')]"));
        shirts.click();

        System.out.println(driver.getCurrentUrl());

    }
}
