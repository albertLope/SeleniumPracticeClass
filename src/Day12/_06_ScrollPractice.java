package Day12;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import utils.BaseDriver;

import java.util.List;

public class _06_ScrollPractice extends BaseDriver {

    public static void main(String[] args) {

        driver.get("https://www.hotels.com/search.do?resolved-location=CITY%3A1496137%3AUNKNOWN%3AUNKNOWN&destination-id=1496137&q-destination=Atlanta,%20Georgia,%20United%20States%20of%20America&q-check-in=2020-07-04&q-check-out=2020-07-05&q-rooms=1&q-room-0-adults=2&q-room-0-children=0&sort-order=STAR_RATING_HIGHEST_FIRST");

        List<WebElement> l1 = driver.findElements(By.className("property-name-link"));

        while(l1.size()<100){
            JavascriptExecutor js = (JavascriptExecutor) driver;

            js.executeScript("arguments[0].scrollIntoView();", l1.get(l1.size()-1));

            l1 = driver.findElements(By.className("property-name-link"));
            System.out.println(l1.size());

        }

        System.out.println(l1.get(l1.size()-1).getText());

    }
}
