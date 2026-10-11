module javafx.homework11 {
    requires javafx.controls;
    requires javafx.fxml;


    opens javafx.homework11 to javafx.fxml;
    exports javafx.homework11;
    exports javafx.homework14;
    opens javafx.homework14 to javafx.fxml;
}