package view;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.Font;
import bd.OrdemServicoTabela;
import bd.Persistencia;
import dao.OrdemServicoDAO;
import dto.OrdemServiceDTO;
import observer.OuvinteDetalharFuncionario;

public class TelaListagemFuncionarios extends TelaPadrao {
	
	private DefaultTableModel modelo = new DefaultTableModel();
	private JTable painel;
	private	JScrollPane painelTabela;
	
	// Construtor que agrega os componentes da tela.
	public TelaListagemFuncionarios() {
		adicionarTituloTela("Listagem de Funcionários");
		adicionarBotaoGerarRelatorio();
		adicionarBotaoDetalhar();
		adicionarTabelaFuncionarios();
		setVisible(true);
	}

	private void adicionarBotaoGerarRelatorio() {
		JButton btnGerarRelatorio = new JButton("Gerar Relatório");
		btnGerarRelatorio.setBounds(550, 595, 180, 80);
		btnGerarRelatorio.setFont(new Font("Arial", Font.BOLD, 18));
		add(btnGerarRelatorio);
	}

	private void adicionarBotaoDetalhar() {
		JButton btnDetalhar = new JButton("Detalhar");
		btnDetalhar.setBounds(150, 595, 180, 80);
		btnDetalhar.setFont(new Font("Arial", Font.BOLD, 18));
		OuvinteDetalharFuncionario ouvinteDetalharFuncionario = new OuvinteDetalharFuncionario(this);
		btnDetalhar.addActionListener(ouvinteDetalharFuncionario);
		add(btnDetalhar);
	}

	// Adicionar tabela de funcionários.
	private void adicionarTabelaFuncionarios() {
		Persistencia persistir = Persistencia.getInstanci();
		persistir.escolherEstrategia(new OrdemServicoTabela());
		OrdemServicoDAO servicos = (OrdemServicoDAO) persistir.recuperar();
		
		String[] layer = {"Nome", "ID", "Salário", "Cargo"};

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
