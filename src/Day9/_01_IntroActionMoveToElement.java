package Day9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utils.BaseDriver;

import javax.swing.*;

public class _01_IntroActionMoveToElement extends BaseDriver {

    /*
        What is action class in selenium?

     */

    public static void main(String[] args) {

        driver.get("https://birtwhistle.com/workers-compensation-insurance/");

        WebElement personalInsurance = driver.findElement(By.id("menu-item-19"));

        Actions action = new Actions(driver);

        action.moveToElement(personalInsurance).perform();

        WebElement BusinessInsurance = driver.findElement(By.xpath("//span[text()='Business Insurance']"));

        action.moveToElement(BusinessInsurance).perform();

    }

}
