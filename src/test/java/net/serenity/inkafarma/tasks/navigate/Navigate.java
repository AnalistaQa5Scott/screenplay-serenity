package net.serenity.inkafarma.tasks.navigate;

import net.serenity.inkafarma.tasks.login.LoginForm;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Navigate {

    public static Performable toTheHomePage() {
        return Task.where("{0} opens the home page ",
                Open.browserOn().thePageNamed("home.page"),
                Check.whether(Alerts.forOnsignalIsVisible()).andIfSo(
                        Click.on(HomePage.NO_ACCEPT_ONESIGNAL_POPUP)),
                Check.whether(Alerts.forAddressIsVisible()).andIfSo(
                        Click.on(HomePage.NO_ACCEPT_POPUP_ADDRESS))
        );
    }

    public static Performable toTheHomePages() {
        return Task.where("{0} opens the page",
                Navigate.toTheOpenUrl()
        );
    }

    public static Performable toTheOpenUrl() {
        return Open.url("http://localhost:8080");
    }


}
