import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class BaseTest {

    ChromeDriver driver;
    public ChromeDriver browserOpen(){
        ChromeDriver driver=new ChromeDriver();
        driver.navigate().to("https://magento.softwaretestingboard.com/?ref=hackernoon.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        return driver;
    }
}