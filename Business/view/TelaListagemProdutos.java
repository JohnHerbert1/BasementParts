package view;

import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import bd.OrdemServicoTabela;
import bd.Persistencia;
import dao.OrdemServicoDAO;
import dto.OrdemServiceDTO;

public class TelaListagemProdutos extends TelaPadrao {
	
	private DefaultTableModel modelo = new DefaultTableModel();
	private JTable painel;
	private	JScrollPane painelTabela;

	// Construtor que vai conter componentes da listagem de produtos.
	public TelaListagemProdutos() {
		adicionarTitulo();
		adicionarDetalharProduto();
		adicionarTabelaProdutos();
		adicionarBotaoGerarRelatorio();
		setVisible(true);
	}

	// Adicionar título da tela.
	private void adicionarTitulo() {
		JLabel lblTitulo = new JLabel("Listagem de Produtos");
		lblTitulo.setBounds(340, 0, 200, 110);
		lblTitulo.setFont(new Font("Arial", Font.BOLD, 18));
		add(lblTitulo);
	}
	
	// Adicionar botão de detalhar produto 
	private void adicionarDetalharProduto() {
		JButton btnDetalharProduto = new JButton("Detalhar");
		btnDetalharProduto.setFont(new Font("Arial", Font.BOLD, 18));
		btnDetalharProduto.setBounds(100, 595, 180, 80);
		add(btnDetalharProduto);
	}
	
	// Tabela onde serão listados os produtos.
	private void adicionarTabelaProdutos() {
		Persistencia persistir = Persistencia.getInstanci();
		persistir.escolherEstrategia(new OrdemServicoTabela());
		OrdemServicoDAO servicos = (OrdemServicoDAO) persistir.recuperar();
		
		String[] layer = {"Id", "Nome", "Preco", "Montadora", "Grupo", "Nome do Cliente"};
		
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
	
	// Adicionar botão de gerar relatório de produto.
	private void adicionarBotaoGerarRelatorio() {
		JButton btnGerarRelatorio = new JButton("Gerar Relatório");
		btnGerarRelatorio.setFont(new Font("Arial", Font.BOLD, 18));
		btnGerarRelatorio.setBounds(500, 595, 180, 80);
		add(btnGerarRelatorio);
	}

}
