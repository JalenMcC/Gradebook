package GUIComponents;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class RemoveAssignments implements ActionListener {

	//Each Basic Frame has a 
		//	- getBodyPanel()
		//	- getTitlePanel()
		//	- getFooterPanel()
		//	- getCenterBodyPanel()
		//	- getCenterTitlePanel()
	
	// Components
	BasicFrame frame = new BasicFrame();
	JButton returnButton = new JButton("Return");
	
	JPanel main_PNL = frame.getCenterBodyPanel();
	
	JTextField name_TF = new JTextField();
	JTextField score_TF = new JTextField();
	JTextField date_TF = new JTextField();
	JTextField type_TF = new JTextField();
	
	JLabel name_L = new JLabel("Name");
	JLabel score_L = new JLabel("Score");
	JLabel date_L = new JLabel("Due Date");
	JLabel type_L = new JLabel("Type");
	
	ButtonGroup group = new ButtonGroup();
	JRadioButton first_B = new JRadioButton("First Found");
	JRadioButton all_B = new JRadioButton("All");
	
	
	RemoveAssignments() {
		returnButton.setFocusable(false);
		returnButton.addActionListener(this);
		
		// Adds radio buttons to group
		group.add(first_B);
		group.add(all_B);
		
		// Adds action listeners
		first_B.addActionListener(this);
		all_B.addActionListener(this);
		
		// Layout
		main_PNL.setLayout(new GridBagLayout());
		GridBagConstraints cst = new GridBagConstraints();
		cst.insets = new Insets(10, 10, 10, 10);
		
		//cst.anchor
		
		// Name Label
		cst.gridx = 0;
		cst.gridy = 0;
		main_PNL.add(name_L, cst);
		
		// Name Text Field
		cst.gridx = 1;
		cst.gridy = 0;
		name_TF.setPreferredSize(new Dimension(150, 30));
		main_PNL.add(name_TF, cst);
		
		// Score Label
		cst.gridx = 0;
		cst.gridy = 1;
		main_PNL.add(score_L, cst);
					
		// Score Text Field
		cst.gridx = 1;
		cst.gridy = 1;
		score_TF.setPreferredSize(new Dimension(150, 30));
		main_PNL.add(score_TF, cst);
		
		// Due Date Label
		cst.gridx = 0;
		cst.gridy = 2;
		main_PNL.add(date_L, cst);
		
		// Due Date Text Field
		cst.gridx = 1;
		cst.gridy = 2;
		date_TF.setPreferredSize(new Dimension(150, 30));
		main_PNL.add(date_TF, cst);
		
		// Type Label
		cst.gridx = 0;
		cst.gridy = 3;
		main_PNL.add(type_L, cst);
					
		// Type Text Field
		cst.gridx = 1;
		cst.gridy = 3;
		type_TF.setPreferredSize(new Dimension(150, 30));
		main_PNL.add(type_TF, cst);
		
		// First Radio Button
		cst.gridx = 0;
		cst.gridy = 4;
		main_PNL.add(first_B, cst);
		
		// All Radio Button
		cst.gridx = 1;
		cst.gridy = 4;
		main_PNL.add(all_B, cst);
		
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
