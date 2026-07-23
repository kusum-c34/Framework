package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Log;

    public class LoginPage {
        private final WebDriver driver;
        @FindBy(name="username")
        WebElement usernameInput;
        @FindBy(name="password")
        WebElement passwordInput;
        @FindBy(tagName = "button")
        WebElement loginButton;
        @FindBy(xpath = "")
        WebElement link;

        //constructor
        public LoginPage(WebDriver driver){
            this.driver=driver;
            PageFactory.initElements(driver,this);

        }
        //page actions
        public void enterUsername(String Username){
            Log.info("entering login username");
            usernameInput.clear();
            usernameInput.sendKeys("username");

        }
        public void enterPassword(String Password){
            Log.info("entering login password");
            passwordInput.clear();
            passwordInput.sendKeys(Password);

        }
        public void clickLoginButton(){
            Log.info("clicking on login button");
            loginButton.click();

        }
        public void loginAs(String Username, String Password){
            enterUsername(Username);
            enterPassword(Password);
            clickLoginButton();
        }
    }
