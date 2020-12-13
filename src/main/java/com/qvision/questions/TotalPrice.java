package com.qvision.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

public class TotalPrice implements Question<String> {
    private Target target;

    @Override
    public String answeredBy(Actor actor) {
        return target.resolveFor(actor).getText();
    }

    public TotalPrice(Target target) {
        this.target = target;
    }

    public static TotalPrice succesfully(Target target) {
        return new TotalPrice(target);
    }

}
