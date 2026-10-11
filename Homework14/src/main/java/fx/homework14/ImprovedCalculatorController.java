// Juan Barreras
// CS 2012-06

// Lab14 - Improved Calculator
// The Controller class uses several methods in order to give the calculator
// its functionality. For the buttons of numbers, appendDigit is used, for arithmetic
// and the new ^ function, appendOperator is used. Decimals use appendDecimal. More
// complicated functions like the newly added ln and log use their own respective methods.
// No other new implementations have been made from Lab11.
package fx.homework14;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
//Controller
public class ImprovedCalculatorController {

    // Display area
    @FXML
    public TextField display;

    // AppendDigit adds the digit of the clicked button to the display 0-9
    @FXML
    private void appendDigit(ActionEvent event) {
        Button clickedButton = (Button) event.getSource();
        display.setText(display.getText() + clickedButton.getText());
    }

    // Adds an operator (+, -, *, /, ^) to the display with spaces around it
    @FXML
    private void appendOperator(ActionEvent event) {
        Button clickedButton = (Button) event.getSource();
        String operator = clickedButton.getText();
        display.setText(display.getText() + " " + operator + " ");
    }

    // Calculates the square of the number in the display
    @FXML
    private void applySquare() {
        try {
            double currentValue = Double.parseDouble(display.getText());
            //Does square
            double result = currentValue * currentValue;
            display.setText(String.valueOf(result));
        } catch (NumberFormatException e) {
            display.setText("Error");
        }
    }

    // Calculates the cube of the number in the display
    @FXML
    private void applyCube() {
        try {
            double currentValue = Double.parseDouble(display.getText());
            //Does cube
            double result = currentValue * currentValue * currentValue;
            display.setText(String.valueOf(result));
        } catch (NumberFormatException e) {
            display.setText("Error");
        }
    }

    // Calculates the square root of the number in the display
    @FXML
    private void applySquareRoot() {
        try {
            double currentValue = Double.parseDouble(display.getText());
            //Uses math.sqrt to do square root
            double result = Math.sqrt(currentValue);
            display.setText(String.valueOf(result));
        } catch (NumberFormatException e) {
            display.setText("Error");
        }
    }

    // Calculates the sine of the number in degrees
    @FXML
    private void applySin() {
        try {
            double degrees = Double.parseDouble(display.getText());
            //Does sin
            double result = Math.sin(Math.toRadians(degrees));
            display.setText(String.valueOf(result));
        } catch (NumberFormatException e) {
            display.setText("Error");
        }
    }

    // Calculates the cosine of the number in degrees
    @FXML
    private void applyCos() {
        try {
            double degrees = Double.parseDouble(display.getText());
            //Cosine
            double result = Math.cos(Math.toRadians(degrees));
            display.setText(String.valueOf(result));
        } catch (NumberFormatException e) {
            display.setText("Error");
        }
    }


    // Calculates the logarithm (base 10) of the number in the display
    @FXML
    private void applyLog() {
        try {
            double currentValue = Double.parseDouble(display.getText());
            //Log 10 ( e )
            double result = Math.log10(currentValue);
            display.setText(String.valueOf(result));
        } catch (NumberFormatException e) {
            display.setText("Error");
        }
    }

    // Calculates the natural logarithm (ln) of the number in the display
    @FXML
    private void applyLn() {
        try {
            double currentValue = Double.parseDouble(display.getText());
            //Log
            double result = Math.log(currentValue);
            display.setText(String.valueOf(result));
        } catch (NumberFormatException e) {
            display.setText("Error");
        }
    }

    // Appends a decimal point to the current number
    @FXML
    private void appendDecimal() {
        String currentText = display.getText();
        if (!currentText.contains(".")) {
            display.setText(currentText + ".");
        }
    }

    // Evaluates a simple mathematical expression ( x +/-/*/divide x = )
    @FXML
    private void calculateResult() {
        try {
            String expression = display.getText();
            double result = evaluateExpression(expression);
            display.setText(String.valueOf(result));
        } catch (Exception e) {
            display.setText("Error");
        }
    }

    // Processes the expression and performs the calculation using regex and expression splitting
    private double evaluateExpression(String expression) {
        expression = expression.replace(" ", "");

        if (expression.contains("+")) {
            String[] parts = expression.split("\\+");
            return Double.parseDouble(parts[0]) + Double.parseDouble(parts[1]);
        } else if (expression.contains("-")) {
            String[] parts = expression.split("-");
            return Double.parseDouble(parts[0]) - Double.parseDouble(parts[1]);
        } else if (expression.contains("*")) {
            String[] parts = expression.split("\\*");
            return Double.parseDouble(parts[0]) * Double.parseDouble(parts[1]);
        } else if (expression.contains("/")) {
            String[] parts = expression.split("/");
            return Double.parseDouble(parts[0]) / Double.parseDouble(parts[1]);
        } else if (expression.contains("^")) {
            String[] parts = expression.split("\\^");
            return Math.pow(Double.parseDouble(parts[0]), Double.parseDouble(parts[1]));
        } else {
            return Double.parseDouble(expression);
        }
    }
    // resetDisplay clears the display (resets it to an empty state)
    @FXML
    private void resetDisplay() {
        display.clear();
    }

    // clearDisplay clears the text in the display
    @FXML
    private void clearDisplay() {
        display.setText("");
    }
}
