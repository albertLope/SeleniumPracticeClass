package Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class a7CssSelector {

    public static void main(String[] args) {

         /*
            We need to use this website for explaining the CSS selector

            Mention: Show couple of them how to find in the css selector and let them find the rest.

         */
        System.setProperty("webdriver.chrome.driver", "D:\\Selenium dependency\\drivers\\chromedriver.exe");

        // open the browser
        WebDriver driver = new ChromeDriver();

        driver.get("http://newtours.demoaut.com/mercurywelcome.php");

        driver.manage().window().maximize();

        WebElement registerButton = driver.findElement(By.linkText("REGISTER"));
        registerButton.click();

        String fName = "SomeOne";
        WebElement firstName = driver.findElement(By.cssSelector("input[name='firstName']"));
        firstName.sendKeys(fName);

        String lName = "butNotYou";
        WebElement LastName = driver.findElement(By.cssSelector("input[name='lastName']"));
        LastName.sendKeys(lName);

        String phone = "8625896898";
        WebElement phoneElement = driver.findElement(By.cssSelector("input[name='phone']"));
        phoneElement.sendKeys(phone);

        String email = "Test@gmail.com";
        WebElement emailElement = driver.findElement(By.id("userName"));
        emailElement.sendKeys(email);

        String address1 = "123 Main";
        WebElement address1Element = driver.findElement(By.cssSelector("input[name='address1']"));
        address1Element.sendKeys(address1);

        String address2 = "123 Main";
        WebElement address2Element = driver.findElement(By.cssSelector("input[name='address2']"));
        address2Element.sendKeys(address2);

        String city = "Far far away";
        WebElement cityElement = driver.findElement(By.cssSelector("input[name='city']"));
        cityElement.sendKeys(city);

        String state = "Not that far state";
        WebElement stateElement = driver.findElement(By.cssSelector("input[name='state']"));
        stateElement.sendKeys(state);

        String postalCode = "Not that far state";
        WebElement postalCodeElement = driver.findElement(By.cssSelector("input[name='postalCode']"));
        postalCodeElement.sendKeys(postalCode);

        String uName = "unknown";
        WebElement UserNameElement = driver.findElement(By.id("email"));
        UserNameElement.sendKeys(uName);

        String password = "Hi^^%^&$12";
        WebElement passwordElement = driver.findElement(By.cssSelector("input[name='password']"));
        passwordElement.sendKeys(password);

        WebElement confirmPasswordElement = driver.findElement(By.cssSelector("input[name='confirmPassword']"));
        confirmPasswordElement.sendKeys(password);

        WebElement submitButton = driver.findElement(By.cssSelector("input[type='image']"));
        submitButton.click();

    }

}
