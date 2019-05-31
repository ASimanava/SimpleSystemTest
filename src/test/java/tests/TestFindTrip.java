package tests;

import org.junit.Test;
import pageObjects.MainPage;
import pageObjects.TripSearchPage;

import static org.junit.Assert.assertTrue;

public class TestFindTrip extends TestInit {

    @Test
    public void chooseTrip() {

        /*MainPage mainPage = new MainPage(driver);


        TripSearchPage tripSearchPage = mainPage.goTripSearchPage();
        sleep(3000);

        assertTrue(tripSearchPage.getSearchTable().isDisplayed());*/
        sleep(500);
        sleep(100);
        MainPage mainPage = new MainPage(driver);
        sleep(100);

        sleep(100);
        TripSearchPage tripSearchPage = mainPage.goTripSearchPage();
        sleep(3000);
        sleep(100);
        sleep(100);
        assertTrue(tripSearchPage.getSearchTable().isDisplayed());
        sleep(100);

    }

}
