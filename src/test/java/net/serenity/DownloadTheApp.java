//package net.serenity;
//
//import net.serenitybdd.junit.runners.SerenityRunner;
//import net.serenitybdd.screenplay.Actor;
//import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
//import net.serenitybdd.screenplay.actions.Click;
//import net.serenitybdd.screenplay.actions.Open;
//import net.thucydides.core.annotations.WithTag;
//import net.thucydides.core.annotations.WithTags;
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//
//import java.util.List;
//
//import static net.serenitybdd.screenplay.GivenWhenThen.givenThat;
//import static net.serenitybdd.screenplay.GivenWhenThen.when;
//
//@RunWith(SerenityRunner.class)
//@WithTags({
//        @WithTag("Screenplay pattern"),
//        @WithTag("version:RELEASE-1"),
//})
//public class DownloadTheApp {
//
//    private Actor james = Actor.named("James");
//
////    @Managed(driver = "chrome", options = "--headless")
//    private WebDriver hisBrowser;
//
//    @Before
//    public void jamesCanBrowseTheWeb() {
//        james.can(BrowseTheWeb.with(hisBrowser));
//    }
//
//    @Test
//    public void should_be_able_to_download_the_application() {
//
//        james.wasAbleTo(Open.url("http://todomvc.com/"));
//
//        List<String> dl;
//
//        when(james).attemptsTo(
//                Click.on(By.linkText("Download"))
//        );
//
//
//        try {
//            Thread.sleep(10000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//
//    }
//
//
//}