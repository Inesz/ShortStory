package application;
	 
import controller.SampleController;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	//private Stage primaryStage;
	
	@Override
	public void start(Stage primaryStage) {
		//this.primaryStage = primaryStage;
		
		try {
			FXMLLoader loader=new FXMLLoader(Main.class.getResource("/view/Sample.fxml"));
			BorderPane root = (BorderPane)loader.load();
			
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			SampleController mainWindowController = loader.getController();
			mainWindowController.setAnimation();

			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}