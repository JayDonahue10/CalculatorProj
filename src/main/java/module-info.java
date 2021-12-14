module application.calculatorproj {
    requires javafx.controls;
    requires javafx.fxml;


    opens application.calculatorproj to javafx.fxml;
    exports application.calculatorproj;
}