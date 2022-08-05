/**
  * ITCC 11 A
  * Sample GUI calculator
  */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Calculator extends JFrame {
		
	private JTextField display;
	private JButton okButton;
	private JPanel panel;
	private int counter;
	private ButtonClick buttonClicker;
	private SampleListener sampleListener;
	
	/**
	  * constructor
	  */
	public Calculator() {
		
		super("test");
		
		counter = 0;
		display = new JTextField(10);
		okButton = new JButton("Click Me");
		panel = new JPanel();

		buttonClicker = new ButtonClick();
		
		okButton.addActionListener(buttonClicker);
		
		// anonymous
		okButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Button is Clicked");
			}	
		});
		
		sampleListener = new SampleListener(display);
		
		okButton.addActionListener(sampleListener);
		
		panel.add(display);
		panel.add(okButton);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.add(panel);
		this.pack();
		this.setVisible(true);
	}

	public static void main(String args[]) {
	
		Calculator calc = new Calculator();
	}	
	
	// inner class
	class ButtonClick implements ActionListener {
		
		@Override 
		public void actionPerformed(ActionEvent e) {
			
			counter++;
			display.setText(Integer.toString(counter));
		}	
	}	
}
