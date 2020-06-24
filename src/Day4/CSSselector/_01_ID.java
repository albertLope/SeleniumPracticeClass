package Day4.CSSselector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _01_ID {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "D:\\Selenium dependency\\drivers\\chromedriver.exe");

        // open the browser
        WebDriver driver = new ChromeDriver();

        driver.get("https://formsmarts.com/form/yu?mode=h5");

        driver.manage().window().maximize();

        driver.findElement(By.cssSelector("#u_e8l_4586_0")).click();

        driver.findElement(By.cssSelector("#u_e8l_89585_1")).click();

        String s1 = driver.findElement(By.cssSelector("#u_e8l_89586")).getText();

        System.out.println(s1);

    }

}
