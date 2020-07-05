package Day13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseDriver;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class _02_UploadAFile extends BaseDriver {

    public static void main(String[] args) throws InterruptedException, AWTException {

        String baseUrl = "http://demo.guru99.com/test/upload/";

        driver.get(baseUrl);

        WebElement uploadElement = driver.findElement(By.xpath("//div[@id='file_wraper0']"));

        uploadElement.click();

//        Copy the text in the line 24 (C:\Users\JuNiOr\Desktop\sifre.txt)  <-- change this path
        StringSelection stringSelection = new StringSelection("C:\\Users\\JuNiOr\\Desktop\\sifre.txt");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection,null);

//        Create a robot class object
        Robot rbt = new Robot();

        Thread.sleep(2000);

        rbt.keyPress(KeyEvent.VK_CONTROL);
        rbt.keyPress(KeyEvent.VK_V);

        Thread.sleep(2000);

        rbt.keyRelease(KeyEvent.VK_CONTROL);
        rbt.keyRelease(KeyEvent.VK_V);

        Thread.sleep(2000);

        rbt.keyPress(KeyEvent.VK_ENTER);
        rbt.keyRelease(KeyEvent.VK_ENTER);

    }
}
