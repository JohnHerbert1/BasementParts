package observer;

import view.TelaDetalharProduto;
import view.TelaListagemProdutos;

public class ObservadorBotaoDetalharProduto implements Observadora {

	private TelaListagemProdutos telaListagemProdutos;
	
	@Override
	public void atualizar() {
		telaListagemProdutos.dispose();
		new TelaDetalharProduto();
	}

}
