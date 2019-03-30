package calculatorFINAL;

public class calculatorMain {
    public static void main(String[] args) {
    calculatorFINAL theView = new calculatorFINAL();
    calculatorModel theModel = new calculatorModel();
    calculatorController theController= new calculatorController(theModel, theView);
    theView.setVisible(true);
    }
}
