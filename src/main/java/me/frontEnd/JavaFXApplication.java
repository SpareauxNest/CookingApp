package me.frontEnd;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class JavaFXApplication extends Application {
    private Stage primaryStage;
    private BorderPane rootLayout;

    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("JavaFX Test");

        initRootLayout();
    }

    private void initRootLayout() {
        try {
// Load root layout from fxml file.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Application.class.getResource("/fxml/RootLayout.fxml"));
            rootLayout = loader.load();
// Show the scene containing the root layout.

            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
launch(args);
    }
}
