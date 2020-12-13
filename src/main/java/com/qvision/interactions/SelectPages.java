package com.qvision.interactions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static com.qvision.userinterfaces.ResultHotel.*;

public class SelectPages implements Interaction {
    private int numberPages;

    public SelectPages(int numberPages) {
        this.numberPages = numberPages;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        int numberPagesAux = numberPages+1;
        List<String> listPrice = new ArrayList<>();

        for (int i = 0; i < numberPages; i++) {
            List<String> listPriceAux = PRICE_HOTEL.resolveAllFor(actor).stream().map(WebElementFacade::getText).collect(Collectors.toList());
            listPrice.add(listPriceAux.get(0));
            listPrice.add(listPriceAux.get(1));
            listPrice.add(listPriceAux.get(2));
            actor.attemptsTo(Click.on(PAGE_INDEX.of(String.valueOf(numberPagesAux))));
            if(numberPagesAux != 1)
            numberPagesAux--;
        }
        String price = listPrice.stream().min(String::compareTo).get();
        for (int i = 0; i < numberPages; i++) {
            actor.attemptsTo(Click.on(PAGE_INDEX.of(String.valueOf(numberPagesAux))));
            numberPagesAux++;
            actor.attemptsTo(Check.whether(BOOK_BUTTON.of(price.substring(1)).resolveFor(actor).isCurrentlyVisible()).andIfSo(
                    Click.on(BOOK_BUTTON.of(price.substring(1)))
            ));
            if(BOOK_BUTTON.of(price.substring(1)).resolveFor(actor).isCurrentlyVisible());
            i = numberPages+1;
        }
    }

    public static SelectPages price() {
        return Tasks.instrumented(SelectPages.class);
    }
}
