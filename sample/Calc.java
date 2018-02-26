package sample;

public class Calc {

    private double firstElement;

    private double secondElement;

    private double result;

    private int action;

    public void setAction(String string){

    }

    public void setFirstElement(String string){

        firstElement = Double.parseDouble(string);

    }

    public void setSecondElement(String string){

        secondElement = Double.parseDouble(string);

    }

    public double getResult(){


        return  result;
    }

}
