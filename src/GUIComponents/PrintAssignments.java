package GUIComponents;

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
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class PrintAssignments implements ActionListener {

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
	JPanel list_PNL = new JPanel();
	
	ButtonGroup rbOrderGP = new ButtonGroup();
	ButtonGroup rbTypeGP = new ButtonGroup();
	
	JRadioButton ascend_RB = new JRadioButton("Ascending");
	JRadioButton descend_RB = new JRadioButton("Descending");
	JRadioButton name_RB = new JRadioButton("Name");
	JRadioButton grade_RB = new JRadioButton("Grade");
	JRadioButton date_RB = new JRadioButton("Due Date");
	
	JTextArea list_TA = new JTextArea();
	JScrollPane list_SP = new JScrollPane(list_TA);
	
	// May not need these
	JLabel ascend_LBL = new JLabel("Ascending");
	JLabel descend_LBL = new JLabel("Descending");
	JLabel name_LBL = new JLabel("Name");
	JLabel grade_LBL = new JLabel("Grade");
	JLabel date_LBL = new JLabel("Due Date");
	
	PrintAssignments() { 
		returnButton.setFocusable(false);
		returnButton.addActionListener(this);
		
		// Adds buttons to groups
		rbOrderGP.add(ascend_RB);
		rbOrderGP.add(descend_RB);
		rbTypeGP.add(name_RB);
		rbTypeGP.add(grade_RB);
		rbTypeGP.add(date_RB);
		
		// Gets rid of selection outlines
		ascend_RB.setFocusable(false);
		descend_RB.setFocusable(false);
		name_RB.setFocusable(false);
		grade_RB.setFocusable(false);
		date_RB.setFocusable(false);
		
		// Layout
		main_PNL.setLayout(new GridBagLayout());
		GridBagConstraints cst = new GridBagConstraints();
		cst.insets = new Insets(10, 10, 10, 10);
		
		// Ascending Button
		cst.gridx = 0;
		cst.gridy = 0;
		cst.gridwidth = 3;
		main_PNL.add(ascend_RB, cst);
		
		// Descending Button
		cst.gridx = 4;
		cst.gridy = 0;
		cst.gridwidth = 3;
		main_PNL.add(descend_RB, cst);
		
		// Name Button
		cst.gridx = 0;
		cst.gridy = 1;
		cst.gridwidth = 2;
		main_PNL.add(name_RB, cst);
		
		// Grade Button
		cst.gridx = 2;
		cst.gridy = 1;
		main_PNL.add(grade_RB, cst);
		
		// Due Date Button
		cst.gridx = 4;
		cst.gridy = 1;
		main_PNL.add(date_RB, cst);
		
		// List Panel
		cst.gridx = 0;
		cst.gridy = 2;
		cst.gridwidth = 9;
		cst.ipady = 120;
		cst.fill = GridBagConstraints.BOTH;
		//cst.ipadx = 200;
		//cst.weightx = 1.0; 
		cst.anchor = GridBagConstraints.PAGE_END; 
		main_PNL.add(list_SP, cst);
		
		
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
