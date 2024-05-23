module com.empresa.actividad020 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.empresa.actividad020 to javafx.fxml;
    exports com.empresa.actividad020;
}