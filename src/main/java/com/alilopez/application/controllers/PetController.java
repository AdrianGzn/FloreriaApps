package com.alilopez.application.controllers;

import com.alilopez.application.App;
import com.alilopez.application.models.Girasol;
import com.alilopez.application.models.Lirio;
import com.alilopez.application.models.Ortencia;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class PetController {

    @FXML
    private TextField nombreInput1;

    @FXML
    private TextField cantidadInput;

    @FXML
    private Button closeButton;

    @FXML
    private TextField precioInput;

    @FXML
    private Button onClickGuardar;

    @FXML
    void onClickCloseButton(MouseEvent event) {
        App.getStageView().close();
    }

    @FXML
    void onClickGuardar(MouseEvent event) {
        String nombre = nombreInput1.getText();
        int precio = Integer.parseInt(precioInput.getText());
        int cantidad = Integer.parseInt(cantidadInput.getText());

        if (nombre.equals("Ortensia")){
            Ortencia ortencia = new Ortencia(nombre, cantidad, precio);
            App.setOrtencia(ortencia);
        }else if (nombre.equals("Lirio")){
            Lirio lirio = new Lirio(nombre, cantidad, precio);
            App.setLirio(lirio);
        }else if (nombre.equals("Girasol")){
            Girasol girasol = new Girasol(nombre, cantidad, precio);
            App.setGirasol(girasol);
        }

    }

}
