module org.example.pi {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;


    opens org.example.pi to javafx.fxml;
    exports org.example.pi;
    exports org.example.pi.GUI;
    opens org.example.pi.GUI to javafx.fxml;
}