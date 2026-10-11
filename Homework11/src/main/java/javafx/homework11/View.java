package javafx.homework11;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class View {

    // Display area where we show numbers and results
    @FXML
    private TextField display;

    // AppendDigit adds the digit of the clicked button to the display
    @FXML
    private void appendDigit(ActionEvent event) {
        Button clickedButton = (Button) event.getSource();
        display.setText(display.getText() + clickedButton.getText());
    }

    // Adds an operator (+, -, *, /) to the display with spaces around it
    @FXML
    private void appendOperator(ActionEvent event) {
        Button clickedButton = (Button) event.getSource();
        display.setText(display.getText() + " " + clickedButton.getText() + " ");
    }

    // Calculates the square of the number in the display
    @FXML
    private void applySquare() {
        try {
            double currentValue = Double.parseDouble(display.getText());
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
            double result = Math.cos(Math.toRadians(degrees));
            display.setText(String.valueOf(result));
        } catch (NumberFormatException e) {
            display.setText("Error");
        }
    }

    // Raises the number to the power of x
    @FXML
    private void applyPower() {
        try {
            // Split the display text using "^" as the separator
            String[] values = display.getText().split("\\^");

            // Ensure there are exactly two parts: base and exponent
            if (values.length == 2) {
                double base = Double.parseDouble(values[0].trim());
                double exponent = Double.parseDouble(values[1].trim());

                // Calculate the result
                double result = Math.pow(base, exponent);

                // Display the result
                display.setText(String.valueOf(result));
            } else {
                // Display an error message if input is invalid
                display.setText("Error");
            }
        } catch (NumberFormatException e) {
            // Handle invalid number format
            display.setText("Error");
        }
    }


    // Calculates the logarithm (base 10) of the number in the display
    @FXML
    private void applyLog() {
        try {
            double currentValue = Double.parseDouble(display.getText());
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

    // Processes the expression and performs the calculation
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
