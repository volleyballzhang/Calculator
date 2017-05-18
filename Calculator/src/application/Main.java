package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;


public class Main extends Application implements EventHandler<ActionEvent>{
	private Button b;
	@Override
	public void start(Stage primaryStage) {
		try {
			Parent scene = FXMLLoader.load(getClass().getResource("GUI.fxml"));
			primaryStage.setTitle("Calculator");
			primaryStage.setScene(new Scene(scene, 400, 410));
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void handle(ActionEvent event) {
		// TODO Auto-generated method stub
		
	}
}
