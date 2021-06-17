package tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BookingTest extends BaseTest
{
    @Test
    public void bookingSearchTest() throws InterruptedException

    {
        driver.get("https://www.booking.com/");
        WebElement enterDestinationField = driver.findElement(By.id("ss"));
        enterDestinationField.sendKeys("Paris");
        WebElement selectDates = driver.findElement(By.cssSelector("#frm > div.xp__fieldset.js--sb-fieldset.accommodation > div.xp__dates.xp__group > div.xp__dates-inner > div:nth-child(2) > div > div > div > div > span"));
        selectDates.click();
        WebElement slideArrow = driver.findElement(By.cssSelector("#frm > div.xp__fieldset.js--sb-fieldset.accommodation > div.xp__dates.xp__group > div.xp-calendar > div > div > div.bui-calendar__control.bui-calendar__control--next > svg"));
        slideArrow.click();
        slideArrow.click();
        slideArrow.click();
        WebElement checkIn = driver.findElement(By.cssSelector("#frm > div.xp__fieldset.js--sb-fieldset.accommodation > div.xp__dates.xp__group > div.xp-calendar > div > div > div.bui-calendar__content > div:nth-child(2) > table > tbody > tr:nth-child(4) > td:nth-child(2) > span > span"));
        checkIn.click();
        WebElement checkOut = driver.findElement(By.cssSelector("#frm > div.xp__fieldset.js--sb-fieldset.accommodation > div.xp__dates.xp__group > div.xp-calendar > div > div > div.bui-calendar__content > div:nth-child(2) > table > tbody > tr:nth-child(5) > td:nth-child(1) > span > span"));
        checkOut.click();
        WebElement guestsField = driver.findElement(By.className("xp__guests__count"));
        guestsField.click();
        WebElement children = driver.findElement(By.cssSelector("#xp__guests__inputs-container > div > div > div.sb-group__field.sb-group-children > div > div.bui-stepper__wrapper.sb-group__stepper-a11y > button.bui-button.bui-button--secondary.bui-stepper__add-button"));
        children.click();
        WebElement searchButton = driver.findElement(By.cssSelector("#frm > div.xp__fieldset.js--sb-fieldset.accommodation > div.xp__button > div.sb-searchbox-submit-col.-submit-button > button"));
        searchButton.click();
        WebElement hotelSelect = driver.findElement(By.cssSelector("#hotellist_inner > div:nth-child(1) > div.sr_item_content.sr_item_content_slider_wrapper > div.sr_property_block_main_row > div.sr_item_main_block > div.sr-hotel__title-wrap > h3 > a > span.sr-hotel__name"));
        hotelSelect.click();
        
        Thread.sleep(5000);
    }

}




