
public class CalculatorModel {

	private int calculationValue;
	
	public void addTwoNumbers(int firstNum, int secondNum){
		
		calculationValue = firstNum + secondNum;
		//calculationValue = firstNum * secondNum;
	}
	
	public int getCalculationValue(){
		return calculationValue;
	}
	
		
}
