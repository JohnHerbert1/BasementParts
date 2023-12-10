package view;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class TelaMenu extends TelaPadrao{

	private JMenu menu;
	private JMenuBar barraMenu;
	private JMenuItem item;
	
	
	public TelaMenu() {
		
		adicionarTituloTela("");
		setVisible(true);
	}
	
	
	public static void main(String[]args) {
		
		new TelaMenu();
	}
}
