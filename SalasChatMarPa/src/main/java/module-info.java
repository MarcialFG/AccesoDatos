module com.Marcial.SalasChatMarPa {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.Marcial.SalasChatMarPa to javafx.fxml;
    exports com.Marcial.SalasChatMarPa;
}
