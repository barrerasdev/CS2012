module fx.homework14 {
    requires javafx.controls;
    requires javafx.fxml;


    opens fx.homework14 to javafx.fxml;
    exports fx.homework14;
}