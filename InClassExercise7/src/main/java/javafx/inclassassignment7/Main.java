package javafx.inclassassignment7;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

// Main class extends application to launch JavaFX GUI
public class Main extends Application {

    //Override start method from application
    @Override
    public void start(Stage stage) throws IOException {
        //Load FXML class
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("7view.fxml"));
        //Set scene to stage and title
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Calculator");
        stage.setScene(scene);
        //Not resizeable
        stage.setResizable(false);
        //Show
        stage.show();
    }
    // Main method launches GUI
    public static void main(String[] args) {
        launch();
    }
}