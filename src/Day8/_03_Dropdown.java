package Day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utils.BaseDriver;

import java.util.List;
import java.util.Random;

public class _03_Dropdown extends BaseDriver {
    public static void main(String[] args) throws InterruptedException {

      driver.get("https://testsheepnz.github.io/BasicCalculator.html ");

        Random rnd = new Random();

        int random =  rnd.nextInt(100);

        driver.findElement(By.id("number1Field")).sendKeys(String.valueOf(random));

        int random2 =  rnd.nextInt(100);

        driver.findElement(By.id("number2Field")).sendKeys(String.valueOf(random2));

        WebElement drop = driver.findElement(By.id("selectOperationDropdown"));

        Select s1 = new Select(drop);

        int random3 = rnd.nextInt(s1.getOptions().size());

        s1.selectByIndex(random3);

        List<WebElement> dropOptions = driver.findElements(By.xpath("//select[@id='selectOperationDropdown']//option"));

        String str1 = dropOptions.get(random3).getText();

        driver.findElement(By.id("calculateButton")).click();

        Thread.sleep(5000);

        System.out.println(str1);

        if(str1.equals("Add")){
            System.out.println(random + random2);
        }else if(str1.equals("Subtract")){
            System.out.println(random - random2);
        }else if(str1.equals("Multiply")){
             System.out.println( random * random2);
        }else if(str1.equals("Divide")){
            System.out.println(random / random2);
        }else if(str1.equals("Concatenate")){
            System.out.println(String.valueOf(random).concat(String.valueOf(random2)));
        }

    }
}
