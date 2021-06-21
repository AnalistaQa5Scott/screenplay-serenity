package net.serenity.inkafarma.tasks.login;

import net.serenity.inkafarma.domain.Bases.*;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import java.util.List;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class DoLogin {

    public static Performable withFacebook(List<Credentials> credentials) {
        return Task.where("Enter credentials in Facebook form",
                Click.on(LoginForm.SIG_IN_BUTTON),
                Click.on(LoginForm.SIG_IN_FACEBOOK),
                Switch.toTheOtherWindow(),
                WaitUntil.the(LoginForm.FACEBOOK_EMAIL_FIELD, isVisible()).forNoMoreThan(10).seconds(),
                Enter.theValue(credentials.get(0).email()).into(LoginForm.FACEBOOK_EMAIL_FIELD).thenHit(Keys.TAB),
                Enter.theValue(credentials.get(0).password()).into(LoginForm.FACEBOOK_PASS_FIELD).thenHit(Keys.ENTER),
                Switch.toTheOtherWindow(),
                WaitUntil.the(LoginForm.NAME_USER_LOGGED, isVisible()).forNoMoreThan(10).seconds()
        );
    }

    public static Performable withGoogle(List<Credentials> credentials) {
        return Task.where("LoginForm with email",
                Click.on(LoginForm.SIG_IN_BUTTON),
                Click.on(LoginForm.SIG_IN_GOOGLE),
                Switch.toTheOtherWindow(),
                WaitUntil.the(LoginForm.GOOGLE_EMAIL_FIELD, isVisible()).forNoMoreThan(10).seconds(),
                Enter.theValue(credentials.get(0).email()).into(LoginForm.GOOGLE_EMAIL_FIELD).thenHit(Keys.ENTER),
                WaitUntil.the(LoginForm.GOOGLE_PASSWORD_FIELD, isVisible()).forNoMoreThan(10).seconds(),
                Enter.theValue(credentials.get(0).password()).into(LoginForm.GOOGLE_PASSWORD_FIELD).thenHit(Keys.ENTER),
                Switch.toTheOtherWindow(),
                WaitUntil.the(LoginForm.NAME_USER_LOGGED, isVisible()).forNoMoreThan(10).seconds()
        );
    }

    public static Performable withEmail(String email, String password) {
        return Task.where("LoginForm with email",
                Click.on(LoginForm.SIG_IN_BUTTON),
                WaitUntil.the(LoginForm.BTN_EMAIL, isVisible()),
                Click.on(LoginForm.BTN_EMAIL),
                Enter.theValue(email).into(LoginForm.INPUT_EMAIL),
                Enter.theValue(password).into(LoginForm.INPUT_EPASSWORD),
                WaitUntil.the(LoginForm.BTN_LOGIN_EMAIL, isVisible()),
                Click.on(LoginForm.BTN_LOGIN_EMAIL),
                WaitUntil.the(LoginForm.NAME_USER_LOGGED, isVisible()).forNoMoreThan(10).seconds()
        );
    }

}