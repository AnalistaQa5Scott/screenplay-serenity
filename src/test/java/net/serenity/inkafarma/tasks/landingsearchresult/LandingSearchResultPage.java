package net.serenity.inkafarma.tasks.landingsearchresult;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LandingSearchResultPage {

    //region SEARCH PRODUCT OR BRAND
    public static Target SEARCH_FIELD = Target.the("search field")
            .locatedBy("#ctrl-product-searcher");
    public static Target MATCHES_RESULTS = Target.the("match results")
            .locatedBy(".show-all-responsive.ng-star-inserted");
    public static Target SEE_ALL_RESULTS_BUTTON = Target.the("button field")
            .locatedBy("//a[@class='heading text-support-two']");
    public static Target MINICART_BUTTON = Target.the("minicart button")
            .located(By.cssSelector(".col.cart-header.navigation-cart-animation span"));
    //endregion



}
