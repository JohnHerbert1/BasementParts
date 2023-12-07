package view;

import java.awt.Font;
import javax.swing.JLabel;

public class TelaDetalharServico extends TelaPadrao {
	
	public TelaDetalharServico() {
		adicionarTituloTela("Detalhar Serviço");
		adicionarLabelsTela();
		setVisible(true);
	}

	private void adicionarLabelsTela() {
		JLabel lblNomeCliente = new JLabel("Nome Cliente:");
		lblNomeCliente.setBounds(110, 120, 250, 110);
		lblNomeCliente.setFont(new Font("Arial", Font.BOLD, 15));
		add(lblNomeCliente);
		
		JLabel lblNomeVendedor = new JLabel("Nome do vendedor:");
		lblNomeVendedor.setFont(new Font("Arial", Font.BOLD, 15));
		lblNomeVendedor.setBounds(110, 150, 250, 110);
		add(lblNomeVendedor);
		
		JLabel lblNomeMecanico = new JLabel("Nome do Mecânico:");
		lblNomeMecanico.setFont(new Font("Arial", Font.BOLD, 15));
		lblNomeMecanico.setBounds(110, 180, 250, 110);
		add(lblNomeMecanico);
		
		JLabel lblIdServico = new JLabel("Id:");
		lblIdServico.setBounds(110, 210, 250, 110);
		lblIdServico.setFont(new Font("Arial", Font.BOLD, 15));
		add(lblIdServico);
		
		JLabel lblPreco = new JLabel("Preço:");
		lblPreco.setBounds(110, 240, 250, 110);
		lblPreco.setFont(new Font("Arial", Font.BOLD, 15));
		add(lblPreco);

		JLabel lblDataServico = new JLabel("Data do Serviço:");
		lblDataServico.setFont(new Font("Arial", Font.BOLD, 15));
		lblDataServico.setBounds(110, 270, 250, 110);
		add(lblDataServico);
		
		JLabel lblProduto = new JLabel("Produto:");
		lblProduto.setFont(new Font("Arial", Font.BOLD, 15));
		lblProduto.setBounds(110, 300, 250, 110);
		add(lblProduto);
		
		JLabel lblNumeroTelefone = new JLabel("Número de telefone:");
		lblNumeroTelefone.setFont(new Font("Arial", Font.BOLD, 15));
		lblNumeroTelefone.setBounds(110, 330, 250, 110);
		add(lblNumeroTelefone);

		JLabel lblTipoOS = new JLabel("Tipo de Serviço:");
		lblTipoOS.setFont(new Font("Arial", Font.BOLD, 15));
		lblTipoOS.setBounds(110, 360, 250, 110);
		add(lblTipoOS);
		
		JLabel lblSituacao = new JLabel("Situação:");
		lblSituacao.setFont(new Font("Arial", Font.BOLD, 15));
		lblSituacao.setBounds(110, 390, 250, 110);
		add(lblSituacao);
		
		JLabel lblPrioridade = new JLabel("Prioridade:");
		lblPrioridade.setFont(new Font("Arial", Font.BOLD, 15));
		lblPrioridade.setBounds(110, 420, 250, 110);
		add(lblPrioridade);
	}

}
