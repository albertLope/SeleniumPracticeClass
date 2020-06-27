package Day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.BaseDriver;

public class _05_AutomationPractice  extends BaseDriver {

    public static void main(String[] args) throws InterruptedException {

       driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");

       driver.findElement(By.id("email_create")).sendKeys("asd1234Test@gmail.com");

       driver.findElement(By.id("SubmitCreate")).submit();

       Thread.sleep(7000);

       driver.findElement(By.id("id_gender1")).click();

       driver.findElement(By.id("customer_firstname")).sendKeys("Ali");

       driver.findElement(By.id("customer_lastname")).sendKeys("Koklu");

       driver.findElement(By.id("passwd")).sendKeys("Hello World");

       WebElement days = driver.findElement(By.id("days"));

       Select dayDropdown = new Select(days);

       dayDropdown.selectByIndex(3);

        WebElement month = driver.findElement(By.id("months"));

        dayDropdown = new Select(month);

        dayDropdown.selectByIndex(3);

        WebElement years = driver.findElement(By.id("years"));

        dayDropdown = new Select(years);

        dayDropdown.selectByValue("1997");



    }
}
