package Day4;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _03_ExtraExample {

    public static void main(String[] args) {

        /*
            There are 2 ways to find the elements
            1) id
            2) Css selector

            We should not use Class because of the emailorPhoneNumber input and password input has same class Name that is why we can not use it.

                First give them some time and let them solve it. Then we can show all of them all the ways.

             NOTE: Code is not failing when we use the class name because when we use the class name. It is because if we dont have the password
                I am still able to login to website. Password is typing in the EmailOrPassword input we can show it
         */

        System.setProperty("webdriver.chrome.driver", "D:\\Selenium dependency\\drivers\\chromedriver.exe");

        // open the browser
        WebDriver driver = new ChromeDriver();

        driver.get("http://demo.guru99.com/test/facebook.html");

        driver.manage().window().maximize();

        String email = "testing@gmail.com";
//        WebElement emailOrPhone = driver.findElement(By.id("email"));
        WebElement emailOrPhone = driver.findElement(By.className("inputtext")); //check line 39 it has the same class name
//        WebElement emailOrPhone = driver.findElement(By.cssSelector("input[name='email']"));
        emailOrPhone.sendKeys(email);

        String password = "thisIsValidPassword";
//        WebElement passwordElement = driver.findElement(By.id("pass"));
        WebElement passwordElement = driver.findElement(By.className("inputtext")); //HERE CODE WILL TYPE IN THE EMAILANDPASSWORD BEACUSE OF THE SAME CLASS NAME
//        WebElement passwordElement = driver.findElement(By.cssSelector("input[name='pass']"));
        passwordElement.sendKeys(password);

        WebElement loginButton = driver.findElement(By.id("loginbutton"));
        loginButton.click();

//      Question: How to check URL contains the www.facebook or not

        String url = driver.getCurrentUrl();

        Assert.assertTrue(url.contains("www.facebook"));

    }
}
