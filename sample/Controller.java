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

    private String textDisplay = "";

    Calc calculator = new Calc();



    @FXML
    public void clickDigit(ActionEvent actionEvent) {
        Button button = (Button) actionEvent.getSource();
        String textButton = button.getText();
        //String displayText = display.getText();
        if(textDisplay.equals("")){
            textDisplay = textButton;

        }else {
            textDisplay = textDisplay + textButton;
        }
        display.setText(textDisplay);
        System.out.println(button.getText());//Test
    }

    @FXML
    public void clickAction(ActionEvent actionEvent) {
        Button button = (Button) actionEvent.getSource();
        String str = ((Button) actionEvent.getSource()).getText();

        calculator.setElement(display.getText());
        textDisplay = "";
        display.setText(String.valueOf(calculator.getResult()));

        switch (str){
            case "C":
                clearDisplay();
                break;
            case "=":

                break;
            case "+":
                calculator.setAction("+");
                break;
            case "-":
                calculator.setAction("-");
                break;
            case "/":
                calculator.setAction("/");
                break;
            case "*":
                calculator.setAction("*");
                break;
            case "%":
                calculator.setAction("%");
                break;
            case "SQR":
                calculator.setAction("SQR");
                break;
        }


        System.out.println(button.getText());//Test
    }

    private void clearDisplay() {
        display.setText("0");
        calculator.clear();
    }
}
