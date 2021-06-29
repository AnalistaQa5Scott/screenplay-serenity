package net.serenity.inkafarma.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenity.inkafarma.tasks.landingsearchresult.SearchProduct;
import net.serenitybdd.screenplay.Actor;
import net.serenity.inkafarma.tasks.navigate.Navigate;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class SearchProducts {

    @Given("{actor} is a frequent customer and wants to search products")
    public void alexanderWantsToSearchProducts(Actor actor) {
        actor.wasAbleTo(Navigate.toTheHomePage());
    }

    @When("{actor} tries to search by name or brand {string}")
    public void heTriesToSearchByNameOrBrand(Actor actor, String productNameOrBrand) {
        actor.attemptsTo(SearchProduct.byNameOrBrandOrSKU(productNameOrBrand));
    }

    @Then("{actor} should see all the results for the matching products")
    public void heShouldSeeAllTheResults(Actor actor) {
        BrowseTheWeb.as(actor).waitFor(5).seconds();
    }


}
