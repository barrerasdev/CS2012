// Juan Barreras
// CS 2012-06

// Lab14 - Improved Calculator
// The Main class is used to create the GUI by loading the FXML file
// and extending JavaFX's Application class in order to Override the
// start method and launch the GUI with launch(args).

// FXML Comments:
// FXML file was created using Scene Builder. Scene Builder
// allowed me to link my FXML file to Controller and use
// onAction/eventAction function for buttons.
package fx.homework14;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;
//Main Class extends Application
public class ImprovedCalculatorMain extends Application {
    //Start method to create GUI
    @Override
    public void start(Stage stage) throws IOException {
        //Load fxml file
        FXMLLoader fxmlLoader = new FXMLLoader(ImprovedCalculatorMain.class.getResource("improved-calculator-view.fxml"));
        //Setup GUI
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Improved Calculator");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }
    //Run GUI in start
    public static void main(String[] args) {
        launch();
    }
}