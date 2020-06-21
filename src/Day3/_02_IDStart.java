package Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _02_IDStart {

    public static void main(String[] args) throws InterruptedException {

        /*
            We need to use this website for explaining the ID

         */
        System.setProperty("webdriver.chrome.driver" , "D:\\Selenium dependency\\drivers\\chromedriver.exe");

        // open the browser
        WebDriver driver = new ChromeDriver();

        driver.get("http://www.practiceselenium.com/");

        driver.manage().window().maximize();

        String s1= driver.findElement(By.id("wsb-element-00000000-0000-0000-0000-000450914887")).getText();

        System.out.println(s1);

        String s2= driver.findElement(By.id("wsb-element-00000000-0000-0000-0000-000450914886")).getText();

        System.out.println(s2);

    }
}
