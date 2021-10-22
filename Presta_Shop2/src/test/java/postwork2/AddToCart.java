package postwork2;

import org.openqa.selenium.*;

import java.io.IOException;

public class AddToCart {
    private static WebDriver driver;

    public AddToCart(WebDriver driver) {
        this.driver = driver;
    }

    public void findStuff(String howMany) throws IOException {
        driver.findElement(By.id("category-3")).click();
        driver.findElement(By.xpath("//h2/a[text()='Hummingbird printed sweater']")).click();
        driver.findElement(By.id("group_1")).sendKeys("M");
        WebElement amount = driver.findElement(By.id("quantity_wanted"));
        amount.clear();
        amount.sendKeys(howMany);
        driver.findElement(By.xpath("//button[@data-button-action='add-to-cart']")).click();

    }

}

