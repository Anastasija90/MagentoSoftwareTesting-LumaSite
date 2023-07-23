import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TheBuyingProcessTest extends BaseTest {

    IndexPage indexPage;
    JacketWomenSize jacketWomenSize;
    JacketWomenColorPage jacketWomenColor;
    YogaJacketPage yogaJacket;
    CheckOutPage checkOutPage;

    @BeforeMethod
    public void setUp() {
        driver=browserOpen();
        indexPage=new IndexPage(driver);
        jacketWomenSize=new JacketWomenSize(driver);
        jacketWomenColor=new JacketWomenColorPage(driver);
        yogaJacket=new YogaJacketPage(driver);
        checkOutPage=new CheckOutPage(driver);
    }

    @Test
    public void buyingOneProduts () throws  InterruptedException {

        indexPage.clickWhatsNew();
        indexPage.clickJacket();
        Assert.assertEquals(driver.getCurrentUrl(),"https://magento.softwaretestingboard.com/women/tops-women/jackets-women.html");

        jacketWomenSize.chooseSize();
        Assert.assertEquals(driver.getCurrentUrl(),"https://magento.softwaretestingboard.com/women/tops-women/jackets-women.html?size=168");

        jacketWomenColor.chooseColor();
        jacketWomenColor.clickOnJacket();
        Assert.assertEquals(driver.getCurrentUrl(),"https://magento.softwaretestingboard.com/josie-yoga-jacket.html");

        yogaJacket.clickSize();
        yogaJacket.clickColor();
        yogaJacket.clickButtom();
        Thread.sleep(2000);
        yogaJacket.numberInCart();
        Assert.assertEquals(yogaJacket.messageAdd(), "You added Josie Yoga Jacket to your shopping cart.");
        yogaJacket.proceedToCheckout();
        Thread.sleep(2000);
        Assert.assertEquals(driver.getCurrentUrl(), "https://magento.softwaretestingboard.com/checkout/#shipping");

        Thread.sleep(2000);
        checkOutPage.enterEmail("anastasijasavic@gmail.com");
        checkOutPage.enterName("Anastasija");
        checkOutPage.enterLastName("Savic");
        checkOutPage.enterCompany("RadioOne");
        checkOutPage.enterAddress("Milutina Milankovica");
        checkOutPage.enterCity("Belgrade");
        checkOutPage.enterPostalCode("11000");
        checkOutPage.chooseCountry();
        checkOutPage.enterPhoneNumber("060151515");
        checkOutPage.clickMethods();
        Thread.sleep(4000);
        checkOutPage.clickNext();
        Thread.sleep(5000);
        checkOutPage.clickPlaceOrder();
        checkOutPage.buttonContinueShopping();
        Assert.assertEquals(driver.getCurrentUrl(), "https://magento.softwaretestingboard.com/");
    }

    @AfterMethod
    public void after (){
        driver.quit();
    }

}
