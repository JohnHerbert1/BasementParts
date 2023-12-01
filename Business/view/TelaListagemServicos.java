package view;

import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class TelaListagemServicos extends TelaPadrao {
	
	public static void main(String[] args) {
		new TelaListagemServicos();
	}
	
	public TelaListagemServicos() {
		adicionarLabelTitulo();
		adicionarBotoesFiltragem();
		adicionarTabelaServicos();
		setVisible(true);
	}

	private void adicionarLabelTitulo() {
		JLabel lblTitulo = new JLabel("Listagem de Serviços");
		lblTitulo.setBounds(380, 20, 150, 100);
		add(lblTitulo);
	}
	
	private void adicionarBotoesFiltragem() {
		JRadioButton rdbtnTodos = new JRadioButton("Todos");
		rdbtnTodos.setBounds(100, 70, 100, 100);
		add(rdbtnTodos);
		JRadioButton rdbtnFinalizados = new JRadioButton("Finalizados");
		rdbtnFinalizados.setBounds(190, 70, 100, 100);
		add(rdbtnFinalizados);
		JRadioButton rdbtnData = new JRadioButton("Data");
		rdbtnData.setBounds(315, 70, 100, 100);
		add(rdbtnData);
	}
	
	private void adicionarTabelaServicos() {
		
	}

}
