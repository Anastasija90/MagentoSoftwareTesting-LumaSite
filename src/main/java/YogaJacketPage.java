import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class YogaJacketPage extends BasePage{

    @FindBy (xpath = "//*[@id=\"option-label-size-143-item-168\"]")
    WebElement sizeYogaJacket;

    @FindBy (xpath ="//*[@id=\"option-label-color-93-item-50\"]")
    WebElement colorYogaJacket;

    @FindBy (xpath = "//*[@id=\"product-addtocart-button\"]")
    WebElement buttom;

    @FindBy (xpath = "/html/body/div[1]/header/div[2]/div[1]/a/span[2]/span[1]")
    WebElement cartNumber;

    @FindBy (xpath = "//*[@id=\"maincontent\"]/div[1]/div[2]/div/div/div")
    WebElement message;

    @FindBy (id = "top-cart-btn-checkout")
    WebElement checkout;

    public YogaJacketPage(ChromeDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public void clickSize(){
        sizeYogaJacket.click();
    }

    public void clickColor (){
        colorYogaJacket.click();
    }

    public void clickButtom(){
        buttom.click();
    }

    public void numberInCart(){
        cartNumber.click();

    }
    public void proceedToCheckout(){
        checkout.click();

    }
    public String messageAdd (){
        return message.getText();
    }
}