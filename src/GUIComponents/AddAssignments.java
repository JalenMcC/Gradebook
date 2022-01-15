package GUIComponents;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class AddAssignments implements ActionListener {

	//TODO: need to rename global variables
	
	//Each Basic Frame has a 
	//	- getBodyPanel()
	//	- getTitlePanel()
	//	- getFooterPanel()
	//	- getCenterBodyPanel()
	//	- getCenterTitlePanel()
	
	BasicFrame frame = new BasicFrame();
	JButton returnButton = new JButton("Return");
	
	JPanel rbPanel = new JPanel();
	JPanel tfPanel = frame.getCenterBodyPanel();
	JPanel submitPanel = new JPanel();
	
	JLabel nameL = new JLabel("Name", JLabel.CENTER);
	JLabel scoreL = new JLabel("Score");
	JLabel dateL = new JLabel("Due Date");
	JLabel optionL = new JLabel();
	
	ButtonGroup group = new ButtonGroup();
	JRadioButton quizB;
	JRadioButton discussB;
	JRadioButton programB;
	
	JTextField optionTF = new JTextField();
	JTextField nameTF = new JTextField();
	JTextField scoreTF = new JTextField();
	JTextField dateTF = new JTextField();
	
	//Make noneditable
	JTextField confirmTF = new JTextField();
	JButton submitB = new JButton("Submit");
	JButton cancelB = new JButton("Cancel");
	
	
	//Could use the same textbox for all 3 radio buttons
	// and just change the action based on radio button selection
	
	AddAssignments() {
		returnButton.setFocusable(false);
		returnButton.addActionListener(this);
		
		// Creates the radio buttons
		quizB  = new JRadioButton("Quiz");
		discussB  = new JRadioButton("Discussion");
		programB  = new JRadioButton("Program");
		 
		quizB.addActionListener(this);
		discussB.addActionListener(this);
		programB.addActionListener(this);
		
		// Adds the radio buttons to button group
		group.add(quizB);
		group.add(discussB);
		group.add(programB);
		
		//quizB.setSelected(true);
		
		// Adds radio buttons to radio button panel
		rbPanel.add(quizB);
		rbPanel.add(discussB);
		rbPanel.add(programB);
		
		tfPanel.setLayout(new GridBagLayout());
		GridBagConstraints cst = new GridBagConstraints();
		//cst.fill = GridBagConstraints.HORIZONTAL;
		cst.insets = new Insets(0, 0, 20, 0);
		//cst.anchor = GridBagConstraints.CENTER;
		
		// Radio Button Panel
		cst.gridx = 0;
		cst.gridy = 0;
		cst.gridwidth = 5;
		cst.weightx = 0;
		tfPanel.add(rbPanel, cst);
		
		// Name Label
		cst.insets = new Insets(10, 0, 0, 10);	//Insets(top, left, bot, right)
		cst.fill = GridBagConstraints.NONE;
		cst.gridx = 0;
		cst.gridy = 1;
		cst.gridwidth = 2;
		cst.weightx = 0.5;
		tfPanel.add(nameL, cst);
		
		// Name Text Field  
		cst.gridx = 2;
		cst.gridy = 1;
		cst.gridwidth = 2;
		cst.weightx = 0.5;
		nameTF.setPreferredSize(new Dimension(150, 30));
		tfPanel.add(nameTF, cst);
		
		// Score Label
		cst.gridx = 0;
		cst.gridy = 2;
		cst.weightx = 0.5;
		cst.gridwidth = 2;
		tfPanel.add(scoreL, cst);
		
		// Score Text Field
		cst.gridx = 2;
		cst.gridy = 2;
		cst.weightx = 0.5;
		cst.gridwidth = 2;
		scoreTF.setPreferredSize(new Dimension(150, 30));
		tfPanel.add(scoreTF, cst);
		
		// Date Label
		cst.gridx = 0;
		cst.gridy = 3;
		cst.weightx = 0.5;
		cst.gridwidth = 2;
		tfPanel.add(dateL, cst);
		
		// Date Text Field
		cst.gridx = 2;
		cst.gridy = 3;
		cst.weightx = 0.5;
		cst.gridwidth = 2;
		//dateTF.setText("mm/dd/yyyy");
		dateTF.setPreferredSize(new Dimension(150, 30));
		tfPanel.add(dateTF, cst);
		
		// Optional Label
		cst.gridx = 0;
		cst.gridy = 4;
		tfPanel.add(optionL, cst);
		
		// Optional Text Field
		cst.gridx = 2;
		cst.gridy = 4;
		optionTF.setPreferredSize(new Dimension(150, 30));
		tfPanel.add(optionTF, cst);
		
		// Submit Button
		cst.gridx = 0;
		cst.gridy = 6;
		cst.insets = new Insets(20, 10, 0, 0);
		submitB.addActionListener(this);
		tfPanel.add(submitB, cst);
		
		// Cancel Button
		cst.gridx = 2;
		cst.gridy = 6;
		cancelB.addActionListener(this);
		tfPanel.add(cancelB, cst);
		
		// Confirm Text Field
		cst.gridx = 0;
		cst.gridy = 8;
		cst.gridwidth = 5;
		confirmTF.setPreferredSize(new Dimension(200, 40));
		tfPanel.add(confirmTF, cst);
		
		
		// TODO: Delete this later
		//tfPanel.setBackground(Color.blue);
		submitPanel.setBackground(Color.green);
		
		frame.getFooterPanel().add(returnButton);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		//Exit button
		if (e.getSource() == returnButton) {
			frame.dispose();
			new MainMenu();
		}
		
		//Radio Buttons
		if (e.getSource() == quizB) {
			optionL.setText("Questions");
			optionTF.setText("Quiz");
			frame.setVisible(true);
		}
		else if (e.getSource() == discussB) {
			optionL.setText("Reading");
			optionTF.setText("Discussion");
			frame.setVisible(true);
		}
		else if (e.getSource() == programB) {
			optionL.setText("Concept");
			optionTF.setText("Program");
			frame.setVisible(true);
		}
		
	}
	
}
