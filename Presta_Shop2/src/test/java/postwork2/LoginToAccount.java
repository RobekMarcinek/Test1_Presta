package postwork2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginToAccount {
    private static WebDriver driver;

    public LoginToAccount(WebDriver driver) {
        this.driver = driver;
    }

    public void signIn(String userName, String password) {
        WebElement element = driver.findElement(By.xpath("//a/span[@class='hidden-sm-down']"));
        element.click();
        driver.findElement(By.className("form-control")).sendKeys(userName);
        driver.findElement(By.xpath("//div/input[@name='password']")).sendKeys(password);
        driver.findElement(By.xpath("//button[@id='submit-login']")).click();
    }
}
