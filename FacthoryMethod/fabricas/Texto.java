package fabricas;
import javax.swing.JFrame;
import javax.swing.JTextField;

import control.AdmControl;
import model.AdmModel;

public class Texto extends Fabrica{

	private static volatile Texto instanci;
	
	public static synchronized Texto getTexto() {	
		if(instanci == null) {
		return	instanci = new Texto();
		}
		return instanci;
	}
	
	public JTextField produzir( String nome, int x, int y, int a, int b) {
		
		JTextField text= new JTextField();
		text.setBounds(x, y, a, b);
		text.setFont(Fonte.fontePadrao());
		text.setVisible(true);
		
		return text;
	}
}
