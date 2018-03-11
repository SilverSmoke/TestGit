package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

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
    public Label display;

    private Boolean updateDisplay = true;

    Calc calculator = new Calc();

    @FXML
    public void clickDigit(ActionEvent actionEvent) {
        Button button = (Button) actionEvent.getSource();
        String textButton = button.getText();

        if(updateDisplay){
            display.setText(textButton);
        }else{
            display.setText(display.getText() + textButton);
        }

        updateDisplay = false;

        System.out.println(button.getText());//Test
    }

    @FXML
    public void clickAction(ActionEvent actionEvent) {
        Button button = (Button) actionEvent.getSource();
        String str = ((Button) actionEvent.getSource()).getText();

        if(!updateDisplay) {

            calculator.setElement(display.getText());

        }

        calculator.setAction(str);

        display.setText(String.valueOf(calculator.getResult()));

        updateDisplay = true;

        System.out.println(button.getText());//Test
    }
}
