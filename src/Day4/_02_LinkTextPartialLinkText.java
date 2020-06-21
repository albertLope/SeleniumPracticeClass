package Day4;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _02_LinkTextPartialLinkText {

    public static void main(String[] args) {

          /*
            We need to use this website for explaining the link text

            While teaching this class we need to teach navigate.back and navigate.forward as well.
         */

        System.setProperty("webdriver.chrome.driver", "D:\\Selenium dependency\\drivers\\chromedriver.exe");

        // open the browser
        WebDriver driver = new ChromeDriver();

        driver.get("http://demo.guru99.com/test/accessing-link.html");

        driver.manage().window().maximize();

        WebElement goHereButton = driver.findElement(By.linkText("go here"));
        goHereButton.click();

        String s1 = driver.getCurrentUrl();
        Assert.assertEquals("https://www.google.com/?gws_rd=ssl" , s1);

        driver.navigate().back();

        WebElement clickHereButton = driver.findElement(By.linkText("click here"));
        clickHereButton.click();

        String s2 = driver.getCurrentUrl();

        Assert.assertEquals("https://www.facebook.com/" , s2);

        driver.navigate().back();

        WebElement AgileProject = driver.findElement(By.partialLinkText("Agile"));
        AgileProject.click();

        String s3 = driver.getCurrentUrl();
        Assert.assertEquals("http://demo.guru99.com/Agile_Project/Agi_V1/" , s3);

    }

}
