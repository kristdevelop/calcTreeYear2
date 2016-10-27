import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
    // ESIMENE ASI: puuVALIK JavaFXiga();
    //TEINE SAMM, CALL OUT ARVUTUSKÄIK VALITUD PUUGA();
    VBox vbox;

    @Override
    public void start(Stage primaryStage) throws Exception {
        reageeriValik();

        VBox vbox = new VBox();
        primaryStage.setTitle("Puuvanuse arvutamine. Vali:");
        Scene PUULIIK = new Scene(vbox, 500, 150);
        primaryStage.setScene(PUULIIK);
        primaryStage.show();

        ToggleGroup g = new ToggleGroup();
        RadioButton e1 = new RadioButton("Valik 1, kas see puu oli: VAHER");
        RadioButton e2 = new RadioButton("Valik 3, ehk see oli hoopis: MÄND");
        RadioButton e3 = new RadioButton("Valik 3, kas näitan pilti: TAMM");
        e1.setToggleGroup(g);
        e2.setToggleGroup(g);
        e3.setToggleGroup(g);
        e3.setSelected(true);
        vbox.getChildren().addAll(e1, e2, e3);

        //Küsi ToggleGroup käest, MIS PUU ON VALITUD
        g.getSelectedToggle();

    }

    private void reageeriValik() {
        vbox.setOnMouseClicked(event -> {
            System.out.println("Klikk töötab");
        });
    }
}