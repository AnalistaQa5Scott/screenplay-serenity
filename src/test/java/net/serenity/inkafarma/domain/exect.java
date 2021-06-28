package net.serenity.inkafarma.domain;

import java.util.Random;

import net.serenity.inkafarma.domain.Beans.*;

public class exect {
    static Anonymous AnonymousDetails;

    public static void main(String[] args) {
        AnonymousDetails = Data.findAnonymousByName("Alexander");
        System.out.println(AnonymousDetails.email());
//        Random random = new Random();
//        System.out.println(AnonymousDetails.email().split(",")[random.nextInt(3)]);
    }

}
