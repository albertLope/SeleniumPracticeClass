package Day6;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class _05_CheckOutFunctionality extends BaseDriver {
    public static void main(String[] args) throws InterruptedException {

        driver.get("https://www.saucedemo.com/");

        String username = "standard_user";
        String password = "secret_sauce";

        _03_XPathLoginFunction.login(username, password);

        List<WebElement> listOfAllElements = driver.findElements(By.xpath("//button[@class='btn_primary btn_inventory']"));

        _04_FindElementsClickOnAllItems.allItems(listOfAllElements);

        driver.findElement(By.xpath("//a[@class='shopping_cart_link fa-layers fa-fw']")).click();

        driver.findElement(By.xpath("//a[text()='CHECKOUT']")).click();

        String[] firstNameList={"John1" ,"" , "John3"};

        String[] lastnamelist={"" ,"Terry2" , "Terry3"};

        String[] zipCodeList={"12345" ,"123456" , ""};

        for(int i =0 ; i < firstNameList.length ; i++){

            WebElement firstName = driver.findElement(By.id("first-name"));
            firstName.sendKeys(firstNameList[i]);

            WebElement lastName = driver.findElement(By.id("last-name"));
            lastName.sendKeys(lastnamelist[i]);

            WebElement zipCode = driver.findElement(By.id("postal-code"));
            zipCode.sendKeys(zipCodeList[i]);

            driver.findElement(By.xpath("//input[@value='CONTINUE']")).click();

            try{

                String s1 = driver.findElement(By.tagName("h3")).getText();

                    if(s1.contains("Error")){
                        firstName.clear();
                        lastName.clear();
                        zipCode.clear();
                    }else{
                        String URL = driver.getCurrentUrl();
                        Assert.assertTrue(URL.contains("step-two"));
                    }

            }catch (NoSuchElementException e ){

                System.out.println("not able to find error message");
            }

        }
    }


    public static void checkOutFunctionality(){



    }
}
