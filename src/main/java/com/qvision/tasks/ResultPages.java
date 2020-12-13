package com.qvision.tasks;

import com.qvision.interactions.SelectPages;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

public class ResultPages implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(SelectPages.price());

    }
}
