/**
  * ITCC 11
  */
import java.awt.event.*;
import javax.swing.JTextField;

class SampleListener implements ActionListener {

	private JTextField dp;
	
	// constructor 
	public SampleListener(JTextField d) {
		
		this.dp = d;
	}
	
	public void actionPerformed(ActionEvent e) {
	
		System.out.println(dp.getText());
	}
}