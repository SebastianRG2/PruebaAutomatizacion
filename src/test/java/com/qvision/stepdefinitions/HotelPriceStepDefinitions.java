package com.qvision.stepdefinitions;

import com.qvision.tasks.EnterHotelSearch;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.Map;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class HotelPriceStepDefinitions {

    @Before
    public void prepareStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^What (.*) enters the hotel data to search$")
    public void whatCarolinaEntersTheHotelDataToSearch(String nameActor, Map<String, String> dataList ) {
        theActorCalled(nameActor).wasAbleTo(Open.url("https://js.devexpress.com/Demos/DXHotels/#home"),
                EnterHotelSearch.data(dataList));
    }

    @When("Enter the hotel with the lowest price")
    public void enterTheHotelWithTheLowestPrice() {
    }

    @Then("Will visualize that the price to be charged to the client is the agreed")
    public void willVisualizeThatThePriceToBeChargedToTheClientIsTheAgreed() {

    }
}
