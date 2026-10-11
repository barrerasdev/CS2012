// Juan Barreras
// CS 2012-06
// Lab14 - Improved Calculator
// The Main class is used to create the GUI by loading the FXML file
// and extending JavaFX's Application class in order to Override the
// start method and launch the GUI with launch(args).

// FXML Comments:
// I cannot comment on the FXML file, so I will do it here:
// FXML file was created using Scene Builder. Scene Builder
// allowed me to link my FXML file to Controller and use
// onActions function for buttons.

package javafx.homework14;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Parent;
import java.util.Objects;

//Main method extends application to launch GUI
public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    //Start method
    @Override
    public void start(Stage stage) throws Exception {
        //Load View.fxml with its controller ( View.java )
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("View.fxml")));
        // Create non-resizeable scene for view.fxml
        Scene scene = new Scene(root, 400, 500);
        stage.setScene(scene);
        stage.setResizable(false);
        stage.setTitle("JavaFX Calculator");
        //Display
        stage.show();
    }
}
