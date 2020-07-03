package Day10;

import org.openqa.selenium.By;
import utils.BaseDriver;

public class _04_AlertPart5 extends BaseDriver {

    public static void main(String[] args) throws InterruptedException {

        driver.get("hhttp://demo.guru99.com/test/delete_customer.php");

        driver.findElement(By.xpath("//input[@type='submit']")).click();

        String s1 = driver.switchTo().alert().getText();

        System.out.println(s1);

        driver.switchTo().alert().accept();

        driver.switchTo().alert().accept();

    }
}
