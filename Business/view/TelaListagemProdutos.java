package view;

import java.awt.Font;
import javax.swing.JLabel;

public class TelaListagemProdutos extends TelaPadrao {

	// Construtor que vai conter componentes da listagem de produtos.
	public TelaListagemProdutos() {
		adicionarTitulo();
		detalharProduto();
		setVisible(true);
	}

	// Adicionar título da tela.
	private void adicionarTitulo() {
		JLabel lblTitulo = new JLabel("Listagem de Produtos");
		lblTitulo.setBounds(340, 0, 200, 110);
		lblTitulo.setFont(new Font("Arial", Font.BOLD, 18));
		add(lblTitulo);
	}
	
	private void detalharProduto() {
		
	}

}
