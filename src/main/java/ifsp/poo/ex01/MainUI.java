package ifsp.poo.ex01;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class MainUI extends Application {

    TextField tfInput; // Campo de texto
    Label lbResult, lbInput; // Rotulo não editável
    Button btnExecute; // Botão

    MainUIControler controler = new MainUIControler(this);

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
        lbInput = new Label("input");
        tfInput = new TextField();
        tfInput.setPromptText("Input text"); //Dica de texto para tfInput
        btnExecute = new Button("Revert");
        btnExecute.setOnAction(e -> controler.reverse());
        lbResult = new Label("Result");

        HBox layout = new HBox(); //layout horizontal
        layout.setSpacing(10); //espaçamento entre componentes
        layout.setPadding(new Insets(10,10,10,10)); //espaçamento interno
        layout.setAlignment(Pos.BASELINE_LEFT); // Alinhamento dos componentes
        layout.getChildren().addAll(lbInput,tfInput,btnExecute,lbResult); //add elementos

        Scene scene = new Scene(layout, 600, 80);

        stage.setTitle("String Reverter"); // Titulo do stage/palco/janela
        stage.setScene(scene);// indica qual cena acontecerá no palco
        stage.show(); //exibe a janela
    }

    public String getInput(){
        return tfInput.getText();
    }

    public void setResult(String result){
        lbResult.setText(result);
    }
}
