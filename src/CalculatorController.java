import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorController {

	private CalculatorView theView;
	private CalculatorModel theModel;
	
	public CalculatorController(CalculatorView theView, CalculatorModel theModel){
		
		this.theView= theView;
		this.theModel = theModel;
		
		this.theView.addCalculateListener(new CalculateListener());
		
		
	}
	class CalculateListener implements ActionListener{

		public void actionPerformed(ActionEvent arg0) {
				
					
			int firstNum, secondNum =0;
					try{
						
						firstNum = theView.getFirstNum();
						secondNum = theView.getSecondNum();
						
						theModel.addTwoNumbers(firstNum, secondNum);
						
						
						theView.setCalcSolution(theModel.getCalculationValue());
					}
					catch(NumberFormatException ex){
						
						theView.displayErrorMessage("Enter the values");
					}
				
		
		}
	}
	
}

	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	