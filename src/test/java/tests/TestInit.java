package tests;

import driverHolder.DriverHolder;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TestInit {
    public WebDriver driver;

    @Before
    public void setUpChrome() {
        if (System.getProperty("os.name").toLowerCase().contains("win")){
            System.setProperty("webdriver.chrome.driver", "src/resources/chromedriver_win.exe");
        }else {
            System.setProperty("webdriver.chrome.driver", "src/resources/chromedriver_mac");
        }
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //Явное ожидание. Ждет пояаление эл-та
    }

    @After
    public void tierDown() {
        driver.quit();
    }

    public void sleep(int msec) {
        try {
            Thread.sleep(msec);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
