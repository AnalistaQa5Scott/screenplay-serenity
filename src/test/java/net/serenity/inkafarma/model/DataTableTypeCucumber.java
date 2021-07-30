package net.serenity.inkafarma.model;

import io.cucumber.java.DataTableType;
import net.serenity.inkafarma.model.Beans.*;

import java.util.Map;

public class DataTableTypeCucumber {

    @DataTableType
    public Credentials withUserAndPassword(Map<String, String> credentials) {
        return new Credentials(
                credentials.get("RedSocial"),
                credentials.get("Email"),
                credentials.get("Password")
        );
    }


}
