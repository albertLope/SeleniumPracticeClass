package Day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseDriver;

public class _02_ExtraMethods extends BaseDriver {

    public static void main(String[] args) {

        driver.get("https://www.snapdeal.com/");

//         get tag name
        WebElement tagName = driver.findElement(By.xpath("//button[@class='searchformButton col-xs-4 rippleGrey']"));

        System.out.println(tagName.getTagName());

//         get page source
//        String s1 = driver.getPageSource();

//        System.out.println(s1);

        System.out.println("Color of a button before mouse hover: "	+ tagName.getCssValue("color"));

        System.out.println("font-size of a button before mouse hover: "	+ tagName.getCssValue("font-size"));

        System.out.println("background-color of a button before mouse hover: "	+ tagName.getCssValue("background-color"));

       /* INTERVIEW QUESTION

          close vs quit
            Close is closing the current page.

            Quit is closing the browser.

        */






    }
}
