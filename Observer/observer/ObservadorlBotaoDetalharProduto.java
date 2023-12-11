package observer;

import view.TelaDetalharProduto;
import view.TelaListagemProdutos;

public class ObservadorlBotaoDetalharProduto implements Observador {

	private TelaListagemProdutos telaListagemProdutos;
	private ObservavelBotaoDetalharProduto estado;
	
	public ObservadorlBotaoDetalharProduto() {
		estado.adicionarObservador(this);
	}
	
	@Override
	public void atualizar() {
		telaListagemProdutos.dispose();
		new TelaDetalharProduto();
	}

}
