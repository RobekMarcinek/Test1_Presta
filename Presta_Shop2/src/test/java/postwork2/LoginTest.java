package postwork2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;

import java.io.IOException;
import java.util.concurrent.TimeUnit;


public class LoginTest {
    private static WebDriver driver;

    @Before
    public void setUp() {
        // Skonfiguruj sterownik przeglądarki
        System.setProperty("webdriver.opera.driver", "src/test/resources/drivers/operadriver.exe");
        // Uruchom nowy egzemplarz przeglądarki Chrome
        driver = new OperaDriver();
        //Czekamy na przeglądarkę
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        // Zmaksymalizuj okno przeglądarki
        driver.manage().window().maximize();
        // Przejdź do MyStore
        driver.get("https://mystore-testlab.coderslab.pl/index.php");
    }

    @Test
    public void properBuyProcess() throws IOException {
        LoginToAccount LoginToAccount = new LoginToAccount(driver);
        LoginToAccount.signIn("user007@user.pl", "user007");
        AddToCart AddToCart = new AddToCart(driver);
        AddToCart.findStuff("3");
        ProcideToCart ProcideToCart = new ProcideToCart(driver);
        ProcideToCart.proceedToCheckout();
        DeliveryOptions DeliveryOptions = new DeliveryOptions(driver);
        DeliveryOptions.choseDeliveryOpt();
        GetOrderScreenShot Screen = new GetOrderScreenShot(driver);
        Screen.screenShot();

    }

    @After
    public void tearDown() {
//        driver.quit();

    }
}
