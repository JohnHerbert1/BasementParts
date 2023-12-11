package observer;

import view.TelaDetalharProduto;
import view.TelaListagemProdutos;

public class ObservadorBotaoGerarRelatorioProduto implements Observador {
	
	private TelaListagemProdutos telaListagemProdutos;
	private ObservavelBotaoDetalharProduto estado;
	
	public ObservadorBotaoGerarRelatorioProduto() {
		estado.adicionar(this);
	}
	
	@Override
	public void atualizar() {
		telaListagemProdutos.dispose();
		new TelaDetalharProduto();
	}
    
}
