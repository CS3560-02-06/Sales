package com.Controllers;
import java.io.IOException;

import com.Main;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class mainpagecontroller {

    @FXML
    private Button shirt;
    
    public mainpagecontroller() {

    }

    public void SelectShirtItem(ActionEvent event) throws IOException {
        Main m = new Main();
        m.ChangeScene("com/shirtpage.fxml");
    }
}
