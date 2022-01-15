package GUIComponents;

import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class MainMenu implements ActionListener {
	
	BasicFrame mainMenu;
	JButton button1, button2, button3, button4;
	JPanel menuBody;
	
	public MainMenu() {
		
		mainMenu = new BasicFrame();
		menuBody = mainMenu.getCenterBodyPanel();
		
		//Maybe hold the names in a string array
		// and create the buttons with a for loop
		button1 = new JButton("Add Assignment(s)");
		button2 = new JButton("Remove Assignment(s)");
		button3 = new JButton("Print Assignment(s)");
		
		//maybe move this one to bottom right
		button4 = new JButton("Exit Program");
		
		
		button1.setFocusable(false);
		button2.setFocusable(false);
		button3.setFocusable(false);
		button4.setFocusable(false);
		
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		
		menuBody.setLayout(new GridBagLayout());
		GridBagConstraints cst = new GridBagConstraints();
		cst.insets = new Insets(10, 10, 10, 10);
		//menuBody.setLayout(new GridLayout(4, 1, 10, 10));
		//menuBody.setLayout(new FlowLayout());
		
		//
		button1.setBounds(100, 100, 100, 100);
		
		// Button 1
		cst.gridx = 0;
		cst.gridy = 0;
		cst.ipadx = 55;
		cst.ipady = 30;
		menuBody.add(button1, cst);
		
		// Button 2
		cst.gridx = 0;
		cst.gridy = 1;
		cst.ipadx = 30;
		cst.ipady = 30;
		menuBody.add(button2, cst);
		
		// Button 3
		cst.gridx = 0;
		cst.gridy = 2;
		cst.ipadx = 50;
		cst.ipady = 30;
		menuBody.add(button3, cst);
		
		// Button 4
		cst.gridx = 0;
		cst.gridy = 3;
		cst.ipadx = 90;
		cst.ipady = 30;
		menuBody.add(button4, cst);
		
		
		/*
		menuBody.add(button1);
		menuBody.add(button2);
		menuBody.add(button3);
		menuBody.add(button4);
		*/
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		//Add Assignments
		if (e.getSource() == button1) {
			mainMenu.dispose();
			new AddAssignments();
		}
		
		//Remove Assignments
		else if (e.getSource() == button2) {
			mainMenu.dispose();
			new RemoveAssignments();
		}
		
		//Print Assignments
		else if (e.getSource() == button3) {
			mainMenu.dispose();
			new PrintAssignments();
		}
		
		//Exit 
		else if (e.getSource() == button4) {
			mainMenu.dispose();
		}
		
	}
}
