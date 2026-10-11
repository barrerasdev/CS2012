package javafx.inclassassignment7;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

//Controller
public class Controller {
    //text fields for input and answer
    @FXML
    TextField field1;
    @FXML
    TextField field2;
    @FXML
    TextField answer;

    // button fields for buttons
    @FXML
    Button plusButton;
    @FXML
    Button minusButton;
    @FXML
    Button multiplyButton;
    @FXML
    Button divideButton;
    @FXML
    Button clearButton;

    //Execute operator method executes a both numbers inputted based on + - * / value
    @FXML
    public void executeOperator(ActionEvent event) {
        //If + button pressed will return the sum of both fields
        if (event.getSource() == plusButton) {
            answer.setText(String.valueOf(Integer.parseInt(field1.getText()) + Integer.parseInt(field2.getText())));

        }
        //If - button pressed will return difference of field1 and field2
        if (event.getSource() == minusButton) {
            answer.setText(String.valueOf(Integer.parseInt(field1.getText()) - Integer.parseInt(field2.getText())));

        }
        //If * button pressed will return product
        if (event.getSource() == multiplyButton) {
            answer.setText(String.valueOf(Integer.parseInt(field1.getText()) * Integer.parseInt(field2.getText())));
        }
        //If / button pressed will return quotient
        if (event.getSource() == divideButton) {
            answer.setText(String.valueOf(Integer.parseInt(field1.getText()) / Integer.parseInt(field2.getText())));
        }
    }

    // Method to clear display
    @FXML
    public void clearButton(ActionEvent event) {
        //Sets text to blank
        if (event.getSource() == clearButton) {
            answer.setText("");
        }
    }
}