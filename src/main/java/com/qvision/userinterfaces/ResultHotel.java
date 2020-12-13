package com.qvision.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class ResultHotel {
    public static final Target PRICE_HOTEL = Target.the("Hotel Price").locatedBy("//p[@class = 'rate-number']");
    public static final Target PAGE_INDEX = Target.the("Number of page").locatedBy("//div[@class = 'number-page']//p[contains(text(),'{0}')]");
    public static final Target BOOK_BUTTON = Target.the("Select hotel ").locatedBy("(//p[contains(text(),'{0}')]//ancestor::div[contains(@class, 'night-button')]//child::div[contains(@class, 'button-con')])[1]");

}
