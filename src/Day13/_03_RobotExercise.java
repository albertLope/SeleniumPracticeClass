package Day13;

import utils.BaseDriver;

import java.awt.*;
import java.awt.event.KeyEvent;

public class _03_RobotExercise extends BaseDriver {

    public static void main(String[] args) throws InterruptedException, AWTException {

        driver.get("https://www.etsy.com/");

        Robot rbt = new Robot();

        rbt.keyPress(KeyEvent.VK_CONTROL);
        rbt.keyPress(KeyEvent.VK_S);

        Thread.sleep(2000);
        rbt.keyRelease(KeyEvent.VK_CONTROL);

        rbt.keyPress(KeyEvent.VK_ENTER);

    }

}
