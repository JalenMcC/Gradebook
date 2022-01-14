package GUIComponents;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BorderFactory;

public class BasicFrame extends JFrame {
	
	//Creates the default window frame for the program


	JPanel titleSection, bodySection, footerSection;
	JPanel centerBody, centerTitle;
	JLabel title;
	
	public BasicFrame() {
		
		// Initializes the default frame
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setSize(500, 600);
		//frame.getContentPane().setBackground(new Color(0, 38, 77)); //Navy Blue ish
		
		
		//Creates panels to divide the frame into sections
		titleSection = new JPanel();
		bodySection = new JPanel();
		footerSection = new JPanel();
		centerBody = new JPanel();
		centerTitle = new JPanel();
		
		//TODO: Remove this section later, 
		//		just using as guidelines
		//titleSection.setBackground(Color.white);
		//bodySection.setBackground(Color.darkGray);
		//footerSection.setBackground(Color.lightGray);
		
		titleSection.setBackground(new Color(0, 38, 77));
		bodySection.setBackground(new Color(0, 38, 77));
		footerSection.setBackground(new Color(0, 38, 77));
		centerTitle.setBackground(Color.white);
		
		//Sets the size of the guideline panels
		titleSection.setPreferredSize(new Dimension(0, 100));	//125??
		bodySection.setPreferredSize(null);
		footerSection.setPreferredSize(new Dimension(0, 75));
		
		//TODO: testing stuff
		//centerBody.setBackground(Color.red);
		//centerBody.setPreferredSize(new Dimension(0, 100));
		
		//Main "Gradebook" Title Text
		title = new JLabel("Gradebook");
		title.setFont(new Font("Monospaced", Font.BOLD, 50));
		title.setForeground(Color.black);
		title.setHorizontalTextPosition(JLabel.CENTER);
		title.setVerticalTextPosition(JLabel.BOTTOM);
		//title.setBorder(BorderFactory.createEmptyBorder(25, 25, 25, 25));
		
		this.add(titleSection, BorderLayout.NORTH);
		this.add(bodySection, BorderLayout.CENTER);
		this.add(footerSection, BorderLayout.SOUTH);
		
		//centerTitle
		titleSection.add(centerTitle);
		centerTitle.add(title);
		
		bodySection.setLayout(new BorderLayout());
		//horizontalGap, verticalGap
		
		bodySection.add(centerBody, BorderLayout.CENTER);
		bodySection.setBorder(BorderFactory.createEmptyBorder(25, 25, 25, 25));
		titleSection.add(centerTitle, BorderLayout.CENTER);
		titleSection.setBorder(BorderFactory.createEmptyBorder(25, 25, 25, 25));
		
		this.setVisible(true);
	}
	
	
	// Getters & Setters
	
	public JPanel getBodyPanel() {
		return bodySection;
	}
	
	public JPanel getTitlePanel() {
		return titleSection;
	}
	
	public JPanel getFooterPanel() {
		return footerSection;
	}
	
	public JPanel getCenterBodyPanel() {
		return centerBody;
	}
	
	public JPanel getCenterTitlePanel() {
		return centerTitle;
	}
}
