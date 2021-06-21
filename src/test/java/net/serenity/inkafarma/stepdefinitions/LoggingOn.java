package net.serenity.inkafarma.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenity.inkafarma.domain.Bases.*;
import net.serenity.inkafarma.tasks.login.DoLogin;
import net.serenity.inkafarma.tasks.login.LoginForm;
import net.serenity.inkafarma.tasks.login.VisibleMessage;
import net.serenity.inkafarma.tasks.navigate.Navigate;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.givenThat;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

public class LoggingOn {
    @Managed(driver = "firefox")
    public WebDriver driver;


    @Given("{actor} is a loyal customer")
    public void alexIsALoyalCustomer(Actor actor) {
        givenThat(actor.can(BrowseTheWeb.with(driver)));
        actor.wasAbleTo(Navigate.toTheHomePage());
    }

    @When("{actor} tries to login with facebook with the following details:")
    public void alexLoginWithFacebook(Actor actor, List<Credentials> credentials) {
        actor.attemptsTo(DoLogin.withFacebook(credentials));
    }

    @Then("{actor} should be able to log in and see his name")
    public void shouldSeeHisName(Actor actor) {
        actor.attemptsTo(
                Ensure.that(LoginForm.NAME_USER_LOGGED).hasText("Alexander Garcia")
        );
//        actor.should(seeThat(VisibleMessage.nameLogged(), equalTo("Alexander Garcia")));
    }


    @When("{actor} tries to login with {} as {} with password {}")
    public void loginWithRedSocialEmailPassword(Actor actor, String redSoacial, String email, String password) {

    }

    @When("{actor} should be able to log in and see his name in the application")
    public void enteEmailAndPassword(Actor actor, String email, String password) throws InterruptedException {
//        actor.attemptsTo(DoLogin.withEmail(email, password));
        BrowseTheWeb.as(actor).waitFor(8000).milliseconds();
    }
}
