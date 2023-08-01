module ms.messengerclient {
    requires javafx.controls;
    requires javafx.fxml;


    opens ms to javafx.fxml;
    exports ms;
}