package fabricas;

import javax.swing.JButton;
import javax.swing.JComponent;

public class Button extends Fabrica{

	private static volatile Button instanci;
	
	public static synchronized Button getButton() {	
		if(instanci == null) {
		return	instanci = new Button();
		}
		return instanci;
	}
	
	
	public JButton produzir(String nome, int x, int y, int a, int b) {
		
		JButton botao= new JButton(nome);
		botao.setBounds(x, y, a, b);
		botao.setVisible(true);
		
		return botao;
	}

}
