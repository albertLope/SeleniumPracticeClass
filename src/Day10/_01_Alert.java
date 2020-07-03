package Day10;

import org.openqa.selenium.By;
import utils.BaseDriver;

public class _01_Alert extends BaseDriver {

    public static void main(String[] args) {

        /*
            How to handle alert in selenium?

                I am handling alert with switchTo method

                accept --> Click on okay.
                dismiss --> Click on cancel.
                getText --> Getting the text from the alert.
                Send keys --> Typing in the alert.
         */

            driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
            //driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']")).click();
            driver.findElement(By.cssSelector("button[onclick='myAlertFunction()']")).click();
            String alertText = driver.switchTo().alert().getText();
            System.out.println(alertText);
            driver.switchTo().alert().accept();


    }

}
