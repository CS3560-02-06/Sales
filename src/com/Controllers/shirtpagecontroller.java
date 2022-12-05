package com.Controllers;
import java.io.IOException;

import com.Main;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class shirtpagecontroller {

    private int num;
    @FXML
    private Button addToCart;
    @FXML
    private Label cartNum;
    
    public shirtpagecontroller() {

    }

    public void SelectSearch(ActionEvent event) throws IOException {
        Main m = new Main();
        m.ChangeScene("com/mainpage.fxml");
    }

    public void SelectAddToCart(ActionEvent event) throws IOException {
        num++;
        cartNum.setText(""+num);
    }
}
