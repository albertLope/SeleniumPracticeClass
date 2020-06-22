package Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _06_practice {

    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "D:\\Selenium dependency\\drivers\\chromedriver.exe");

        // open the browser
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.snapdeal.com/");

        driver.manage().window().maximize();

        driver.findElement(By.id("inputValEnter")).sendKeys("teddybear");

        driver.findElement(By.xpath("//span[text()='Search']")).click();

        Thread.sleep(2000);

        driver.findElement(By.xpath("//label[@for='Brand-Porcupine']")).click();

        Thread.sleep(2000);

        String s1 = driver.findElement(By.xpath("//a[@data-value='Porcupine']")).getText();

        System.out.println(s1);

    }

}
