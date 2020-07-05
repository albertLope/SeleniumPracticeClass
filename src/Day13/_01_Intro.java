package Day13;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeOptions;
import utils.BaseDriver;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.HashMap;

public class _01_Intro extends BaseDriver {

    public static void main(String[] args) throws InterruptedException, AWTException {

        driver.get("https://www.cleartrip.com/");

        Robot rbt = new Robot();

        Thread.sleep(2000);

        rbt.keyPress(KeyEvent.VK_TAB);
        rbt.keyRelease(KeyEvent.VK_TAB);

        Thread.sleep(2000);

        rbt.keyPress(KeyEvent.VK_TAB);
        rbt.keyRelease(KeyEvent.VK_TAB);

        Thread.sleep(2000);

        rbt.keyPress(KeyEvent.VK_TAB);
        rbt.keyRelease(KeyEvent.VK_TAB);
        Thread.sleep(2000);

        rbt.keyPress(KeyEvent.VK_ENTER);
        rbt.keyRelease(KeyEvent.VK_ENTER);


    }
}
