package fabricas;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;


public class iLabel extends Fabrica{

	private static volatile iLabel instanci;
	
	public static synchronized iLabel getLabel() {	
		if(instanci == null) {
		return	instanci = new iLabel();
		}
		return instanci;
	}
	
	public JLabel produzir(String nome, int x, int y, int a, int b) {
		
		JLabel label= new JLabel(nome);
		label.setBounds(x, y, a, b);
		label.setFont(Fonte.fontePadrao());
		label.setVisible(true);
		
		return label;
	}

}
