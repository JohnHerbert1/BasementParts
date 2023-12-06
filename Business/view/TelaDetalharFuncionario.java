package view;

import javax.swing.JLabel;
import java.awt.Font;

public class TelaDetalharFuncionario extends TelaPadrao {
	
	public TelaDetalharFuncionario() {
		adicionarTituloTela("Detalhar Funcionário");
		adicionarLabelsDetalharFuncionario();
		setVisible(true);
	}

	private void adicionarLabelsDetalharFuncionario() {
		JLabel lblNome = new JLabel("Email:");
		lblNome.setBounds(110, 120, 250, 110);
		lblNome.setFont(new Font("Arial", Font.BOLD, 15));
		add(lblNome);
		JLabel lblIdFuncionario = new JLabel("Id Funcionário:");
		lblIdFuncionario.setBounds(110, 190, 250, 110);
		lblIdFuncionario.setFont(new Font("Arial", Font.BOLD, 15));
		add(lblIdFuncionario);
		JLabel lblNumero = new JLabel("Número:");
		lblNumero.setBounds(110, 260, 250, 110);
		lblNumero.setFont(new Font("Arial", Font.BOLD, 15));
		add(lblNumero);
		JLabel lbl
	}
	
	

}
