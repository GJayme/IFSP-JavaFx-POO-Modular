package ifsp.poo.ex02;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.time.LocalDate;

public class ExpenseUI extends Application {

    private Label lbDescription, lbValue, lbCategory, lbDate;
    private TextField txtDescription, txtValue;
    private ComboBox<String> cbCategory;
    private DatePicker dpData;
    private Button btnSave;

    private ObservableList<String> categories;

    private ExpenseController ctrl = new ExpenseController(this);

    public static void main(String[] args) throws Exception{
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        initializeComponents();
        Pane layout = setLayout();
        configureStageAndShow(stage, layout);
    }

    private void initializeComponents() {
        lbDescription = new Label("Descrição");
        lbCategory = new Label("Categoria");
        lbDate = new Label("Data");
        lbValue = new Label("Valor");

        txtDescription = new TextField();
        txtDescription.setPromptText("Descrição de gasto");

        txtValue = new TextField();
        txtValue.setPromptText("Valor em reais");

        categories = FXCollections.observableArrayList("Saude", "Educação", "Cachaça");
        cbCategory = new ComboBox(categories);

        dpData = new DatePicker();

        btnSave = new Button("Salvar");
        btnSave.setOnAction(e -> ctrl.save());
    }

    private Pane setLayout() {
        GridPane layout = new GridPane();

        layout.setVgap(6);
        layout.setHgap(10);
        layout.setPadding(new Insets(10,10,10,10));

        layout.add(lbDescription, 0,0);
        layout.add(lbValue, 0, 1);
        layout.add(lbCategory,0,2);

        layout.add(txtDescription, 1,0,5,1);
        layout.add(txtValue,1,1);
        layout.add(cbCategory,1,2);

        layout.add(lbDate,4,1);

        layout.add(dpData, 5,1);
        layout.add(btnSave,5,2);

        return layout;
    }

    private void configureStageAndShow(Stage stage, Pane layout) {
        Scene scene = new Scene(layout, 600, 250);
        stage.setScene(scene);
        stage.setTitle("Expenses Example");
        stage.show();
    }

    public String getCategory() {
        return cbCategory.getSelectionModel().getSelectedItem();
    }

    public String getValue() {
        return txtValue.getText();
    }

    public LocalDate getDate() {
        return dpData.getValue();
    }

    public String getDescription() {
        return txtDescription.getText();
    }

    public void clearUi() {
        txtDescription.setText("");
        txtValue.setText("");
        cbCategory.getSelectionModel().clearSelection();
        dpData.setValue(LocalDate.now());
        dpData.setDisable(true);
    }
}
