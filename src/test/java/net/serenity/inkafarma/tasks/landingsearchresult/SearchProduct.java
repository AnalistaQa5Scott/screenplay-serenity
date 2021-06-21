package net.serenity.inkafarma.tasks.landingsearchresult;


import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

public class SearchProduct {

    public static Performable byNameOrBrand(String productNameOrBrand) {
        return Task.where("{0} Search product by name or brand",
                Enter.theValue(productNameOrBrand).into(LandingSearchResultPage.SEARCH_FIELD),
                WaitUntil.the(LandingSearchResultPage.SEE_ALL_RESULTS_BUTTON,
                        WebElementStateMatchers.isClickable()).forNoMoreThan(10).seconds()
                .then(Hit.the(Keys.ENTER).into(LandingSearchResultPage.SEE_ALL_RESULTS_BUTTON))
        );
    }

}
