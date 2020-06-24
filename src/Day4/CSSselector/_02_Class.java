package Day4.CSSselector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _02_Class {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "D:\\Selenium dependency\\drivers\\chromedriver.exe");

        // open the browser
        WebDriver driver = new ChromeDriver();

        driver.get("https://formsmarts.com/form/yu?mode=h5");

        driver.manage().window().maximize();

//        String continueButton = driver.findElement(By.cssSelector(".five columns")).getText();
//
//        System.out.println(continueButton);



        driver.findElement(By.cssSelector("input[placeholder='URL of your website'][type=URL]")).sendKeys("google.com");

        /*
            Tags
            input.u-full-width[type=text] equal to input[class=' u-full-width'][type=text]

            input.u-full-width[placeholder='Your email']  input[class=' u-full-width'][placeholder='Your email']
         */




    }
}
