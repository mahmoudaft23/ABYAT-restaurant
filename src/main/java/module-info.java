module com.example.demo {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.oracle.database.jdbc;
    requires java.sql;
    requires java.naming;

    opens com.example.demo to javafx.fxml;
    exports com.example.demo;
}