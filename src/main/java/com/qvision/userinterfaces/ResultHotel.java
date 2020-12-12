package com.qvision.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class ResultHotel {
    public static final Target PRICE_HOTEL = Target.the("Hotel Price").locatedBy("//p[@class = 'rate-number']");
    public static final Target PRICE_HOTEL_TEXT = Target.the("Hotel Price").locatedBy("//p[contains(text(), '{0}')]");
    public static final Target BOOK_BUTTON = Target.the("Select hotel").locatedBy("//p[text() = '{0}']//ancestor::div[contains(@class, 'night-button')]//child::span[contains(@class, 'button')]");

}
