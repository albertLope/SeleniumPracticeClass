package Day12;

import org.openqa.selenium.JavascriptExecutor;
import utils.BaseDriver;

public class _05_ScrollToBottomOfThePagePractice extends BaseDriver {

    public static void main(String[] args) {

        driver.get("https://www.etsy.com/");

        driver.manage().window().maximize();

        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");

    }

}
