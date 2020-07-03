package Day10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.BaseDriver;

public class _07_ExplicitWaitExercise extends BaseDriver {

    public static void main(String[] args) {

        driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");

        WebElement clickOn = driver.findElement(By.xpath("//button[text()='Click me to start timer']"));
        clickOn.click();

        WebDriverWait wait = new WebDriverWait(driver, 20);
        WebElement text = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='WebDriver']")));

        System.out.println(text.getText());

    }
}
