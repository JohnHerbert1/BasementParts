package view;

import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import bd.OrdemServicoTabela;
import bd.Persistencia;
import dao.OrdemServicoDAO;
import dto.OrdemServiceDTO;

public class TelaListagemServicos extends TelaPadrao {
	
	
	private DefaultTableModel modelo = new DefaultTableModel();
	private JTable painel;
	private	JScrollPane painelTabela;
	
	// Construtor com métodos que irão gerar os componentes da tela.
	public TelaListagemServicos() {
		adicionarTituloTela("Listagem de Serviços");
		adicionarOpcoesFiltragem();
		adicionarBotaoDetalhar();
		adicionarTabelaServicos();
		adicionarBotaoGerarRelatorio();
		setVisible(true);
	}

	// Adicionar botão de gerar relatório.
	private void adicionarBotaoGerarRelatorio() {
		JButton btnGerarRelatorio = new JButton("Gerar Relatório");
		btnGerarRelatorio.setBounds(150, 200, 100, 150);
		add(btnGerarRelatorio);
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
		btnDetalharServico.setBounds(40, 600, 120, 60);
		btnDetalharServico.setFont(new Font("Arial", Font.BOLD, 18));
		add(btnDetalharServico);
	}
	
	// Adicionar tabela de serviços.
	private void adicionarTabelaServicos() {
		Persistencia persistir = Persistencia.getInstanci();
		persistir.escolherEstrategia(new OrdemServicoTabela());
		OrdemServicoDAO servicos = (OrdemServicoDAO) persistir.recuperar();
		
		String[] layer = {"Email Client","Caixa","Mecanico","Id","Price","Emissao","Peca comprada","TLF client","Tipo Servico","Situacao","Prioridade" };

		modelo.setColumnIdentifiers(layer);

		ArrayList<OrdemServiceDTO> todosOsServicos = servicos.getList();
		
		for (OrdemServiceDTO allServices : todosOsServicos) {
			Object[] linha = new Object[11];
			linha[0] = allServices.getClientName();
			linha[1] = allServices.getVendedorName();
			linha[2] = allServices.getMecanicoName();
			linha[3] = allServices.getIdOS();
			linha[4] = allServices.getPrice();
			linha[5] = allServices.getDataServico();
			linha[6] = allServices.getFoneNumber();
			linha[7] = allServices.getTipoOS();
			linha[8] = allServices.getSituacao();
			linha[9] = allServices.getPrioridade();

			
			modelo.addRow(linha);
		}
		
		painel = new JTable(modelo);
		painel.setBackground(Color.BLACK);
		painel.setForeground(Color.MAGENTA);
		painelTabela = new JScrollPane(painel);
		painelTabela.setBounds(32, 200, 820, 300);
		painelTabela.setBackground(Color.WHITE);
		add(painelTabela);
	}
	
}
