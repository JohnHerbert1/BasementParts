package observer;

import view.TelaDetalharProduto;
import view.TelaListagemProdutos;

public class ObservadorBotaoDetalharFuncionario implements Observador {

	private TelaListagemProdutos telaListagemProdutos;
	private ObservavelBotaoDetalharProduto estado;
	
	public ObservadorBotaoDetalharFuncionario() {
		estado.adicionar(this);
	}
	
	@Override
	public void atualizar() {
		telaListagemProdutos.dispose();
		new TelaDetalharProduto();
	}
   
}
