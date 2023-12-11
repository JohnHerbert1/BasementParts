package fabricas;

import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JFrame;

public abstract class Fabrica {

	
	public abstract Object produzir(String nome, int x, int y, int a, int b);
	
}
