package com.alilopez.application.controllers;

import com.alilopez.application.App;
import com.alilopez.application.models.Flores;
import com.alilopez.application.models.Girasol;
import com.alilopez.application.models.Lirio;
import com.alilopez.application.models.Ortencia;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.control.Alert.AlertType;
public class ClientController {

    @FXML
    private TextField cantidadInput;

    @FXML
    private Button closeButton;

    @FXML
    private Button confirmarBtn;

    @FXML
    private TextField nameFloresInput;

    @FXML
    void onClickCloseButton(MouseEvent event) {
        App.getStageView().close();
    }

    @FXML
    void onClickConfirmar(MouseEvent event) {
        String nombre = nameFloresInput.getText();
        int cantidad = Integer.parseInt(cantidadInput.getText());
        int precio=0;

        if (nombre.equals("Ortensia")){

            Ortencia ortencia = App.getOrtencia();
            precio = ortencia.getPrecio();
        }else if (nombre.equals("Girasol")){
            Girasol girasol = App.getGirasol();
            precio = girasol.getPrecio();
        }else if (nombre.equals("Lirio")){
            Lirio lirio = App.getLirio();
            precio = lirio.getPrecio();
        }
        int total = cantidad * precio;

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Venta");
        alert.setContentText("El monto a pagar por los " + cantidad + " " + nombre + " es: " + total);
        alert.showAndWait();
    }

}