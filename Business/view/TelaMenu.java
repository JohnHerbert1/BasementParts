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
	
	public void menul() {
		
		menu= new JMenu();
		menu.setVisible(true);
		add(menu);
	}
	
	
	public static void main(String[]args) {
		
		new TelaMenu();
	}
}
