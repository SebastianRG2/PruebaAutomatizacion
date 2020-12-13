package com.qvision.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class BookIn {
    public static final Target TOTAL_PAY = Target.the("Total Pay").locatedBy("(//div[@class = 'sum']//h4[contains(text(), '{0}')])[1]");
}
