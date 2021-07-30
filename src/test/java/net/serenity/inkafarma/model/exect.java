package net.serenity.inkafarma.model;

import net.serenity.inkafarma.model.Beans.*;

public class exect {
    static Anonymous AnonymousDetails;

    public static void main(String[] args) {
        AnonymousDetails = DataConfig.findAnonymousByName("Alexander");
        System.out.println(AnonymousDetails.email());
//        Random random = new Random();
//        System.out.println(AnonymousDetails.email().split(",")[random.nextInt(3)]);
    }

}
