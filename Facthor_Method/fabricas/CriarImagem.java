package fabricas;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JComponent;

public class CriarImagem extends Fabrica{

	private static volatile CriarImagem instanci;
	
	public static synchronized CriarImagem getCriarImagem() {	
		if(instanci == null) {
		return	instanci = new CriarImagem();
		}
		return instanci;
	}
	
	public ImageIcon produzir(String nome, int x, int y, int a, int b) {
		
		ImageIcon imagem= new ImageIcon(nome, "");
		Image nova= imagem.getImage();
		Image newimg = nova.getScaledInstance(x, y,java.awt.Image.SCALE_SMOOTH);
		imagem= new ImageIcon(newimg);
		
		return imagem;
	}

}
