package postwork2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProcideToCart {


    private static WebDriver driver;

    public ProcideToCart(WebDriver driver) {
        this.driver = driver;
    }

    public void proceedToCheckout() {
        driver.findElement(By.xpath("//a[text()='Proceed to checkout']")).click();
        driver.findElement(By.xpath("//div/a[text()='Proceed to checkout']")).click();
    }
}
