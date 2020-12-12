package com.qvision.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

import static io.cucumber.junit.CucumberOptions.*;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/hotel_price.feature",
        glue = "com.qvision.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)
public class HotelPrice {
}
