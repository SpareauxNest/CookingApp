package me.frontEnd;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class RootLayoutController {
    public void setTitleLabel(Label titleLabel) {
        this.titleLabel = titleLabel;
    }

    @FXML
    private Label titleLabel;

    public void initialize() {
        titleLabel.setText("Hello, JavaFX!");
    }
}


