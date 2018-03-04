package sample;

public class Calc {

    private double firstElement;

    private double secondElement;

    private double result;

    private String action = "+";

    public void setAction(String string){
        action = string;
    }

    public void setFirstElement(String string){

        firstElement = Double.parseDouble(string);

    }

    public void setSecondElement(String string){

        secondElement = Double.parseDouble(string);

    }

    public Double getResult(){
        if(action.isEmpty())return null;
        switch (action){
            case "+":
                firstElement += secondElement;
                break;
            case "-":
                firstElement -= secondElement;
                break;
            case "/":
                firstElement /= secondElement;
                break;
            case "*":
                firstElement *= secondElement;
                break;
            default:
                action = "+";
                //result = firstElement;
        }
        //firstElement = result;
        //secondElement = 0;
        return  firstElement;
    }

    public void clear() {
        firstElement = 0;
        secondElement = 0;
        result = 0;
        action = "+";
    }

    public void setElement(String element) {
        if(firstElement == 0){
            setFirstElement(element);
        }else{
            setSecondElement(element);
        }
        System.out.println(firstElement + "::" + secondElement);
    }
}
