package net.serenity.inkafarma.tasks.navigate;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePage {

    //region HOME HEADER
    public static Target NO_ACCEPT_ONESIGNAL_POPUP = Target.the("search field")
            .locatedBy("#onesignal-slidedown-allow-button");
    public static Target NO_ACCEPT_POPUP_ADDRESS = Target.the("No accept address")
            .locatedBy("//button[contains(text(),'Ahora no')]");
    public static Target BUY_NOW_BUTTON = Target.the("go to buy now")
            .locatedBy("//button[@id='btn--go-to-checkout']");
    public static Target WITHOUT_LOGIN_BUTTON_1 = Target.the("Continue without logging in modal 1")
            .locatedBy("//a[contains(text(),'Continúa sin iniciar sesión')]");
    public static Target WITHOUT_LOGIN_BUTTON_2 = Target.the("Continue without logging in modal 2")
            .locatedBy("//button[contains(text(),'Continuar sin iniciar sesión')]");
    public static Target POPUP_AFTER_PURCHASE = Target.the("Continue without logging in modal 2")
            .locatedBy("//span[contains(text(),'Tu pedido ha sido realizado satisfactoriamente. Te')]");
    public static Target BUTTON_OK_AFTER_PURCHASE = Target.the("Continue without logging in modal 2")
            .locatedBy("//div[@class='col-lg-7 btn btn-primary button']");
    //endregion





    public static Target UPLOADFILE = Target.the("upload file")
            .locatedBy("#file-upload");
}
