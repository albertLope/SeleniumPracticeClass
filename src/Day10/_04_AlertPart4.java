package Day10;

import org.junit.Assert;
import org.openqa.selenium.By;
import utils.BaseDriver;

public class _04_AlertPart4 extends BaseDriver {

    public static void main(String[] args) {

        driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");

        driver.findElement(By.cssSelector("button[onclick='myConfirmFunction()']")).click();

        // press accept on alert
        driver.switchTo().alert().dismiss();

        // find the result text on the website
        String actualText =driver.findElement(By.xpath("//p[@id='confirm-demo']")).getText();
        // confirm that the result test contains test string
        boolean contains = actualText.contains("You pressed Cancel!");
        Assert.assertTrue("Actual text should contain the test string!", contains);

    }

}
