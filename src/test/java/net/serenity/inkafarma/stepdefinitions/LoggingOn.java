package net.serenity.inkafarma.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenity.inkafarma.domain.Beans.*;
import net.serenity.inkafarma.tasks.login.DoLogin;
import net.serenity.inkafarma.tasks.login.LoginForm;
import net.serenity.inkafarma.tasks.navigate.Navigate;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.io.IOException;
import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.givenThat;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

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
    public void shouldSeeHisName(Actor actor) throws IOException {
        actor.attemptsTo(
                Ensure.that(LoginForm.NAME_USER_LOGGED).hasText("Alexander Garcia")
        );
        Serenity.recordReportData().withTitle("Name Logged").andContents("My name is Alexander Garcia");
//        actor.should(seeThat(VisibleMessage.nameLogged(), equalTo("Alexander Garcia")));
    }


    @When("{actor} tries to login with the following accounts")
    public void loginWithRedSocialEmailPassword(Actor actor,List<Credentials> credentials) {
        actor.attemptsTo(DoLogin.withMultiplesAccounts(credentials));
    }

    @When("{actor} should be able to login in the application")
    public void enteEmailAndPassword(Actor actor) {
        BrowseTheWeb.as(actor).waitFor(15000).milliseconds();
    }
}
