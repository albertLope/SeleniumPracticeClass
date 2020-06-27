package Day6;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseDriver;

import java.util.ArrayList;
import java.util.List;

public class _04_FindElementsClickOnAllItems extends BaseDriver {
    public static void main(String[] args) {

        driver.get("https://www.saucedemo.com/");

        String username = "standard_user";
        String password = "secret_sauce";

        _01_XPathLoginFunctionTest.login(username, password);

        List<WebElement> listOfAllElements = driver.findElements(By.xpath("//button[@class='btn_primary btn_inventory']"));

        allItems(listOfAllElements);

        List<WebElement> getTheNameOfTheElements = driver.findElements(By.xpath("//div[@class='inventory_item_name']"));

        List<String> strElementsItemPage =  changeWebElemetnsToStrings(getTheNameOfTheElements);

        driver.findElement(By.xpath("//a[@class='shopping_cart_link fa-layers fa-fw']")).click();

        List<WebElement> namesInTheCart = driver.findElements(By.xpath("//div[@class='inventory_item_name']"));

        List<String> strElementsCartPage=  changeWebElemetnsToStrings(namesInTheCart);
        checkFirstListContainsSecondList(strElementsItemPage , strElementsCartPage);

        List<WebElement> removeElements =driver.findElements(By.xpath("//button[@class='btn_secondary cart_button']"));
        allItems(removeElements);

    }

    public static void allItems(List<WebElement> elementList){

        for(int i = 0 ; i<elementList.size(); i++){
            elementList.get(i).click();
        }
    }

    public static void checkFirstListContainsSecondList(List<String> l1 ,List<String> l2 ){

        for(int i = 0 ; i < l1.size() ; i++){

            Assert.assertEquals(l1.get(i) , l2.get(i));
        }
    }

    public static List<String> changeWebElemetnsToStrings(List<WebElement> e1){

        List<String> listOfAllElements = new ArrayList<>();

        for(WebElement eachElement : e1){
            listOfAllElements.add(eachElement.getText());
        }

    return listOfAllElements;

    }



}
