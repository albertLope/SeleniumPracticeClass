package Day3;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _03IDClassCSSTask {

    public static void main(String[] args) {

        /*
            Task here is:

                 Navigate to https://www.seleniumeasy.com/test/basic-first-form-demo.html

                 Enter the message (Hello World)

                 Click on show message

                 Message should be displayed in the "Your Message: Hello World"

         */
        System.setProperty("webdriver.chrome.driver", "D:\\Selenium dependency\\drivers\\chromedriver.exe");

        // open the browser
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");

        String messageText = "Hello world";
        WebElement messageInput = driver.findElement(By.id("user-message"));
        messageInput.sendKeys(messageText);

        WebElement buttonShowMessage = driver.findElement(By.cssSelector("button[onclick='showInput();']"));
        buttonShowMessage.click();

        WebElement yourMessageElement = driver.findElement(By.id("display"));
        String yourMessageText = yourMessageElement.getText();

        Assert.assertEquals(messageText ,yourMessageText);

    }
}
