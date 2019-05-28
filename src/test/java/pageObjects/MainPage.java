package pageObjects;

import driverHolder.DriverHolder;
import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage extends DriverHolder {
    public MainPage(WebDriver driver) {
        super(driver);
    }


    public WebElement getFromField() {
        return driver.findElement(By.xpath("//input[@id='from-input']"));
    }

    public WebElement getToField() {
        return driver.findElement(By.xpath("//input[@id='to-input']"));
    }

    public WebElement getFindTripButton() {
        return driver.findElement(By.xpath("//button[@class='button button-orange button-big has-search-form-focus']"));
    }

    public WebElement getBookingSwitch() {
        return driver.findElement(By.xpath("//span[@id='booking-switch']"));
    }

    public WebElement getDepartureCalendar() {
        return driver.findElement(By.xpath("//input[@id='When']"));
    }

    public TripSearchPage goTripSearchPage() {
        projectLink();
        getFromField().sendKeys("Munich");
        getToField().sendKeys("Venice");
        getDepartureCalendar().clear();
        getDepartureCalendar().sendKeys("Wed 05 Jun");
        getFindTripButton().sendKeys(Keys.ENTER);
        return new TripSearchPage(driver);
    }
}
