package net.serenity.inkafarma.domain;

import io.cucumber.java.DataTableType;
import net.serenity.inkafarma.domain.Beans.*;

import java.util.Map;

public class DataTableTypeCucumber {

    @DataTableType
    public Credentials withUserAndPassword(Map<String, String> credentials) {
        return new Credentials(
                credentials.get("Email"),
                credentials.get("Password")
        );
    }


}
