package GUIComponents;

import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
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
		
		button1 = new JButton("Add Assignment(s)");
		button2 = new JButton("Remove Assignment(s)");
		button3 = new JButton("Print Assignment(s)");
		
		//maybe move this one to bottom right
		button4 = new JButton("Quit(?)");
		
		
		button1.setFocusable(false);
		button2.setFocusable(false);
		button3.setFocusable(false);
		button4.setFocusable(false);
		
		//menuBody.setLayout(new GridBagLayout());
		menuBody.setLayout(new GridLayout(4, 1, 10, 10));
		//menuBody.setLayout(new FlowLayout());
		
		//
		button1.setBounds(100, 100, 100, 100);
		
		menuBody.add(button1);
		menuBody.add(button2);
		menuBody.add(button3);
		menuBody.add(button4);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		//
		if (e.getSource() == button1) {
			
		}
		
		//
		else if (e.getSource() == button2) {
			
		}
		
		//
		else if (e.getSource() == button2) {
			
		}
		
		//
		else if (e.getSource() == button2) {
			
		}
		
	}
}