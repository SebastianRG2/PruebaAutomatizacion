package com.qvision.interactions;

import jdk.nashorn.internal.runtime.regexp.joni.Regex;
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

    @Override
    public <T extends Actor> void performAs(T actor) {

        List<String> pages = TOTAL_PAGES.resolveAllFor(actor).stream().map(WebElementFacade::getText).collect(Collectors.toList());
        String totalPages = pages.stream().max(String::compareTo).get();
        int numberPagesAux = Integer.parseInt(totalPages);
        List<String> listPrice = new ArrayList<>();

        for (int i = 0; i < Integer.parseInt(totalPages); i++) {
            List<String> listPriceAux = PRICE_HOTEL.resolveAllFor(actor).stream().map(WebElementFacade::getText).collect(Collectors.toList());
            listPrice.add(listPriceAux.get(0));
            listPrice.add(listPriceAux.get(1));
            listPrice.add(listPriceAux.get(2));
            actor.attemptsTo(Click.on(PAGE_INDEX.of(String.valueOf(numberPagesAux))));
            if(numberPagesAux != 1)
            numberPagesAux--;
        }
        String price = listPrice.stream().min(String::compareTo).get();
        for (int i = 0; i < Integer.parseInt(totalPages); i++) {
            numberPagesAux++;
            actor.attemptsTo(Click.on(PAGE_INDEX.of(String.valueOf(numberPagesAux))));
           actor.attemptsTo(Check.whether(BOOK_BUTTON.of(price.substring(1)).resolveFor(actor).isVisible()).andIfSo(
                    Click.on(BOOK_BUTTON.of(price.substring(1)))
            ));
           // if(BOOK_BUTTON.of(price.substring(1)).resolveFor(actor).isSelected());
           //actor.attemptsTo(Click.on(BOOK_BUTTON.of(price.substring(1))));
            if(BOOK_BUTTON.of(price.substring(1)).resolveFor(actor).isCurrentlyVisible());
            i = Integer.parseInt(totalPages)+1;
        }
    }

    public static SelectPages price() {
        return Tasks.instrumented(SelectPages.class);
    }
}
