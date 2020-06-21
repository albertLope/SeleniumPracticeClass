package Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class _04_TagLocatorFindMultipleElements {



    public static void main(String[] args) {

        /*
            We need to let the students know we are going to show the driver.findElements in the future.

            But here is how we can use the tag locator.

         */

        System.setProperty("webdriver.chrome.driver", "D:\\Selenium dependency\\drivers\\chromedriver.exe");

        // open the browser
        WebDriver driver = new ChromeDriver();

        driver.get("https://alloyui.com/examples/datatable/");

        driver.manage().window().maximize();

        List<WebElement> rowCount = driver.findElements(By.tagName("tr"));

        System.out.println(rowCount.size());
    }
}
