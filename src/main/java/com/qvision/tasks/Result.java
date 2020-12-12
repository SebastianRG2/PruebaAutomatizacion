package com.qvision.tasks;

import com.qvision.interactions.Select;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class Result implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Select.price());

    }

    public static Result hotel() {
        return Tasks.instrumented(Result.class);
    }
}
