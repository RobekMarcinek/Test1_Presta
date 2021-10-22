package postwork2;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class GetOrderScreenShot {

    private static WebDriver driver;

    public GetOrderScreenShot(WebDriver driver) {
        this.driver = driver;
    }

    public void screenShot() throws IOException {
        File pic1 = driver.findElement(By.xpath("//section[@id='content']")).getScreenshotAs(OutputType.FILE);
        String path = System.getProperty("User.dir") + "/screenshot/image1.png";
        File PathFile = new File(path);
        FileUtils.copyFile(pic1, PathFile);
        System.out.println("path = " + path);
    }
}
