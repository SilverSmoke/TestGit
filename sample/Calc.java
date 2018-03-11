package sample;

public class Calc {

    private double firstElement = 0;

    private double secondElement;

    private double result;

    private String action = "";

    public void setAction(String string){
        if(string.equals("C")){
            clear();
            return;
        }else if(string.equals("=")){
            calculation();
            return;
        }
        action = string;
    }

    public void setFirstElement(String string){

        firstElement = Double.parseDouble(string);

    }

    public void setSecondElement(String string){

        secondElement = Double.parseDouble(string);

    }

    public void calculation(){

        //if(action.isEmpty())return null;
        switch (action){
            case "+":
                result = firstElement + secondElement;
                break;
            case "-":
                result = firstElement - secondElement;
                break;
            case "/":
                result = firstElement / secondElement;
                break;
            case "*":
                result = firstElement * secondElement;
                break;
            default:
                //action = "";
                //setFirstElement(string);
                result = firstElement;
        }
        firstElement = result;
    }

    public Double getResult(){
        return firstElement;
    }

    public void clear() {
        firstElement = 0;
        secondElement = 0;
        result = 0;
        action = "";
    }

    public void setElement(String element) {
        if(action.equals("")){
            setFirstElement(element);
        }else{
            setSecondElement(element);
        }
        System.out.println(firstElement + "::" + secondElement);
    }
}
