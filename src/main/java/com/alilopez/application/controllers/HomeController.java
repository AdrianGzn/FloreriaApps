package com.alilopez.application.controllers;

import com.alilopez.application.App;
import com.gluonhq.charm.glisten.control.BottomNavigationButton;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

public class HomeController {

    @FXML
    private BottomNavigationButton clientButton;

    @FXML
    private Button exitButton;

    @FXML
    private BottomNavigationButton petButton;

    @FXML
    void onClickClientButton(MouseEvent event) {
        App.newStage("client-view","Floreria");
    }

    @FXML
    void onClickPetButton(MouseEvent event) {
        App.newStage("pet-view","Cobro");
    }

    @FXML
    void onMouseClickExitButton(MouseEvent event) {
        App.getStageView().close();
    }

}
