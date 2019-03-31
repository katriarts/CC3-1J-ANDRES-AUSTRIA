package calculatorFINAL;
import java.awt.event.*;
public class calculatorController {

    private calculatorModel theModel;
    private calculatorFINAL theView;
    
    
    public calculatorController(calculatorModel theModel, calculatorFINAL theView){
        this.theModel = theModel;
        this.theView = theView;   
    
//        this.theView.addCalculateListener(new CalculateListener());
//        this.theView.equalsActionPerformed(new equalsActionPerformed());

    }

//    class CalculateListener implements ActionListener{

//        @Override
//        public void actionPerformed(ActionEvent e) {
//            float number1 = (float) 0.0, number2 = (float) 0.0, result = (float) 0.0;
         
            
//            theModel.compute(number1, number2, result);
//            theView.equals(theModel.getResult());
//        }
//    }    
}
