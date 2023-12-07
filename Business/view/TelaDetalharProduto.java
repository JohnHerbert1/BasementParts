package view;

import java.awt.Font;
import javax.swing.JLabel;

public class TelaDetalharProduto extends TelaPadrao {
	
	// Adicionando os componentes da tela.
	public TelaDetalharProduto() {
		adicionarTituloTela("Detalhar Produto");
		adicionarLabelsDetalharProduto();
		setVisible(true);
	}

	// Adicionando os labels da tela.
	private void adicionarLabelsDetalharProduto() {
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(110, 120, 250, 110);
		lblNome.setFont(new Font("Arial", Font.BOLD, 15));
		add(lblNome);
		
		JLabel lblPreco = new JLabel("Preço:");
		lblPreco.setFont(new Font("Arial", Font.BOLD, 15));
		lblPreco.setBounds(110, 190, 250, 110);
		add(lblPreco);
		
		JLabel lblId = new JLabel("Id:");
		lblId.setFont(new Font("Arial", Font.BOLD, 15));
		lblId.setBounds(110, 260, 250, 110);
		add(lblId);
		
		JLabel lblMontadora = new JLabel("Montadora:");
		lblMontadora.setBounds(110, 330, 250, 110);
		lblMontadora.setFont(new Font("Arial", Font.BOLD, 15));
		add(lblMontadora);
		
		JLabel lblGrupo = new JLabel("Grupo:");
		lblGrupo.setBounds(110, 400, 250, 110);
		lblGrupo.setFont(new Font("Arial", Font.BOLD, 15));
		add(lblGrupo);

		JLabel lblNomeCliente = new JLabel("Nome do Cliente:");
		lblNomeCliente.setFont(new Font("Arial", Font.BOLD, 15));
		lblNomeCliente.setBounds(110, 470, 250, 110);
		add(lblNomeCliente);
	}

}
