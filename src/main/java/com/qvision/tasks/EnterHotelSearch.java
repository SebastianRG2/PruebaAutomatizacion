package com.qvision.tasks;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.Wait;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.hamcrest.Matchers;
import org.openqa.selenium.Keys;

import java.util.Map;

import static com.qvision.userinterfaces.HotelSearch.*;

public class EnterHotelSearch implements Task {
    private Map<String, String> dataTable;

    public EnterHotelSearch(Map<String, String> dataTable) {
        this.dataTable = dataTable;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(LOCATION),
                Click.on(LOCATION_CITY.of(dataTable.get("location"))),
                Click.on(ROOM),
                Click.on(SELECT_BOX.of(dataTable.get("room"))),
                Click.on(ADULT),
                Click.on(SELECT_BOX.of(dataTable.get("adult"))),
                Click.on(CHILDREN),
                Click.on(SELECT_BOX.of(dataTable.get("children"))),
                Enter.theValue(dataTable.get("checkIn")).into(CHECK_IN).thenHit(Keys.ENTER),
                Enter.theValue(dataTable.get("checkOut")).into(CHECK_OUT).thenHit(Keys.ENTER),
                Click.on(SEARCH));
    }

    public static EnterHotelSearch data(Map<String, String> dataTable) {
        return Tasks.instrumented(EnterHotelSearch.class, dataTable);
    }
}
