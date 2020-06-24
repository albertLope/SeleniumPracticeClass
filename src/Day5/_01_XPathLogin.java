package Day5;

import org.openqa.selenium.By;
import utils.BaseDriver;

public class _01_XPathLogin extends BaseDriver {

    public static void main(String[] args) throws InterruptedException {
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("locked_out_user");
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("//*[@id=\"password\"]//following-sibling::input")).click();
        String text = driver.findElement(By.xpath("//*[@id=\"password\"]//following-sibling::h3")).getText();
        System.out.println(text);
        driver.quit();
    }
}
