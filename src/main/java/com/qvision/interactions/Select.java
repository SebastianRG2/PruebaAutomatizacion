package com.qvision.interactions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import java.util.List;
import java.util.stream.Collectors;

import static com.qvision.userinterfaces.ResultHotel.*;

public class Select implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        List<String> listPrice = PRICE_HOTEL.resolveAllFor(actor).stream().map(WebElementFacade::getText).collect(Collectors.toList());
        String price = listPrice.stream().min(String::compareTo).get();
        actor.attemptsTo(Click.on(BOOK_BUTTON.of(price.substring(1))));
    }

    public static Select price() {
        return Tasks.instrumented(Select.class);
    }
}
