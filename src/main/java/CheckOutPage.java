import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


class CheckOutPage extends BasePage {

    @FindBy(css = "body > div:nth-child(4) > main:nth-child(2) > div:nth-child(3) > div:nth-child(1) > div:nth-child(3) > div:nth-child(5) > ol:nth-child(1) > li:nth-child(1) > div:nth-child(2) > form:nth-child(1) > fieldset:nth-child(1) > div:nth-child(1) > div:nth-child(2) > input:nth-child(1)")
    WebElement email;


    @FindBy(xpath = "/html/body/div[1]/main/div[2]/div/div[2]/div[4]/ol/li[1]/div[2]/form[2]/div/div[1]/div/input")
    WebElement firstName;

    @FindBy(xpath = "/html/body/div[1]/main/div[2]/div/div[2]/div[4]/ol/li[1]/div[2]/form[2]/div/div[2]/div/input")
    WebElement lastName;

    @FindBy(xpath = "//*[@id='shipping-new-address-form']/div[3]/div/input")
    WebElement company;
    @FindBy(xpath = "//li//input[@name='street[0]']")
    WebElement address;

    @FindBy(xpath = "//input[@name='city']")
    WebElement city;


    @FindBy(xpath = "//input[@name='postcode']")
    WebElement postalCode;

    @FindBy(xpath = "//select[@name='country_id']")
    WebElement country;

    @FindBy(xpath = "//*[@id='shipping-new-address-form']/div[9]/div/input")
    WebElement phoneNumber;

    @FindBy(xpath = "//input[@name='ko_unique_2']")
    WebElement shippingMethods;
    @FindBy(xpath = "/html/body/div[1]/main/div[2]/div/div[2]/div[4]/ol/li[2]/div/div[3]/form/div[3]/div/button")
    WebElement buttonNext;

    @FindBy(xpath = "/html/body/div[2]/main/div[2]/div/div[2]/div[4]/ol/li[3]/div/form/fieldset/div[1]/div/div/div[2]/div[2]/div[4]/div/button")
    WebElement buttonOrder;

    @FindBy(xpath = "//*[@id=\"maincontent\"]/div[1]/h1/span")
    WebElement message;
    @FindBy(xpath = "/html/body/div[1]/main/div[3]/div/div[2]/div/div/a")
    WebElement continueButton;


    public CheckOutPage(ChromeDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void enterEmail(String mail) {
        email.sendKeys(mail);
    }

    public void enterName(String name) {
        firstName.sendKeys(name);
    }

    public void enterLastName(String lastname) {
        lastName.sendKeys(lastname);
    }

    public void enterCompany(String currentCompany) {
        company.sendKeys(currentCompany);
    }

    public void enterAddress(String street) {

        address.sendKeys(street);
    }

    public void enterCity(String town) {
        city.sendKeys(town);
    }


    public void enterPostalCode(String zip) {
        postalCode.sendKeys(zip);
    }

    public void chooseCountry() {
        Select con = new Select(country);
        con.selectByValue("BO");
    }

    public void enterPhoneNumber(String phone) {
        phoneNumber.sendKeys(phone);
    }

    public void clickMethods() {
        Actions actions = new Actions(driver);
        actions.click(shippingMethods).perform();
    }

    public void clickNext() {
        buttonNext.submit();
    }

    public void clickPlaceOrder() {
        Actions order = new Actions(driver);
        order.click(buttonOrder).perform();
    }

    public String getMessage() {
        return message.getText();

    }

    public void buttonContinueShopping() {
        continueButton.click();
    }

}

