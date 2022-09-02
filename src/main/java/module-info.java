module com.example.eventhandlers {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.example.eventhandlers to javafx.fxml;
    exports com.example.eventhandlers;
}