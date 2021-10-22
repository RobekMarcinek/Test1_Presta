package postwork2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class DeliveryOptions {

    private static WebDriver driver;

    public DeliveryOptions(WebDriver driver) {
        this.driver = driver;
    }

    public void choseDeliveryOpt() throws IOException {
        driver.findElement(By.xpath("//button[@name='confirm-addresses']")).click();
        driver.findElement(By.xpath("//button[@name='confirmDeliveryOption']")).click();
        driver.findElement(By.xpath("//input[@id='payment-option-1']")).click();
        driver.findElement(By.xpath("//input[@id='conditions_to_approve[terms-and-conditions]']")).click();
        driver.findElement(By.xpath("//button[@class='btn btn-primary center-block']")).click();
    }
}

