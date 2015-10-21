/*
 * MultTable.java
 * 
 * Copyright 2015 Ajay Bhatia <ajay@arch>
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 * 
 * 
 */

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.GridLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class MultTable extends JFrame {
	private JLabel numberLabel;
	private JLabel limitLabel;
	private JLabel noLabel;
	
	private JTextField numberText;
	private JTextField limitText;
	
	private JButton resultButton;
	
	public MultTable() {
		numberLabel = new JLabel("Enter a number:");
		limitLabel = new JLabel("Enter a limit:");
		noLabel = new JLabel();
	
		numberText = new JTextField();
		limitText = new JTextField();
	
		resultButton = new JButton("Result");
		
		setLayout(new GridLayout(3, 2));
		
		add(numberLabel);
		add(numberText);
		add(limitLabel);
		add(limitText);
		add(noLabel);
		add(resultButton);
		
		resultButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int n = Integer.parseInt(numberText.getText());
				int m = Integer.parseInt(limitText.getText());
				
				StringBuilder sb = new StringBuilder();
				
				for (int i = 1; i <= m; i++)
					sb.append(n)
						.append(" X ")
						.append(i)
						.append(" = ")
						.append(n * i)
						.append("\n");
						
				JOptionPane.showMessageDialog(
					null, 
					sb.toString(), 
					"Table of " + n, JOptionPane.INFORMATION_MESSAGE);
			}
		});
	}
	
	public static void main (String args[]) {
		MultTable obj = new MultTable();
		obj.setDefaultCloseOperation(EXIT_ON_CLOSE);
		obj.pack();
		obj.setVisible(true);
	}
}

