import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class JacketWomenSize extends BasePage {

    @FindBy (xpath = "//div[normalize-space()='Size']")
    WebElement size;

    @FindBy (xpath = "//*[@id=\"narrow-by-list\"]/div[4]/div[1]")
    WebElement color;

    @FindBy (xpath = "//*[@id=\"narrow-by-list\"]/div[5]/div[1]")
    WebElement material;



    public JacketWomenSize(ChromeDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public void chooseSize (){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(size)).click();
        wait.until(ExpectedConditions.visibilityOf
                (driver.findElement(By.xpath("//*[@id=\"narrow-by-list\"]/div[2]/div[2]/div/div/a[3]/div")))).click();
    }
}