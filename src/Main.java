import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
    Vbox vbox; 
    int vaher = 0.8;
    int mänd = 1.1;
    int tamm = 1.6;
    //vaher = e1.setToggleGroup(g);
    //mänd = e2.setToggleGroup(g);
    //tamm = e3.setToggleGroup(g);
    Stage puuproge;
    Stage tagastusVastamine;
    Image avapilt = new Image("iidnetamm.png");
    ImagePattern puuPilt = new ImagePattern(avapilt);
    


    @Override
    public void start(Stage primaryStage) throws Exception {
        reageeriValik();
       
          // ESIMENE ASI: puuVALIK JavaFXiga();
         //TEINE SAMM, vaja sisendit - puuümbermõõt;
        //ARVUTUSKÄIK VALITUD PUUGA();
        //ANNAB VASTUSE kasutajaliides JavaFX
       

        VBox vbox = new VBox();
        Scene login = new Scene(vbox, 400, 100);
        primaryStage.setScene(login);
        primaryStage.show();
        Label pealkiri = new Label("Ütle parool, kui tahad seda rakendust kasutada!");
        TextField paroolf = new TextField();
        Button anna = new Button("vihje :-), kirjuta: kuusk");
        vbox.getChildren().addAll(pealkiri, paroolf, anna);

    

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

        //Küsi ToggleGroup käest, MIS PUU ON VALITUD:
        g.getSelectedToggle();

    }

    private void reageeriValik() {
        vbox.setOnMouseClicked(event -> {
            System.out.println("Klikk töötab");
        });


        //TEINE SAMM, vaja sisendit (JavaFX TextField) - puuümbermõõt;
        //...teen selle varsti..


         //ARVUTUSKÄIK VALITUD PUUGA();
        //g. tagastab meile, milline puu valiti = näiteks e3
        //puuÜmbermõõt = e1 * ÜMBERMÕÕT

        //ANNAB VASTUSE kasutajaliides JavaFX TextField-näiteks või puuPilt, koos vanusega?
        //VASTUS = puuÜmbermõõt


    private void lahkumine() {
        puuproge.close();
        StackPane stack = new StackPane();
        Label go = new Label("Good Bye!!!");
        stack.getChildren().add(go);
        Scene scene = new Scene(stack, 300, 300);
        Stage goStage = new Stage();
        goStage.setScene(scene);
        goStage.show();
    }
    }
}
