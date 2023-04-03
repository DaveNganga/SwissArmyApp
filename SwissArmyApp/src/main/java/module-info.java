module com.example.swissarmyapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.swissarmyapp to javafx.fxml;
    exports com.example.swissarmyapp;
}