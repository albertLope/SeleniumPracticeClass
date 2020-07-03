package Day12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.BaseDriver;

public class _06_ActionsClassPractice extends BaseDriver {

    public static void main(String[] args) throws InterruptedException {

        driver.get("https://www.python.org/community/irc/");

        WebElement BecomeAMember = driver.findElement(By.linkText("Success Stories"));

        Actions actions = new Actions(driver);

        WebDriverWait wait =new WebDriverWait(driver , 10);

        wait.until(ExpectedConditions.elementToBeClickable(BecomeAMember));

        actions.moveToElement(BecomeAMember).perform();

        WebElement Arts = driver.findElement(By.linkText("Arts"));

        Arts.click();

    }
}