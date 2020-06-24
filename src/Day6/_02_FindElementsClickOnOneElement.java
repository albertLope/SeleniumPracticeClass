package Day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.BaseDriver;

import java.util.List;

public class _02_FindElementsClickOnOneElement extends BaseDriver {
    public static void main(String[] args) {

        driver.get("https://www.saucedemo.com/");

        String username = "standard_user";
        String password = "secret_sauce";

        _03_XPathLoginFunction.login(username , password);

        List<WebElement> listOfAllElements = driver.findElements(By.xpath("//div[@class='inventory_item_name']"));

        String whichElementToClick = "Sauce Labs Backpack";
        whichItem(listOfAllElements ,whichElementToClick );

        listOfAllElements = driver.findElements(By.xpath("//div[@class='inventory_item_name']"));
        whichElementToClick = "Sauce Labs Bike Light";
        whichItem(listOfAllElements ,whichElementToClick );

        listOfAllElements = driver.findElements(By.xpath("//div[@class='inventory_item_name']"));
        whichElementToClick = "Sauce Labs Bolt T-Shirt";
        whichItem(listOfAllElements ,whichElementToClick );
    }

    public static void whichItem(List<WebElement> elementList , String whichElement){

        for(WebElement eachElement:elementList){

            if(eachElement.getText().equalsIgnoreCase(whichElement)){
                eachElement.click();
                driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
                driver.navigate().back();
                break;
            }
        }

    }


}
