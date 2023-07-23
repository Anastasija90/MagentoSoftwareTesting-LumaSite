import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IndexPage extends BasePage{

    @FindBy (css = "#ui-id-3")
    WebElement navWhatsNew;

    @FindBy (linkText = "Jackets")
    WebElement jacket;



    public IndexPage(ChromeDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }


    public void clickWhatsNew(){
        navWhatsNew.click();
    }
    public void clickJacket(){
        jacket.click();
    }



}