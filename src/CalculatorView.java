
import java.awt.event.ActionListener;

import javax.swing.*;

public class CalculatorView extends JFrame {
	
	private JTextField firstNum = new JTextField(10);
	private JLabel additionLabel = new JLabel("+");
	private JTextField secondNum = new JTextField(10);
	private JButton calculationButton = new JButton("Calculate");
	private JTextField calcSolution = new JTextField(10);
	
	CalculatorView(){ 
		// interface to display on screen
		JPanel calcPanel = new JPanel();
		
		//panel close on exit and setting size
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(700, 300);
		
		//setting up components
		calcPanel.add(firstNum);
		calcPanel.add(additionLabel);
		calcPanel.add(secondNum);
		calcPanel.add(calculationButton);
		calcPanel.add(calcSolution);

		this.add(calcPanel);
		
	}
	
	public int getFirstNum(){
		return Integer.parseInt(firstNum.getText()); //getText() return the value in the JTextField
		
	}
	
	public int getSecondNum(){
		return Integer.parseInt(secondNum.getText());
	}
	
	public int getCalcSolution(){
		return Integer.parseInt(calcSolution.getText());
	}

	public void setCalcSolution(int solution){
		
		calcSolution.setText(Integer.toString(solution));
		
	}
	
}











