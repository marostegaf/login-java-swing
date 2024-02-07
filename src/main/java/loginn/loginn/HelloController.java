package loginn.loginn;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;

public class HelloController {

    @FXML
    private Button btnVoltar;

    @FXML
    private Circle btnClose;

    @FXML
    private Button registrarButton;

    @FXML
    private Pane telaPrincipal;

    @FXML
    private Pane telaSecundaria;

    @FXML
    public void registrarButtonOnAction(ActionEvent e) {
        telaPrincipal.setVisible(false);
        telaSecundaria.setVisible(true);
    }
    @FXML
    public void btnCloseOnAction(MouseEvent e) {
        System.exit(0);
    }

    @FXML
    public void btnVoltarOnAction(ActionEvent e) {
        telaPrincipal.setVisible(true);
        telaSecundaria.setVisible(false);
    }

}
