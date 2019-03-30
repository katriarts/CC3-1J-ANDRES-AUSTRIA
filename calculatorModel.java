package calculatorFINAL;

public class calculatorModel {
//    private int calculate;
//    float number1, number2;
    
    public float compute(float number1,float number2, String operator){
        switch(operator){
            case "+": return number1 + number2;
            case "-": return number1 - number2; 
            case "*": return number1 * number2;
            case "/": if(number2 == 0) return 0;
                      return number1 / number2;            
            //trigonometric function
//            case "sin(":
//            case "cos(":
//            case "tan(":
        }
        return 0;
    }
}
