package Day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.BaseDriver;

import java.util.List;

public class _02_SelectDropdown extends BaseDriver {
    public static void main(String[] args) throws InterruptedException {


        driver.get("https://www.ebay.com/");

        WebElement allCategories = driver.findElement(By.xpath("//select[@id='gh-cat']"));

        Select select = new Select(allCategories);

        /*
            There are 3 options in the select class
            1) selectByVisibleText choosing by the --> visible text
            2) selectByIndex
            3) selectByValue

            To use this class in selenium there should be select tag in the HTML code.
         */

        select.selectByVisibleText("Books");
        select.selectByIndex(3);
        select.selectByValue("12576");

            List<WebElement> listOfTheOptions =  select.getOptions();



    }
}
