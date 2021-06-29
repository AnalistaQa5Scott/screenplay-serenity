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
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Managed;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

import java.io.IOException;
import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.givenThat;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class LoggingOn {

    @Managed(driver = "chrome") //, options = "--headless")
    public WebDriver hisBrowser;

    @Given("{actor} is a loyal customer")
    public void alexIsALoyalCustomer(Actor alexander) {
        givenThat(alexander.can(BrowseTheWeb.with(hisBrowser)));
        alexander.wasAbleTo(Navigate.toTheHomePage());
    }

    @When("{actor} tries to login with facebook with the following details:")
    public void alexLoginWithFacebook(Actor alexander, List<Credentials> credentials) {
        alexander.attemptsTo(DoLogin.withFacebook(credentials));
    }

    @Then("{actor} should be able to log in and see his name")
    public void shouldSeeHisName(Actor alexander) throws IOException {
        alexander.attemptsTo(
                Ensure.that(LoginForm.NAME_USER_LOGGED).hasText("Alexander Garcia")
        );
        Serenity.recordReportData().withTitle("Name Logged").andContents("My name is Alexander Garcia");
//        actor.should(seeThat(VisibleMessage.nameLogged(), equalTo("Alexander Garcia")));
    }

    @When("{actor} tries to login with the following accounts")
    public void loginWithRedSocialEmailPassword(Actor alexander, List<Credentials> credentials) {
        alexander.attemptsTo(DoLogin.withMultiplesAccounts(credentials));
        BrowseTheWeb.as(alexander).waitFor(2).seconds();
    }

    @When("{actor} should see his {string} within the application")
    public void heShouldSeeHisName(Actor alexander, String name) {
        alexander.attemptsTo(
                WaitUntil.the(LoginForm.NAME_USER_LOGGED, isVisible())
                        .forNoMoreThan(10).seconds(),
                Ensure.that(LoginForm.NAME_USER_LOGGED).hasText(name),
                DoLogin.andSignOff()
        );
    }
}
