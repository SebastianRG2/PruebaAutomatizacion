package com.qvision.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class HotelSearch {
    public static final Target LOCATION = Target.the("Location").locatedBy("//input[@name = 'location']//ancestor::div[@class='dx-dropdowneditor-input-wrapper dx-selectbox-container']");
    public static final Target LOCATION_CITY = Target.the("Location City").locatedBy("//div[@class = 'dx-item dx-list-item']//div[contains(text(), '{0}')]");
    public static final Target CHECK_IN = Target.the("CHECK IN CALENDAR").locatedBy("//div[starts-with(@class, 'dx-datebox dx-textbox dx-texteditor dx-editor')]//input[@class = 'dx-texteditor-input']");
    public static final Target CHECK_OUT = Target.the("CHECK OUT CALENDAR").locatedBy("//div[starts-with(@class, 'dx-datebox dx-textbox dx-texteditor dx-w')]//input[@class = 'dx-texteditor-input']");
    public static final Target ADULT = Target.the("NUMBER ADULT").locatedBy("//input[@name='adults']//ancestor::div[@class = 'dx-dropdowneditor-input-wrapper dx-selectbox-container']");
    public static final Target ROOM = Target.the("NUMBER ROOM").locatedBy("//input[@name='rooms']//ancestor::div[@class = 'dx-dropdowneditor-input-wrapper dx-selectbox-container']");
    public static final Target CHILDREN = Target.the("NUMBER CHILDREN").locatedBy("//input[@name='children']//ancestor::div[@class = 'dx-dropdowneditor-input-wrapper dx-selectbox-container']");
    public static final Target SELECT_BOX = Target.the("SELECT BOX NUMBER").locatedBy("//div[contains(@class,'dx-overlay-wrapper')]//div[text()='{0}']");
    public static final Target SEARCH = Target.the("SEARCH BUTTON").locatedBy("div[aria-label *= 'SEARCH']");

}
