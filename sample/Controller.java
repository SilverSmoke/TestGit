package sample;

import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

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
    public Button three0;

    public void click(MouseEvent mouseEvent) {

        System.out.println(mouseEvent.getButton().getClass());

    }




}
