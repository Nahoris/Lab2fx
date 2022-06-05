module com.example.lab2fx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.lab2fx to javafx.fxml;
    exports com.example.lab2fx;
}