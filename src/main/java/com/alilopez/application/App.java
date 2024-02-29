package com.alilopez.application;

import com.alilopez.application.models.Flores;
import com.alilopez.application.models.Girasol;
import com.alilopez.application.models.Lirio;
import com.alilopez.application.models.Ortencia;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;
import org.kordamp.bootstrapfx.BootstrapFX;


import java.io.IOException;

public class App extends javafx.application.Application {
    private static Girasol girasol = new Girasol();
    private static Lirio lirio = new Lirio();
    private static Ortencia ortencia = new Ortencia();
    private static Stage stageView;
    private static Stage stageRoot;
    @Override
    public void start(Stage stage) throws IOException {
        stageRoot = stage;
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("home-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        scene.getStylesheets().add(BootstrapFX.bootstrapFXStylesheet());
        stage.setTitle("NameApplication - Home");
        stage.setScene(scene);
        stage.centerOnScreen();
        stage.show();
    }

    public static void newStage(String fxml, String title) {
        stageView = new Stage();
        Scene scene = null;
        try {
            scene = new Scene(loadFXML(fxml));
            scene.getStylesheets().add(BootstrapFX.bootstrapFXStylesheet());
            stageView.setTitle(title);
            stageView.setScene(scene);
            stageView.centerOnScreen();
            stageView.initOwner(stageRoot);
            stageView.initModality(Modality.APPLICATION_MODAL);
            stageView.showAndWait();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void setGirasol(Girasol girasol) {App.girasol = girasol;}
    public static void setLirio(Lirio lirio) {App.lirio = lirio;}
    public static void setOrtencia(Ortencia ortencia) {App.ortencia = ortencia;}
    public static Girasol getGirasol() {return girasol;}
    public static Lirio getLirio() {return lirio;}
    public static Ortencia getOrtencia() {return ortencia;}

    public static Stage getStageView(){
        return stageView;
    }
    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
        System.exit(1);
    }
}