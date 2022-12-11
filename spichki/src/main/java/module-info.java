module com.example.spichki {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.spichki to javafx.fxml;
    exports com.example.spichki;
}