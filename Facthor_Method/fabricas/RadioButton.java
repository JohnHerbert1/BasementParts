package fabricas;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

import control.AdmControl;
import model.AdmModel;

public class RadioButton extends Fabrica{

	private static volatile RadioButton instanci;
	
	public static synchronized RadioButton getRadioButton() {	
		if(instanci == null) {
		return	instanci = new RadioButton();
		}
		return instanci;
	}
	
	public JRadioButton produzir(String nome, int x, int y, int a, int b) {
		
		JRadioButton radio= new JRadioButton(nome);
		radio.setBounds(x, y, a, b);
		radio.setVisible(true);
		
		return radio;
	}
	
}
