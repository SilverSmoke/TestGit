package sample;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;

public class Controller {
    public Button digit0;
    public Button equally;
    public Button digit9;
    public Button point;
    public Button digit8;
    public Button digit7;
    public Button division;
    public Button multiply;
    public Button digit6;
    public Button digit5;
    public Button minus;
    public Button digit3;
    public Button digit2;
    public Button digit1;
    public Button digit4;
    public Button plus;
    public Button sqr;
    public Button percent;
    public Button clear;
    @FXML
    public Button three0;
    @FXML
    public GridPane filder;



    @FXML
    public void clickDigit(ActionEvent actionEvent) {
        Button button = (Button) actionEvent.getSource();
        String textButton = button.getText();
        System.out.println(button.getText());
        button.setFocusTraversable(false);
    }

    @FXML
    public void clickAction(ActionEvent actionEvent) {
        Button button = (Button) actionEvent.getSource();
        String str = ((Button) actionEvent.getSource()).getText();
        button.setFocusTraversable(false);
        System.out.println(button.getText());
    }
}
