package net.serenity.inkafarma.tasks.utilities;

import net.serenity.inkafarma.tasks.navigate.HomePage;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Upload;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class UploadA {

    public static void File() {
        Path data = null;
        try {
            data = Paths.get(ClassLoader.getSystemResource("data/logo_farmacias.png").toURI());
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        theActorInTheSpotlight().attemptsTo(Upload.theFile(data).to(HomePage.UPLOADFILE));
        theActorInTheSpotlight().attemptsTo(Click.on("#file-submit"));
    }
}
