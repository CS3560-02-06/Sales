package com.Controllers;
import java.io.IOException;

import com.Main;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class shirtpagecontroller {

    @FXML
    private Button shirt;
    
    public shirtpagecontroller() {

    }

    public void SelectSearch(ActionEvent event) throws IOException {
        Main m = new Main();
        m.ChangeScene("com/mainpage.fxml");
    }
}
