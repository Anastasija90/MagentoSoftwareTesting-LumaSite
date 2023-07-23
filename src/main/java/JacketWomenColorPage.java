import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class JacketWomenColorPage extends BasePage{

    @FindBy (xpath = "//div[normalize-space()='Color']")
    WebElement color;

    @FindBy (xpath = "//*[@id=\"maincontent\"]/div[3]/div[1]/div[3]/ol/li[6]/div/div/strong/a")
    WebElement pickUp;

    public JacketWomenColorPage(ChromeDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public void chooseColor() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(color)).click();
        wait.until(ExpectedConditions.visibilityOf
                (driver.findElement(By.xpath("//a[@aria-label='Blue']//div[contains(@class,'swatch-option color')]")))).click();
    }

    public void clickOnJacket(){
        pickUp.click();
    }

}