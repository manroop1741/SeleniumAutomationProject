package pageObjects;



import java.util.List;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class LoginPage extends BasePage {



   public LoginPage(WebDriver driver) {
        super(driver);
    }



   @FindBy(xpath = "//input[@id='input-email']")
    WebElement txtEmailAddress;



   @FindBy(xpath = "//input[@id='input-password']")
    WebElement txtPassword;



   @FindBy(xpath = "//button[@type='submit']")
    List<WebElement> btnLogin;
   
   @FindBy(xpath = "//input[@type='password']")
   WebElement txtPin;

   @FindBy(xpath = "//button[@type='submit']")
   WebElement submit;

   
    public void setEmail(String email) {
        txtEmailAddress.sendKeys(email);
    }



   public void setPassword(String pwd) {
        txtPassword.sendKeys(pwd);
    }



   public void clickLogin() {
        btnLogin.get(0).click();
    }

   public void setpin(String pin) {
	txtPin.sendKeys(pin);
}

   public void clicksubmit() {
	   submit.click();
   }



}