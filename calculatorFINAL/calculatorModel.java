package calculatorFINAL;

public class calculatorModel {
    int operator=0;
    float number1;
    float number2;
    float result;
    
    public void setNumber(String number){
        if(number != ""){
            if(operator == 0){
                number1=Float.valueOf(number);
            }else{
                number2=Float.valueOf(number);
            }
        }
    }
    public void setOperator(int operator){
        this.operator=operator;
    }
    
    public float getResult(){
        return result;
    }
    public void setResult(float result){
        this.result = result;
    }
    
    public void compute(){
        switch(operator){
            case 1: 
                result = number1 + number2;
                break;
            case 2:
                result = number1 - number2;
                break;
            case 3:
                result = number1 * number2;
                break;
            case 4:
                result = number1 / number2;
                break;
            //trigonometric function
            case 5:
                result = (float) Math.sin(Math.toRadians(number1));//(float) Math.toRadians(Math.sin(number1));
                break;
            case 6:
                result = (float) Math.cos(Math.toRadians(number1));
                break;
            case 7:
                result = (float) Math.tan(Math.toRadians(number1));
                break;
            //square root
            case 8:
                result = (float) Math.sqrt(number1);
        } number1 = result;
    }
}
