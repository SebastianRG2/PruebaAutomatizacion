package com.qvision.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/hotel_price_pages.feature",
        glue = "com.qvision.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class HotelPricePages {
}
