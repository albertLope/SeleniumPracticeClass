package Day6;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseDriver;

import java.util.ArrayList;
import java.util.List;

public class _06_CheckOutStep2FunctionalTesting extends BaseDriver {
    public static void main(String[] args) throws InterruptedException {

        driver.get("https://www.saucedemo.com/");

        String username = "standard_user";
        String password = "secret_sauce";

        _01_XPathLoginFunctionTest.login(username, password);

        List<WebElement> listOfAllElements = driver.findElements(By.xpath("//button[@class='btn_primary btn_inventory']"));

        _04_FindElementsClickOnAllItems.allItems(listOfAllElements);

        driver.findElement(By.xpath("//a[@class='shopping_cart_link fa-layers fa-fw']")).click();

        driver.findElement(By.xpath("//a[text()='CHECKOUT']")).click();

        WebElement firstName = driver.findElement(By.id("first-name"));
        firstName.sendKeys("David");

        WebElement lastName = driver.findElement(By.id("last-name"));
        lastName.sendKeys("Villa");

        WebElement zipCode = driver.findElement(By.id("postal-code"));
        zipCode.sendKeys("12345");

        driver.findElement(By.xpath("//input[@value='CONTINUE']")).click();

        List<WebElement> priceList = driver.findElements(By.xpath("//div[@class='inventory_item_price']"));

        List<Double> doubleListPrice = new ArrayList<>();

        double total = 0;

        for(int i = 0 ; i<priceList.size() ; i++){

            doubleListPrice.add(changeStringToDouble(priceList.get(i).getText()));

            total += doubleListPrice.get(i);
        }

        WebElement ItemTotal = driver.findElement(By.xpath("//div[@class='summary_subtotal_label']"));
        String ItemTotalStr = ItemTotal.getText();

        double TotalDouble = changeStringToDouble(ItemTotalStr);

        Assert.assertTrue(total == TotalDouble);

    }

    public static double changeStringToDouble(String myString){

        myString = myString.replaceAll("[^\\d.]",""); // remove all the non numeric char (letter or special character)

        double myD = Double.parseDouble(myString);

        return myD;

    }
}
