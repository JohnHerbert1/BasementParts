package view;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class TelaListagemServicos extends TelaPadrao {
	
	// Construtor com métodos que irão gerar os componentes da tela.
	public TelaListagemServicos() {
		adicionarLabelTitulo();
		adicionarOpcoesFiltragem();
		adicionarBotaoDetalhar();
		adicionarTabelaServicos();
		setVisible(true);
	}

	// Adicionar título da tela.
	private void adicionarLabelTitulo() {
		JLabel lblTitulo = new JLabel("Listagem de Serviços");
		lblTitulo.setBounds(380, 20, 150, 100);
		add(lblTitulo);
	}
	
	// Adicionar opções de filtragem.
	private void adicionarOpcoesFiltragem() {
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
	
	// Adicionar botão de detalhar serviço.
	private void adicionarBotaoDetalhar() {
		JButton btnDetalharServico = new JButton("Detalhar");
		btnDetalharServico.setBounds(200, 300, 150, 150);
		btnDetalharServico.setFont(new Font("Arial", Font.BOLD, 18));
		add(btnDetalharServico);
	}
	
	// Adicionar tabela de serviços.
	private void adicionarTabelaServicos() {
		
	}

}
