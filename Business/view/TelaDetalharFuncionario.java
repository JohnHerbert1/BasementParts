package view;

import javax.swing.JLabel;
import java.awt.Font;

public class TelaDetalharFuncionario extends TelaPadrao {
	
	// Métodos para adicionar componentes da tela.
	public TelaDetalharFuncionario() {
		adicionarTituloTela("Detalhar Funcionário");
		adicionarLabelsDetalharFuncionario();
		setVisible(true);
	}

	// Labels dos dados do funcionário
	private void adicionarLabelsDetalharFuncionario() {
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setBounds(110, 120, 250, 110);
		lblEmail.setFont(new Font("Arial", Font.BOLD, 15));
		add(lblEmail);
		
		JLabel lblNumero = new JLabel("Número:");
		lblNumero.setBounds(110, 190, 250, 110);
		lblNumero.setFont(new Font("Arial", Font.BOLD, 15));
		add(lblNumero);
		
		JLabel lblIdFuncionario = new JLabel("Id:");
		lblIdFuncionario.setBounds(110, 260, 250, 110);
		lblIdFuncionario.setFont(new Font("Arial", Font.BOLD, 15));
		add(lblIdFuncionario);
		
		JLabel lblSalario = new JLabel("Salário:");
		lblSalario.setBounds(110, 330, 250, 110);
		lblSalario.setFont(new Font("Arial", Font.BOLD, 15));
		add(lblSalario);
		
		JLabel lblCargo = new JLabel("Cargo:");
		lblCargo.setBounds(110, 400, 250, 110);
		lblCargo.setFont(new Font("Arial", Font.BOLD, 15));
		add(lblCargo);		
	}

}
