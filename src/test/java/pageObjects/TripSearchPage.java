package pageObjects;

import driverHolder.DriverHolder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TripSearchPage extends DriverHolder {
    public TripSearchPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getSearchTable() {
        return driver.findElement(By.xpath("//div[@class='col-xs-36 col-md-28']"));
    }
}
