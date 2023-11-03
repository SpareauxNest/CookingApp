package me.frontEnd;

import javafx.scene.control.Label;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RootLayoutControllerTest {
    @Test
    public void testRootLayoutController() {
        RootLayoutController controller = new RootLayoutController();
        Label titleLabel = new Label();
        controller.setTitleLabel(titleLabel); 
        controller.initialize();
        assertEquals("Hello, JavaFX!", titleLabel.getText());
    }

}