package Day9;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utils.BaseDriver;

public class _05_DragAndDrop extends BaseDriver {

    public static void main(String[] args) {

        driver.get("https://dhtmlx.com/docs/products/dhtmlxTree/");

        WebElement learning = driver.findElement(By.xpath("//span[text()='Learning DHTMLX Suite UI']"));

        Actions actions = new Actions(driver);

        WebElement className = driver.findElement(By.xpath("//ul[@class='dhx_widget dhx_list ']"));

        actions.dragAndDrop(learning , className).perform();

        WebElement two008= driver.findElement(By.xpath("(//li[@dhx_id='Web Development_2008']/div/div)[1]"));
        two008.click();

        WebElement flex = driver.findElement(By.xpath("//span[text()='Flexible Rails']"));

        actions.dragAndDrop(flex , className).perform();

    }
}
