/**
 * 
 */
package objekt;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * @author danand004
 *
 */
public class ObDemo extends JFrame {

	public ObDemo(){
		setLayout(new FlowLayout());
		
		JLabel j1 = new JLabel("hej",JLabel.CENTER);
		add(j1);
		
		setVisible(true);
		
	}
	
	
	
	
	
	
	
	
	
	public static void main(String [] arg){
		
		ObDemo demo1=new ObDemo(); 
	}
	
	
}
