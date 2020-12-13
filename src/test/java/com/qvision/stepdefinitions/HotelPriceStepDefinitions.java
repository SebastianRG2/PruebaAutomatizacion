package com.qvision.stepdefinitions;

import com.qvision.exceptions.ExceptionError;
import com.qvision.questions.TotalPrice;
import com.qvision.tasks.EnterHotelSearch;
import com.qvision.tasks.Result;
import com.qvision.tasks.ResultPages;
import com.qvision.utils.MsgError;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.Map;

import static com.qvision.userinterfaces.BookIn.TOTAL_PAY;
import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.*;

public class HotelPriceStepDefinitions {

    @Before
    public void prepareStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^What (.*) enters the hotel data to search$")
    public void whatCarolinaEntersTheHotelDataToSearch(String nameActor, Map<String, String> dataList) {
        theActorCalled(nameActor).wasAbleTo(Open.url("https://js.devexpress.com/Demos/DXHotels/#home"),
                EnterHotelSearch.data(dataList));
    }

    @When("^Enter the hotel with the lowest price$")
    public void enterTheHotelWithTheLowestPrice() {
        theActorInTheSpotlight().attemptsTo(Result.hotel());
    }

    @When("^Enter the hotel pages with the lowest price$")
    public void enterTheHotelPagesWithTheLowestPrice() {
        theActorInTheSpotlight().attemptsTo(ResultPages.hotel());
    }

    @Then("^Will visualize that the (.*) to be charged to the client is the agreed$")
    public void willVisualizeThatTheToBeChargedToTheClientIsTheAgreed(String price) {
        theActorInTheSpotlight().should(seeThat(TotalPrice.succesfully(TOTAL_PAY.of(price)), containsString(price)).
                orComplainWith(ExceptionError.class, MsgError.MSG_VALUE_ERROR.getMsg()));
    }
}
