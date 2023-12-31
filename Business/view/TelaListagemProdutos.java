package view;

import java.awt.Color;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import bd.Persistencia;
import bd.ProdutoTabela;
import dao.ProdutoDAO;
import dto.ProdutoDTO;

public class TelaListagemProdutos extends TelaPadrao {
	
	
	private DefaultTableModel modelo = new DefaultTableModel();
	private JTable painel;
	private	JScrollPane painelTabela;
	
	// Construtor que vai conter componentes da listagem de produtos.
	public TelaListagemProdutos() {
		adicionarTituloTela("Listagem de Produtos");
		adicionarTabelaServicos();
		setVisible(true);
	}

	private void adicionarTabelaServicos() {
		Persistencia persistir = Persistencia.getInstanci();
		persistir.escolherEstrategia(new ProdutoTabela());
		ProdutoDAO servicos = (ProdutoDAO) persistir.recuperar();
		
		String[] layer = {"Nome Produto","Preco","id","Montadora","Grupo","Nome Client","Estado de Pagamento" };


		modelo.setColumnIdentifiers(layer);

		ArrayList<ProdutoDTO> todosOsServicos = servicos.getList();

		
		for (ProdutoDTO allServices : todosOsServicos) {
			Object[] linha = new Object[7];
			linha[0] = allServices.getNomeDoProduto();
			linha[1] = allServices.getPrice();
			linha[2] = allServices.getId();
			linha[3] = allServices.getMontadora();
			linha[4] = allServices.getGrupo();
			linha[5] = allServices.getNomeClient();
			linha[6] = allServices.getIsPago();

			
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
