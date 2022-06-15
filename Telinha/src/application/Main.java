package application;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {

			GridPane grid = new GridPane();
			grid.setHgap(5.0);
			grid.setVgap(7.0);

			grid.add(new Label("Nome"), 0, 0);
			TextField txtNome = new TextField();
			grid.add(txtNome, 1, 0);

			grid.add(new Label("Sexo"), 0, 1);
			RadioButton btnMasc = new RadioButton("Masculino");
			RadioButton btnFem = new RadioButton("Feminino");
			btnMasc.setSelected(true);

			ToggleGroup group = new ToggleGroup();
			btnMasc.setToggleGroup(group);
			btnFem.setToggleGroup(group);

			HBox radioBox = new HBox(5.0, btnFem, btnMasc);
			grid.add(radioBox, 1, 1);

			grid.add(new Label("Selecione o Estado"), 0, 2);
			ChoiceBox<String> chcEstados = new ChoiceBox<>();

			ObservableList<String> estados = FXCollections.observableArrayList("São Paulo", "Rio de Janeiro",
					"Minas Gerais");
			chcEstados.setItems(estados);
			grid.add(chcEstados, 1, 2);

			Button btnTeste = new Button("Teste");


			Label lblTeste = new Label();			
			btnTeste.setOnAction(event -> lblTeste.setText(txtNome.getText()));
			
			btnTeste.setOnMouseEntered(event -> lblTeste.setText("passou"));
			btnTeste.setOnMouseExited(event -> lblTeste.setText("Saiu"));
			
			CheckBox ckbTeste = new CheckBox("teste");
			
			grid.add(btnTeste, 1, 3);
			grid.add(lblTeste, 1, 4);
			grid.add(ckbTeste,1,5);
			
			
			BorderPane root = new BorderPane();
			Scene scene = new Scene(root, 400, 400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());

			root.setCenter(grid);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
