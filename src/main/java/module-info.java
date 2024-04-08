module FrontOfHouse {
    requires javafx.controls;
    requires javafx.base;
    requires javafx.fxml;
    requires javafx.graphics;
    requires java.sql;

    opens org.main;

    exports org.main to javafx.graphics;

    exports org.main.booking to javafx.fxml, javafx.graphics;

    opens org.main.booking to javafx.fxml, javafx.base;
}