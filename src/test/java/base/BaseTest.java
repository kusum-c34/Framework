package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class BaseTest {
        protected WebDriver driver;
        public WebDriver getDriver() {

            return driver;
        }
       @BeforeClass

        public  void setup(){
            //Log.info("Launching Chrome...");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            //Open base URL here
           driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        }
    }


