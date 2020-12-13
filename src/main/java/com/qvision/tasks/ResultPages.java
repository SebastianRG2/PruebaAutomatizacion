package com.qvision.tasks;

import com.qvision.interactions.SelectPages;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class ResultPages implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(SelectPages.price());
    }

    public static ResultPages hotel() {
        return Tasks.instrumented(ResultPages.class);
    }

}
