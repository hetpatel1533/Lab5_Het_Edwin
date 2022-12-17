module ca.durhamcollege.lab5_het_edwin {
    requires javafx.controls;
    requires javafx.fxml;


    opens ca.durhamcollege.lab5_het_edwin to javafx.fxml;
    exports ca.durhamcollege.lab5_het_edwin;
}