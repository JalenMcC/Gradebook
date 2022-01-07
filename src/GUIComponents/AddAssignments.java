package GUIComponents;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class AddAssignments implements ActionListener{

	BasicFrame frame = new BasicFrame();
	JButton returnButton = new JButton("Return");
	
	//Each Basic Frame has a 
	//	- getBodyPanel()
	//	- getTitlePanel()
	//	- getFooterPanel()
	//	- getCenterBodyPanel()
	//	- getCenterTitlePanel()
	
	
	AddAssignments() {
		returnButton.setFocusable(false);
		returnButton.addActionListener(this);
		
		frame.getFooterPanel().add(returnButton);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		//Exit button
		if (e.getSource() == returnButton) {
			frame.dispose();
			new MainMenu();
		}
		
	}
	
}
