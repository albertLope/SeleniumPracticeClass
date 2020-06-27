package Day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.BaseDriver;

public class _10_Examples extends BaseDriver {

    public static void main(String[] args) throws InterruptedException {

        driver.get("http://dbankdemo.com/login");

        Thread.sleep(1000);
        driver.findElement(By.partialLinkText("Sign Up Here")).click();

        WebElement title = driver.findElement(By.id("title"));

        Select s1 = new Select(title);

        s1.selectByIndex(2);

        driver.findElement(By.id("firstName")).sendKeys("Fernando");

        driver.findElement(By.id("lastName")).sendKeys("Torres");

        driver.findElement(By.xpath("//*[@value='M']")).click();

        driver.findElement(By.id("dob")).sendKeys("11/11/2000");

        driver.findElement(By.id("ssn")).sendKeys("123123127");

        driver.findElement(By.xpath("//*[@id='emailAddress']")).sendKeys("TestingTT@gmail.com");

        driver.findElement(By.xpath("//*[@id='password']")).sendKeys("123Qweasd.");

        driver.findElement(By.xpath("//*[@id='confirmPassword']")).sendKeys("123Qweasd.");

        driver.findElement(By.xpath("//button[text()='Next']")).submit();

    }
}
