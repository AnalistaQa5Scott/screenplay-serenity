package net.serenity.inkafarma.tasks.login;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginForm {

    //region LOGIN WITH FACEBOOK
    public static Target SIG_IN_BUTTON = Target.the("signIn")
            .locatedBy("#signIn");
    public static Target SIG_IN_FACEBOOK = Target.the("signIn with Facebook")
            .locatedBy("#btn--login-facebook");
    public static Target FACEBOOK_EMAIL_FIELD = Target.the("email")
            .locatedBy("#email");
    public static Target FACEBOOK_PASS_FIELD = Target.the("pass")
            .locatedBy("#pass");
    //endregion

    //region LOGIN WITH GMAIL
    public static Target SIG_IN_GOOGLE = Target.the("signIn with Google")
            .locatedBy("#btn--login-google button");
    public static Target GOOGLE_EMAIL_FIELD = Target.the("email")
            .locatedBy("#identifierId");
    public static Target GOOGLE_PASSWORD_FIELD = Target.the("password")
            .locatedBy("#password .whsOnd");
    //endregion

    //region LOGIN WITH EMAIL
    public static Target BTN_EMAIL = Target.the("OPTION LOGIN WITH EMAIL")
            .located(By.xpath("//button[contains(text(),'Ingresa con correo electrónico')]"));
    public static Target INPUT_EMAIL = Target.the("INPUT EMAIL")
            .located(By.id("ctrl--login-email"));
    public static Target INPUT_EPASSWORD = Target.the("INPUT E PASSWORD")
            .located(By.id("ctrl--login-password"));
    public static Target BTN_LOGIN_EMAIL = Target.the("BUTTON LOGIN EMAIL")
            .located(By.xpath("//button[contains(text(),'Ingresa a tu cuenta')]"));
    //endregion

    //region MENU LOGGED
    public static Target NAME_USER_LOGGED = Target.the("user logged")
            .locatedBy(".menu-logged .user-name");
    //endregion

    //region LOGIN ANONYMOUS
    public static Target ANONYMOUS_NAME_FIELD = Target.the("full name anonymous")
            .locatedBy("//input[@id='ctrl--name-anonymous']");
    public static Target ANONYMOUS_FATHER_LASTNAME_FIELD = Target.the("full name anonymous")
            .locatedBy("//input[@id='ctrl--fatherLastName-anonymous']");
    public static Target ANONYMOUS_MOTHER_LASTNAME_FIELD = Target.the("full name anonymous")
            .locatedBy("//input[@id='ctrl--motherLastName-anonymous']");
    public static Target ANONYMOUS_SELECTED_TYPE_DOCUMENT = Target.the("dni anonymous")
            .locatedBy(".col-12.col-lg-3 .custom-options-container");
    public static Target ANONYMOUS_SELECTED_TYPE_DOCUMENT_1 = Target.the("DNI")
            .locatedBy("//option[contains(text(),'DNI')]");
    public static Target ANONYMOUS_SELECTED_TYPE_DOCUMENT_2 = Target.the("C.E")
            .locatedBy("//option[contains(text(),'C.E.')]");
    public static Target ANONYMOUS_SELECTED_TYPE_DOCUMENT_3 = Target.the("PASSPORT")
            .locatedBy("//option[contains(text(),'Pasaporte')]");
    public static Target ANONYMOUS_DNI_FIELD = Target.the("dni anonymous")
            .locatedBy("//input[@id='ctrl--document-anonymous']");
    public static Target ANONYMOUS_PHONE_FIELD = Target.the("phone anonymous")
            .locatedBy("//input[@id='ctrl--phone-anonymous']");
    public static Target ANONYMOUS_EMAIL_FIELD = Target.the("email anonymous")
            .locatedBy("//input[@id='ctrl--email-anonymous']");
    //endregion

}
