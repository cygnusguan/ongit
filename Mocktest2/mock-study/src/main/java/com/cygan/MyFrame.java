package com.cygan;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextField;

public class MyFrame extends JFrame {
	public MyFrame() {
		setTitle("My Frame");
		setSize(200, 100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container content = getContentPane();
		Box vbox = new Box(BoxLayout.Y_AXIS);
		content.add(vbox, BorderLayout.CENTER);

		final JLabel showTextLabel = new JLabel(" ");
		showTextLabel.setName("show");
		vbox.add(showTextLabel);
		final JTextField input = new JTextField();
		input.setName("input");
		vbox.add(input);
		
		final JComboBox<String> list = new JComboBox<String>(new String[]{"A","B","C"});
		list.setName("list");
		vbox.add(list);
		
		JButton button = new JButton("copy");
		button.setName("copy");
		
		
		
		
		button.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				showTextLabel.setText(input.getText());
				
			}
		});
		vbox.add(button);
	}
}