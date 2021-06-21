package net.serenity.inkafarma.tasks.navigate;

import net.serenitybdd.screenplay.Question;

public class Alerts {

    public static Question<Boolean> forOnsignalIsVisible() {
        return actor -> HomePage.NO_ACCEPT_ONESIGNAL_POPUP.resolveFor(actor).isCurrentlyVisible();
    }

    public static Question<Boolean> forAddressIsVisible() {
        return actor -> HomePage.NO_ACCEPT_POPUP_ADDRESS.resolveFor(actor).isCurrentlyVisible();
    }

}
