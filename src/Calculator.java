
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		CalculatorView theView = new CalculatorView();
		CalculatorModel theModel = new CalculatorModel();
		
		//allows to interact with view and controller 
		CalculatorController theController = new CalculatorController(theView, theModel); 
		
		theView.setVisible(true);
	}

}
