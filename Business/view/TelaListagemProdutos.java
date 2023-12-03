package view;

import javax.swing.JLabel;

public class TelaListagemProdutos extends TelaPadrao {
	
	// Construtor que vai conter componentes da listagem de produtos.
	public TelaListagemProdutos() {
		adicionarTitulo();
		setVisible(true);
	}

	// Adicionar título da tela.
	private void adicionarTitulo() {
		JLabel lblTitulo = new JLabel("Listagem de Produtos");
		lblTitulo.setBounds(150, 200, 100, 250);
		add(lblTitulo);
	}

}
