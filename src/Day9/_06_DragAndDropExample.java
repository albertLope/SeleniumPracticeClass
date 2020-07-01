package Day9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import utils.BaseDriver;

public class _06_DragAndDropExample extends BaseDriver {

    public static void main(String[] args) {


        WebDriver driver;

        driver = new ChromeDriver();

        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

        driver.manage().window().maximize();

        Actions action = new Actions(driver);

        WebElement Rome = driver.findElement(By.id("box6"));

        WebElement Italy = driver.findElement(By.id("box106"));

        action.dragAndDrop(Rome, Italy).perform();

        WebElement Washington = driver.findElement(By.id("box3"));

        WebElement US = driver.findElement(By.id("box103"));

        action.dragAndDrop(Washington , US).perform();

    }
}
