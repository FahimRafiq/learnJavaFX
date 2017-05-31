package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller {

    @FXML private Button btn01;

    @FXML void changeScene(ActionEvent event) throws IOException {
        Parent secondSceneRoot = FXMLLoader.load(getClass().getResource("second.fxml"));
        Scene secondScene = new Scene(secondSceneRoot);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

        window.setScene(secondScene);
        window.show();
    }
}

