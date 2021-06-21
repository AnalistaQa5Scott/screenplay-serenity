package net.serenity.inkafarma.domain;

import io.cucumber.java.DataTableType;

import java.util.Map;

public class Bases {

    public record Credentials(String email,
                              String password) {
    }
    @DataTableType
    public Credentials theFollowingInformation(Map<String, String> credentials) {
        return new Credentials(
                credentials.get("Email"),
                credentials.get("Password")
        );
    }

}
