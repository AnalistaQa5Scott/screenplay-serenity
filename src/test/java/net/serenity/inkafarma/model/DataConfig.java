package net.serenity.inkafarma.model;

import net.serenity.inkafarma.model.Beans.*;
import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;

public class DataConfig {

    private static final Config users =
            ConfigFactory.load("data/users");

    public static Anonymous findAnonymousByName(String name) {
        Config userDetails = users.getConfig(name);
        return new Anonymous(
                userDetails.getString("firstName"),
                userDetails.getString("lastName"),
                userDetails.getString("motherLastName"),
                userDetails.getString("typeDocument"),
                userDetails.getString("numberDocument"),
                userDetails.getString("cellPhone"),
                userDetails.getString("email")
        );
    }

    private static final Config deliveryTypes =
            ConfigFactory.load("data/deliveryType");

    public static DeliveryType findByDeliveryType(String deliveryType) {
        Config deliveryTypeDetails = deliveryTypes.getConfig(deliveryType);
        return new DeliveryType(
                deliveryTypeDetails.getString("address"),
                deliveryTypeDetails.getString("reference"),
                deliveryTypeDetails.getString("nameFavoriteAddress"),
                deliveryTypeDetails.getString("serviceType")
        );
    }

    private static final Config paymentsMethodsTypes =
            ConfigFactory.load("data/paymentMethods");

    public static PaymentMethods findPaymentsMethods(String paymentMethods) {
        Config paymentMethodsDetails = paymentsMethodsTypes.getConfig(paymentMethods);
        return new PaymentMethods(
                paymentMethodsDetails.getString("cardNumber"),
                paymentMethodsDetails.getString("date"),
                paymentMethodsDetails.getString("cvv"),
                paymentMethodsDetails.getString("name"),
                paymentMethodsDetails.getString("lastName"),
                paymentMethodsDetails.getString("email")
        );
    }

    private static final Config skus =
            ConfigFactory.load("data/skuInkafarma.conf");

    public static Skus findBySku(String sku) {
        Config skuDetails = skus.getConfig(sku);
        return new Skus(
                skuDetails.getString("sku"),
                skuDetails.getString("presentation"),
                skuDetails.getString("quantity")
        );
    }

}