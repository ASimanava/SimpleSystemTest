package driverHolder;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class DriverHolder {
    public WebDriver driver;
    public String url;

    public DriverHolder(WebDriver driver) {
        this.driver = driver;
    }

    public void projectLink() {
        driver.get("https://www.busradar.com/");
    }

    public WebElement findElementByXpath(String xpath) {
        return new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
    }

    public void setConfig() {
        Properties properties = new Properties();
        InputStream input = null;
        String configFile = "src/test/dynamicConfig.properties";
        try {
            input = new FileInputStream(configFile);
            properties.load(input);
            url = properties.getProperty("url");
        } catch (Exception e) {

        }
    }

}
