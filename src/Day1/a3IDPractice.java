package Day1;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class a3IDPractice {

    public static void main(String[] args) throws InterruptedException {

        /*
            We need to use this website for explaining the ID
         */
        System.setProperty("webdriver.chrome.driver", "D:\\Selenium dependency\\drivers\\chromedriver.exe");

        // open the browser
        WebDriver driver = new ChromeDriver();

        driver.get("http://demo.guru99.com/test/login.html");

        driver.manage().window().maximize();

//        We can mention students need to store in the string then create a webelement then click or sendkeys
//          It is long but they need to get used to it. This way will help them in the future.
        String userName = "Techno@gmail.com";
        WebElement emailInput = driver.findElement(By.id("email"));
        emailInput.sendKeys(userName);

        String pass = "qweasd123";
        WebElement passwdInput = driver.findElement(By.id("passwd"));
        passwdInput.sendKeys(pass);

        WebElement signInButton = driver.findElement(By.id("SubmitLogin"));
        signInButton.click();

//      Talk about the Wait -> implicit wait and explicit wait we will learn in the future
        Thread.sleep(2000);

        WebElement successfulElement = driver.findElement(By.tagName("h3"));
        String successfulMessage = successfulElement.getText();
        Assert.assertEquals( "Successfully Logged in...",successfulMessage);

//        How to get the URL from the website
        String URL = driver.getCurrentUrl();

        Assert.assertEquals("http://demo.guru99.com/test/success.html" , URL);

    }

}
