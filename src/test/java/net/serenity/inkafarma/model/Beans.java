package net.serenity.inkafarma.model;

public class Beans {

    public record Anonymous(
            String firstName,
            String lastName,
            String motherLastName,
            String typeDocument,
            String numberDocument,
            String cellPhone,
            String email
    ) {
    }

    public record DeliveryType(
            String address,
            String reference,
            String nameFavoriteAddress,
            String serviceType
    ) {
    }

    public record PaymentMethods(
            String cardNumber,
            String date,
            String cvv,
            String name,
            String lastName,
            String email
    ) {
    }

    public record Credentials(
            String redSocial,
            String email,
            String password
    ) {
    }



}
