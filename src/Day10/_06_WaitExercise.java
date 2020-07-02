package Day10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.BaseDriver;

import java.util.concurrent.TimeUnit;

public class _06_WaitExercise extends BaseDriver {

    public static void main(String[] args) {

//        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");

        WebDriverWait wait = new WebDriverWait(driver, 20);

        WebElement clickOn = driver.findElement(By.xpath("//button[text()='Click me to start timer']"));

        clickOn.click();

        WebElement text = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='WebDriver']")));

//        WebElement text = driver.findElement(By.xpath("//p[text()='WebDriver']"));

        System.out.println(text.getText());

    }
}
