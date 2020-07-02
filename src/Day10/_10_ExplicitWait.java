package Day10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.BaseDriver;

import java.util.concurrent.TimeUnit;

public class _10_ExplicitWait extends BaseDriver {

    public static void main(String[] args) throws InterruptedException {

        driver.manage().timeouts().implicitlyWait(10 , TimeUnit.SECONDS);

        driver.get("https://www.demoblaze.com/index.html");

        WebDriverWait wait = new WebDriverWait(driver,10);

        WebElement Samsung = driver.findElement(By.linkText("Samsung galaxy s6"));

        Samsung.click();

        WebElement e2 = driver.findElement(By.linkText("Add to cart"));

        e2.click();

        wait.until(ExpectedConditions.alertIsPresent());

        driver.switchTo().alert().accept();

        driver.findElement(By.xpath("//a[text()='Home ']")).click();

        WebElement nokia = driver.findElement(By.linkText("Nokia lumia 1520"));

        nokia.click();

        e2 = driver.findElement(By.linkText("Add to cart"));

        e2.click();

        wait.until(ExpectedConditions.alertIsPresent());

        driver.switchTo().alert().accept();

        driver.findElement(By.xpath("//a[text()='Home ']")).click();

        driver.findElement(By.linkText("Cart")).click();


    }

}
