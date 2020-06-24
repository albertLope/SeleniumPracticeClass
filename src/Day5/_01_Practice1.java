package Day5;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _01_Practice1 {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "D:\\Selenium dependency\\drivers\\chromedriver.exe");

        // open the browser
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/");

        driver.manage().window().maximize();


        WebElement username = driver.findElement(By.id("user-name"));
        username.sendKeys("locked_out_user");

        WebElement password = driver.findElement(By.id("password"));

        password.sendKeys("secret_sauce");

        WebElement buttonLogin = driver.findElement(By.xpath("//input[@class='btn_action']"));
        buttonLogin.click();

        WebElement errorMessage = driver.findElement(By.tagName("h3"));
        String errMessageText = errorMessage.getText();

        Assert.assertEquals("Epic sadface: Sorry, this user has been locked out.",errMessageText );

    }
}
