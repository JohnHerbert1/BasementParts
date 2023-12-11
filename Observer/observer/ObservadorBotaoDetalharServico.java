package observer;

import view.TelaDetalharProduto;
import view.TelaListagemProdutos;

public class ObservadorBotaoDetalharServico implements Observador {
	
	private TelaListagemProdutos telaListagemProdutos;
	private ObservavelBotaoDetalharProduto estado;
	
	public ObservadorBotaoDetalharServico() {
		estado.adicionarObservador(this);
	}
	
	@Override
	public void atualizar() {
		telaListagemProdutos.dispose();
		new TelaDetalharProduto();
	}
    
}
