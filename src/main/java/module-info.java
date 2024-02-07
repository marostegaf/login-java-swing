module loginn.loginn {
    requires javafx.controls;
    requires javafx.fxml;


    opens loginn.loginn to javafx.fxml;
    exports loginn.loginn;
}