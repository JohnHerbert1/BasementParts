package view;

import java.awt.Image;

import javax.swing.ImageIcon;

public abstract class Imagem {

	public ImageIcon Imagem(String titulo, int x, int y) {

		ImageIcon imagem= new ImageIcon("Business/Imagens/"+ titulo);
		Image nova= imagem.getImage();
		Image newimg = nova.getScaledInstance(x, y,java.awt.Image.SCALE_SMOOTH);
		return imagem= new ImageIcon(newimg);
	}
	
}
