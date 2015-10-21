/*
 * FontChooser.java
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
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JComboBox;

import java.awt.Font;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.GraphicsEnvironment;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class FontChooser extends JFrame {
	private JLabel resultLabel;
	private JPanel comboPanel;
	private JComboBox fontCombo;
	private JComboBox sizeCombo;
	
	public FontChooser() {
		fontCombo = new JComboBox();
		sizeCombo = new JComboBox();
		resultLabel = new JLabel(
			"The quick brown fox jumps over the lazy dog"
		);

		GraphicsEnvironment ge = 
			GraphicsEnvironment.getLocalGraphicsEnvironment();
		
		String[] fontNames = ge.getAvailableFontFamilyNames();
		
		for (String fontName : fontNames)
			fontCombo.addItem(fontName);

		for (int i = 10; i <= 72; i += 2)
			sizeCombo.addItem(i);

		comboPanel = new JPanel(new FlowLayout());
		comboPanel.add(fontCombo);
		comboPanel.add(sizeCombo);
		
		setLayout(new BorderLayout());
		add(comboPanel, BorderLayout.NORTH);
		add(resultLabel, BorderLayout.SOUTH);
		
		resultLabel.setForeground(Color.yellow);
		
		fontCombo.addItemListener(new ItemListener() {
				@Override
				public void itemStateChanged(ItemEvent e) {
					resultLabel
						.setFont(
							new Font(fontCombo.getSelectedItem().toString(),
							Font.BOLD+Font.ITALIC,
							Integer.parseInt(sizeCombo.getSelectedItem().toString())));
				}
		});
		
		sizeCombo.addItemListener(new ItemListener() {
				@Override
				public void itemStateChanged(ItemEvent e) {
					resultLabel
						.setFont(
							new Font(fontCombo.getSelectedItem().toString(),
							Font.BOLD+Font.ITALIC,
							Integer.parseInt(sizeCombo.getSelectedItem().toString())));
				}
		});
	}
	
	public static void main (String args[]) {
		FontChooser frame = new FontChooser();
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setSize(400, 300);
		frame.setVisible(true);
	}
}

