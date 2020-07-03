package Day12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.BaseDriver;

import java.util.concurrent.TimeUnit;

public class _07_ActionClassPractice2 extends BaseDriver {

    public static void main(String[] args) throws InterruptedException {

//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebDriverWait wait =new WebDriverWait(driver , 10);

        driver.get("https://www.yogaalliance.org/");

        WebElement covidMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Notice']")));

        wait.until(ExpectedConditions.visibilityOf(covidMessage));

        WebElement BecomeAMember = driver.findElement(By.linkText("Become a Member"));

        Actions actions = new Actions(driver);

        actions.moveToElement(BecomeAMember).perform();

        Thread.sleep(1000);

        WebElement teacher = driver.findElement(By.xpath("//li[@class='category child-3']/a[text()='Teachers']"));

        teacher.click();

        System.out.println(driver.getCurrentUrl());

        driver.quit();

    }
}
