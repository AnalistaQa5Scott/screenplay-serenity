package net.serenity.inkafarma.tasks.login;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class VisibleMessage {
    public static Question<String> forField(String fieldName) {
        return Text.of(LoginForm.NAME_USER_LOGGED.of(fieldName)).asAString();
    }
    public static Question<String> nameLogged() {
        return Text.of(LoginForm.NAME_USER_LOGGED).asAString();
    }
}
