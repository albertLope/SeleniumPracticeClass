package Day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.BaseDriver;

import java.util.List;
import java.util.Random;

public class _03_SelectDropdownTask extends BaseDriver {

    public static void main(String[] args) {

        driver.get("https://www.amazon.com/");

        WebElement allCategories = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));

        Select s1 = new Select(allCategories);

//        s1.selectByIndex(5);

        List<WebElement> allOptions = s1.getOptions();

        System.out.println(allOptions);

        Random rnd = new Random();

        int randomNumber = rnd.nextInt(allOptions.size());

        s1.selectByIndex(randomNumber);

    }
}
