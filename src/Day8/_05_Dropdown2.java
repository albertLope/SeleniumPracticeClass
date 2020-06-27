package Day8;

import Day6._01_XPathLoginFunctionTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.BaseDriver;


import java.util.ArrayList;
import java.util.List;

public class _05_Dropdown2 extends BaseDriver {

    public static void main(String[] args) throws InterruptedException {

        driver.get("https://www.saucedemo.com/");

        _01_XPathLoginFunctionTest.login("standard_user","secret_sauce");

        WebElement e1 = driver.findElement(By.className("product_sort_container"));

        Select s1 = new Select(e1);

        s1.selectByVisibleText("Price (high to low)");

        List<WebElement> l1 = driver.findElements(By.className("inventory_item_price"));

        ArrayList<Double> d1 = new ArrayList<>();

        for(int i =0 ; i < l1.size() ; i++){

            String num = l1.get(i).getText();

            num = num.replaceAll("[^\\d.]","");

            double dd = Double.parseDouble(num);

            d1.add(dd);
        }

        for(int i = 0 ; i < d1.size()-1; i++){

            if(d1.get(i)>=d1.get(i+1)){
                System.out.println("good");
            }else{
                System.out.println("no good");
            }

        }



    }

}
