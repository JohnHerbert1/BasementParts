package view;

import java.awt.Font;

import javax.swing.JLabel;

public class iLabel extends JLabel{

	public iLabel(String titulo, int x, int y, int a, int b) {
		
		JLabel label= new JLabel(titulo);
		label.setBounds(x, y, a, b);
		label.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label.setVisible(true);
	}
}
