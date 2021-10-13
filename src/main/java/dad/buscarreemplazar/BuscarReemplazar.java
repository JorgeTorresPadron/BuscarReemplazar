package dad.buscarreemplazar;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class BuscarReemplazar extends Application {
	
	private Label buscarLabel;
	private Label reemplazarLabel;
	private TextField buscarText;
	private TextField reemplazarText;
	
	private Button buscarButton;
	private Button reemplazarButton;
	private Button reemplazarTodoButton;
	private Button cerrarButton;
	private Button ayudaButton;
	
	private CheckBox mmCheckBox;
	private CheckBox expreCheckBox;
	private CheckBox buscarCheckBox;
	private CheckBox resalCheckBox;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		buscarLabel = new Label("Buscar: ");
		reemplazarLabel = new Label("Reemplazar con: ");
		buscarText = new TextField();
		reemplazarText = new TextField();
		
		mmCheckBox = new CheckBox("Mayúsculas y minúsculas");
		expreCheckBox = new CheckBox("Expresión regular");
		buscarCheckBox = new CheckBox("Buscar hacia atrás");
		resalCheckBox = new CheckBox("Resaltar resultados");
		
		buscarButton = new Button("Buscar");
		buscarButton.setMinWidth(120); //Para que los botones no cambien de tamaño
		reemplazarButton = new Button("Reemplazar");
		reemplazarButton.setMinWidth(120);
		reemplazarTodoButton = new Button("Reemplazar Todo");
		reemplazarTodoButton.setMinWidth(120);
		cerrarButton = new Button("Cerrar");
		cerrarButton.setMinWidth(120);
		ayudaButton = new Button("Ayuda");
		ayudaButton.setMinWidth(120);
		
		
		GridPane panel = new GridPane();
		panel.add(buscarLabel, 0, 0);
		panel.add(buscarText, 1, 0, 2, 1); //1,0 posicion 2,1 para indicar que ocupa 2 columnas y 1 fila
		panel.add(reemplazarLabel, 0, 1);
		panel.add(reemplazarText, 1, 1, 2, 1);  //1,0 posicion 2,1 para indicar que ocupa 2 columnas y 1 fila
		panel.add(mmCheckBox, 1, 2);
		panel.add(buscarCheckBox, 2, 2);
		panel.add(expreCheckBox, 1, 3);
		panel.add(resalCheckBox, 2, 3);
		panel.add(buscarButton, 3, 0);
		panel.add(reemplazarButton, 3, 1);
		panel.add(reemplazarTodoButton, 3, 2);
		panel.add(cerrarButton, 3, 3);
		panel.add(ayudaButton, 3, 4);
		panel.setHgap(5);
		panel.setVgap(5);
		
		BorderPane root = new BorderPane();
		root.setCenter(panel);
		root.setPadding(new Insets(5));
		
		Scene scene= new Scene(root,480,250);
		primaryStage.setTitle("Buscar y reemplazar");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
